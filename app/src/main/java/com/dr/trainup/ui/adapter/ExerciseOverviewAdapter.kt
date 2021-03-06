package com.dr.trainup.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.dr.data.entities.Station
import com.dr.trainup.R
import com.dr.trainup.databinding.ItemExcerciseBinding
import com.dr.trainup.ui.vm.ExerciseOverviewItemVM

class ExerciseOverviewAdapter(
    private val exercises: List<ExerciseOverviewItemVM>
) :
    RecyclerView.Adapter<ExerciseOverviewAdapter.ExerciseViewHolder>() {

    private val selectedItems = listOf<Station>()

    override fun getItemCount(): Int = exercises.size


    override fun onBindViewHolder(holder: ExerciseViewHolder, position: Int) {
        holder.binding.viewModel = exercises[position]
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ExerciseViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.item_excercise, parent, false)
        return ExerciseViewHolder(view)
    }


    class ExerciseViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val binding: ItemExcerciseBinding = ItemExcerciseBinding.bind(itemView)
    }
}
