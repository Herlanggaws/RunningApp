package com.herlanggaws.runningapp.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.herlanggaws.runningapp.R
import com.herlanggaws.runningapp.databinding.FragmentFirstBinding
import com.herlanggaws.runningapp.databinding.FragmentSetupBinding

/**
 * Designed and developed by Herlangga Wicaksono on 23/11/23.
 * @LinkedIn (https://www.linkedin.com/in/herlangga-wicaksono-4072a5a2/)
 */
class SetupFragment: Fragment(R.layout.fragment_setup) {

	private var _binding: FragmentSetupBinding? = null
	private val binding get() = _binding!!
	override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
		super.onViewCreated(view, savedInstanceState)

		_binding = FragmentSetupBinding.bind(view)

		binding.tvContinue.setOnClickListener {
			findNavController().navigate(R.id.action_setupFragment_to_runFragment)
		}
	}

	override fun onDestroyView() {
		super.onDestroyView()
		_binding = null
	}
}