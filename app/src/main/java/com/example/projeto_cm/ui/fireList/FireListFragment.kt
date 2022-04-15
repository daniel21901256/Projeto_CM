package com.example.projeto_cm.ui.fireList

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ListAdapter
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.projeto_cm.R
import com.example.projeto_cm.databinding.FragmentFireListBinding

class FireListFragment : Fragment() {

    private var _binding: FragmentFireListBinding? = null

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View {

        var view: View = inflater.inflate(R.layout.fragment_fire_list,container,false)
        //var recyclerView: RecyclerView = view.findViewById(R.id.recyclerView)
        //recyclerView.layoutManager = LinearLayoutManager(this.context)
        //recyclerView.adapter = FireListAdapter()
        return view
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}