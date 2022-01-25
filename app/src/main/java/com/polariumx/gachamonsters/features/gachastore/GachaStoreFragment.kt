package com.polariumx.gachamonsters.features.gachastore

import android.graphics.drawable.Drawable
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.navigation.fragment.findNavController
import com.bumptech.glide.Glide
import com.polariumx.gachamonsters.R
import com.polariumx.gachamonsters.databinding.FragmentGachaStoreBinding

class GachaStoreFragment : Fragment() {

    private lateinit var binding: FragmentGachaStoreBinding;

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentGachaStoreBinding.inflate(layoutInflater);
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupUI()
    }

    private fun setupUI(){
        binding.fragmentGachamonStoreExitButton.setOnClickListener(View.OnClickListener {
            findNavController().navigateUp()
        })
        binding.fragmentGachamonStorePermaImage.setOnClickListener {
            changeSrc(ContextCompat.getColor(requireContext(),R.color.red))
        }
        binding.fragmentGachamonStorePromoImage.setOnClickListener {
            changeSrc(ContextCompat.getColor(requireContext(),R.color.blue))
        }
    }

    private fun changeSrc(tintColor : Int){
        binding.fragmentGachamonStoreChosenBannerImage.setColorFilter(tintColor);
    }
}