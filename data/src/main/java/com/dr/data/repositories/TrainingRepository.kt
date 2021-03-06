package com.dr.data.repositories

import com.dr.data.entities.Station
import com.dr.data.entities.StationWithTrainingSet
import com.dr.data.entities.TrainingSet
import io.reactivex.Completable
import io.reactivex.Observable
import io.reactivex.Single

interface TrainingRepository {

    fun getStations(): Observable<List<Station>>

    fun getFirstStation(): Observable<Station>

    suspend fun saveStation(station: Station): Long

    fun getStation(id: Long): Observable<Station>

    fun deleteStation(id: Long): Completable

    fun saveSet(set: TrainingSet): Single<Long>

    fun getInitialTrainingSetForStation(id: Long): Observable<TrainingSet>
    fun getTrainingSetsForActualTraining(stationId: Long): Observable<List<TrainingSet>>

    fun getStationsWithLatestEditedTrainingSet(): Observable<List<StationWithTrainingSet>>
    suspend fun getStationsWithTrainingSets(): List<StationWithTrainingSet>
}
