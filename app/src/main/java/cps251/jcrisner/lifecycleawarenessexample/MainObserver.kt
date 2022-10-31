package cps251.jcrisner.lifecycleawarenessexample

import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.OnLifecycleEvent
import androidx.lifecycle.LifecycleOwner
import android.util.Log
import androidx.lifecycle.LifecycleEventObserver
import java.time.Instant
import java.time.format.DateTimeFormatter
import cps251.jcrisner.lifecycleawarenessexample.ui.main.MainViewModel
import java.sql.Timestamp
import java.util.Date

class MainObserver: LifecycleObserver {

    private lateinit var currentEvent: String

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    fun onResume(){
        currentEvent = "onResume"
    }
    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    fun onPause(){
        currentEvent = "onPause"
    }
    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    fun onCreate(){
        currentEvent = "onCreate"
    }
    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    fun onStart(){
        currentEvent = "onStart"
    }
    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    fun onStop(){
        currentEvent = "onStop"
    }
    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    fun onDestroy(){
        currentEvent = "onDestroy"
    }
    @OnLifecycleEvent(Lifecycle.Event.ON_ANY)
    fun onAny(owner: LifecycleOwner){
        val currentTime = Timestamp(System.currentTimeMillis())
        MainViewModel.updateOutput("$currentEvent was fired on $currentTime\n")
        if(owner.lifecycle.currentState.isAtLeast(Lifecycle.State.STARTED)){
            MainViewModel.updateOutput("*******\n")
        }
    }

}