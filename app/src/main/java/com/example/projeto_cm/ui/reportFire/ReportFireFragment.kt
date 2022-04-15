package com.example.projeto_cm.ui.reportFire

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.projeto_cm.databinding.FragmentReportFireBinding

class ReportFireFragment : Fragment() {

    private var _binding: FragmentReportFireBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View {
        val reportFireViewModel =
                ViewModelProvider(this).get(ReportFireViewModel::class.java)

        _binding = FragmentReportFireBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textReportFire
        reportFireViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}