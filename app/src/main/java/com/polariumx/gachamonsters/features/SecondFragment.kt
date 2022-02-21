package com.polariumx.gachamonsters.features

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.polariumx.gachamonsters.R
import com.polariumx.gachamonsters.databinding.FragmentGachaStoreBinding
import com.polariumx.gachamonsters.databinding.FragmentMainMenuBinding
import com.polariumx.gachamonsters.databinding.FragmentSecondBinding
import com.polariumx.gachamonsters.features.mainmenu.model.MainMenuGachaStatModel
import com.polariumx.gachamonsters.features.mainmenu.model.MainMenuOptionModel

class SecondFragment : Fragment() {

    private lateinit var binding: FragmentGachaStoreBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentGachaStoreBinding.inflate(inflater, container, false)
        return binding.root
    }

    private fun setupUI(){

    }
}