package com.herlanggaws.runningapp.ui.fragments

import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.herlanggaws.runningapp.R
import com.herlanggaws.runningapp.ui.MainViewModel
import dagger.hilt.android.AndroidEntryPoint

/**
 * Designed and developed by Herlangga Wicaksono on 23/11/23.
 * @LinkedIn (https://www.linkedin.com/in/herlangga-wicaksono-4072a5a2/)
 */

@AndroidEntryPoint
class TrackingFragment: Fragment(R.layout.fragment_tracking) {
	private val viewModel: MainViewModel by viewModels()
}