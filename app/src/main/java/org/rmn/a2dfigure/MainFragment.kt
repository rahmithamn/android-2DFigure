package org.rmn.a2dfigure


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import org.rmn.a2dfigure.databinding.FragmentMainBinding

/**
 * A simple [Fragment] subclass.
 */
class MainFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding: FragmentMainBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_main, container, false)
        binding.btnPersegipanjang.setOnClickListener { v: View ->
            v.findNavController().navigate(R.id.action_mainFragment_to_persegiPanjangFragment)

        }
        binding.btnSegitiga.setOnClickListener { v: View ->
            v.findNavController().navigate(R.id.action_mainFragment_to_segitigaFragment)
        }
        return binding.root
    }


}
