package com.polariumx.gachamonsters.features.gachastore

import android.graphics.drawable.Drawable
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.core.content.res.ResourcesCompat
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
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

    private fun setupUI() {
        binding.fragmentGachamonStoreExitButton.setOnClickListener(View.OnClickListener {
            findNavController().navigateUp()
        })
        binding.fragmentGachamonStorePermaImage.setOnClickListener {
            binding.fragmentGachamonStoreChosenBannerImage.setImageResource(R.drawable.perma_banner_image)
        }
        binding.fragmentGachamonStorePromoImage.setOnClickListener {
            binding.fragmentGachamonStoreChosenBannerImage.setImageResource(R.drawable.promo_banner_image)
        }
    }
}