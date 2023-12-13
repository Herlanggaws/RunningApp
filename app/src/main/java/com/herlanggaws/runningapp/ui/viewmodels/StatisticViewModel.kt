package com.herlanggaws.runningapp.ui.viewmodels

import androidx.lifecycle.ViewModel
import com.herlanggaws.runningapp.repositories.MainRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

/**
 * Designed and developed by Herlangga Wicaksono on 23/11/23.
 * @LinkedIn (https://www.linkedin.com/in/herlangga-wicaksono-4072a5a2/)
 */

@HiltViewModel
class StatisticViewModel @Inject constructor(
	val mainRepository: MainRepository
) : ViewModel() {
	fun a() {}
}