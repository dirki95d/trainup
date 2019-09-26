package com.dr.data.repositories

import com.dr.data.AppDatabase
import com.dr.data.entities.Station
import com.dr.data.entities.TrainingSet
import io.reactivex.Observable
import io.reactivex.Single
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject

class TrainingRepositoryImpl @Inject constructor(private val database: AppDatabase) :
    TrainingRepository {
    override fun getInitialTrainingSetForStation(id: Long): Observable<TrainingSet> =
        Observable.just(database.trainingSetDao().getInitialTrainingSet(id))


    override fun getStation(id: Long): Observable<Station> =
        database.stationDao().getStation(id)

    override fun getStations(): Observable<List<Station>> =
        database.stationDao().getStations()


    override fun saveStation(station: Station): Single<Long> {
        return Single.fromCallable {
            database.stationDao().insertStation(station)
        }.subscribeOn(Schedulers.io())
    }

    override fun saveSet(set: TrainingSet): Single<Long> {
        return Single.fromCallable {
            database.trainingSetDao().insertTrainingSet(set)
        }.subscribeOn(Schedulers.io())
    }
}
