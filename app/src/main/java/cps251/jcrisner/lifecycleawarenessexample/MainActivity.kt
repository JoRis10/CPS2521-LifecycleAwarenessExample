package cps251.jcrisner.lifecycleawarenessexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import cps251.jcrisner.lifecycleawarenessexample.databinding.ActivityMainBinding
import cps251.jcrisner.lifecycleawarenessexample.ui.main.MainFragment

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}