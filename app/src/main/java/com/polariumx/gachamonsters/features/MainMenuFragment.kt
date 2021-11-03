package com.polariumx.gachamonsters.features

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.res.ResourcesCompat
import androidx.fragment.app.Fragment
import com.polariumx.gachamonsters.R
import com.polariumx.gachamonsters.databinding.FragmentMainMenuBinding
import com.polariumx.gachamonsters.features.model.MainMenuOptionModel

class MainMenuFragment : Fragment() {

    private lateinit var binding: FragmentMainMenuBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentMainMenuBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)



    }

    fun setupUI(){
//        binding.fragmentMainMenuOptionSliderRecyclerView.adapter =
    }

    override fun onDestroyView() {
        super.onDestroyView()
    }

//    private val options: Array<MainMenuOptionModel> {
//        MainMenuOptionModel("Helo", ResourcesCompat.getDrawable(resources, R.drawable.ic_baseline_play_circle_filled_24))
//    }
}