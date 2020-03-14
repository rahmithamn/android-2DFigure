package org.rmn.a2dfigure


import android.annotation.SuppressLint
import android.os.Bundle
import android.text.TextUtils
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import kotlinx.android.synthetic.main.fragment_segitiga.*
import org.rmn.a2dfigure.databinding.FragmentSegitigaBinding

/**
 * A simple [Fragment] subclass.
 */
class SegitigaFragment : Fragment() {
    private var luasSegitiga = 0.0
    private var kelilingSegitiga = 0.0

    @SuppressLint("SetTextI18n")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding: FragmentSegitigaBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_segitiga, container, false)
        binding.btnHitungsegitiga.setOnClickListener { v:View->
            if (!TextUtils.isEmpty(et_alas.text.toString()) && !TextUtils.isEmpty(et_tinggi.text.toString())) {
                var alas = et_alas.text.toString().toDouble()
                var tinggi = et_tinggi.text.toString().toDouble()

                var alasSquare = alas * alas
                var tinggiSquare = tinggi * tinggi

                var cariSisiMiring = alasSquare + tinggiSquare


                luasSegitiga = (alas * tinggi) / 2
                kelilingSegitiga = Math.sqrt(cariSisiMiring) + alas + tinggi

                binding.tvLuassegitiga.text= "Luas = $luasSegitiga"
                binding.tvKelilingsegitiga.text = "Keliling = $kelilingSegitiga"
            }else {
                Toast.makeText(this.activity, "Isian ada yang kosong", Toast.LENGTH_SHORT).show()
            }

        }
        return binding.root
    }


}
