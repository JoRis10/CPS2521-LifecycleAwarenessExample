package cps251.jcrisner.lifecycleawarenessexample.ui.main

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import cps251.jcrisner.lifecycleawarenessexample.R
import cps251.jcrisner.lifecycleawarenessexample.MainObserver
import cps251.jcrisner.lifecycleawarenessexample.databinding.FragmentMainBinding

class MainFragment : Fragment() {

    private var _binding: FragmentMainBinding? = null
    private val binding get() = _binding!!

    private lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        super.onCreateView(inflater, container, savedInstanceState)
        _binding = FragmentMainBinding.inflate(inflater, container, false)
        lifecycle.addObserver(MainObserver())
        binding.outputLogMessage.setText(MainViewModel.logOutput.value)
        return binding.root
    }

}