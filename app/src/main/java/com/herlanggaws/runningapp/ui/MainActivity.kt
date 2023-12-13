package com.herlanggaws.runningapp.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.view.View
import androidx.activity.viewModels
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.herlanggaws.runningapp.R
import com.herlanggaws.runningapp.databinding.ActivityMainBinding
import com.herlanggaws.runningapp.db.RunDAO
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding) {

            bottomNav.setupWithNavController(findNavController(R.id.nav_host_fragment_content_main))
            findNavController(R.id.nav_host_fragment_content_main)
                .addOnDestinationChangedListener {_, destination, _ ->
                    when(destination.id) {
                        R.id.settingsFragment, R.id.runFragment, R.id.statisticFragment -> bottomNav.visibility = View.VISIBLE
                        else -> bottomNav.visibility = View.GONE
                    }
                }
        }


    }
}