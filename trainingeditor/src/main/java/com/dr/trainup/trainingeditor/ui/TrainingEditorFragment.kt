package com.dr.trainup.trainingeditor.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import com.dr.trainup.trainingeditor.R
import com.dr.trainup.trainingeditor.TrainingEditorViewModel
import javax.inject.Inject


class TrainingEditorFragment : Fragment() {

    companion object {
        fun newInstance() = TrainingEditorFragment()
    }

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory

    private lateinit var viewModel: TrainingEditorViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.training_editor_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        // TODO: Inject vm
        // viewModel = ViewModelProviders.of(this).get(TrainingEditorViewModel::class.java)

        viewModel = ViewModelProviders.of(this, viewModelFactory)[TrainingEditorViewModel::class.java]
        viewModel.addParameter()
    }

}
