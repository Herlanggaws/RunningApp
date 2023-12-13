package com.herlanggaws.runningapp.ui.fragments

import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.herlanggaws.runningapp.R
import com.herlanggaws.runningapp.ui.MainViewModel
import com.herlanggaws.runningapp.ui.viewmodels.StatisticViewModel
import dagger.hilt.android.AndroidEntryPoint

/**
 * Designed and developed by Herlangga Wicaksono on 23/11/23.
 * @LinkedIn (https://www.linkedin.com/in/herlangga-wicaksono-4072a5a2/)
 */

@AndroidEntryPoint
class StatisticFragment: Fragment(R.layout.fragment_statistic) {

	private val viewModel: StatisticViewModel by viewModels()
}