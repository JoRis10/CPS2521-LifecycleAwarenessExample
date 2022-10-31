package cps251.jcrisner.lifecycleawarenessexample.ui.main

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    companion object{
        var logOutput = MutableLiveData<String>("")
        fun updateOutput(logUpdate: String){
            logOutput.value += logUpdate
        }
    }


}