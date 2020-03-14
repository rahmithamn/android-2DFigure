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
import kotlinx.android.synthetic.main.fragment_persegi_panjang.*
import org.rmn.a2dfigure.databinding.FragmentPersegiPanjangBinding

/**
 * A simple [Fragment] subclass.
 */
class PersegiPanjangFragment : Fragment() {
    private var luasPersegiPanjang = 0;
    private var kelilingPersegiPanjang = 0;

    @SuppressLint("SetTextI18n")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding: FragmentPersegiPanjangBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_persegi_panjang, container, false)
        binding.btnHitungpersegipanjang.setOnClickListener {v: View->
            if (!TextUtils.isEmpty(et_panjang.text.toString()) && !TextUtils.isEmpty(et_lebar.text.toString())) {
                var panjang = et_panjang.text.toString().toInt()
                var lebar = et_lebar.text.toString().toInt()

                luasPersegiPanjang = panjang * lebar
                kelilingPersegiPanjang = (2 * panjang) + (2 * lebar)

                binding.tvLuaspersegipanjang.text = "Luas = $luasPersegiPanjang"
                binding.tvKelilingpersegipanjang.text = "Keliling = $kelilingPersegiPanjang"
            } else {
                Toast.makeText(this.activity, "Isian Ada yang kosong", Toast.LENGTH_SHORT).show()
            }

        }
        return binding.root
    }


}
