package com.herlanggaws.runningapp.ui.fragments

import android.graphics.Bitmap
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
class RunFragment : Fragment(R.layout.fragment_run) {

	private val viewModel: MainViewModel by viewModels()

	private var hashMap = HashMap<String,Int>()

}

class ImageCache(capacity: Int) {
	private val cache2: LinkedHashMap<Int, Int> = object : LinkedHashMap<Int, Int>(capacity, 0.75f, true) {
		override fun removeEldestEntry(eldest: MutableMap.MutableEntry<Int, Int>?): Boolean {
			return size > capacity
		}
	}
	private val cache: LinkedHashMap<Int, Int> = object : LinkedHashMap<Int, Int>(capacity, 0.75f, true) {
		override fun removeEldestEntry(eldest: MutableMap.MutableEntry<Int, Int>?): Boolean {
			return size > capacity
		}
	}


	private val cache3  = object : LinkedHashMap<String, Bitmap>(capacity, 0.75f, true) {
		override fun removeEldestEntry(eldest: MutableMap.MutableEntry<String, Bitmap>?): Boolean {
			return size> capacity
		}
	}

	fun get(key: String) : Bitmap? {
		return cache3.getOrDefault(key, null)
	}

	fun put(key: String, value: Bitmap) {
		cache3[key] = value
	}
}