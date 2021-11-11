package com.polariumx.gachamonsters.features.mainmenu

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.appcompat.content.res.AppCompatResources
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.polariumx.gachamonsters.R
import com.polariumx.gachamonsters.databinding.FragmentMainMenuBinding
import com.polariumx.gachamonsters.features.mainmenu.model.MainMenuGachaStatModel
import com.polariumx.gachamonsters.features.mainmenu.model.MainMenuOptionModel
import com.polariumx.gachamonsters.features.sampleData.sampleDataGachamonStats

class MainMenuFragment : Fragment(),
    MainMenuOptionSliderRecyclerAdapter.OptionItemListener {

    private lateinit var binding: FragmentMainMenuBinding
    private lateinit var options: Array<MainMenuOptionModel>
    private lateinit var stats: Array<MainMenuGachaStatModel>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentMainMenuBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupConfig()
        setupUI()
    }

    private fun setupUI() {
        binding.fragmentMainMenuOptionSliderRecyclerView.apply {
            setHasFixedSize(true)
            adapter = MainMenuOptionSliderRecyclerAdapter(options, this@MainMenuFragment)
        }

        binding.fragmentMainMenuGachamonstersStatsRecyclerView.apply {
            setHasFixedSize(true)
            adapter = MainMenuOptionGachamonstersStatsAdapter(stats)
        }

        binding.fragmentMainMenuGachamonstersImageView.setImageDrawable(AppCompatResources.getDrawable(requireContext(), R.drawable.mobu))

    }

    private fun setupConfig() {
        options = arrayOf(
            MainMenuOptionModel(1,"Play", ContextCompat.getDrawable(requireContext(), R.drawable.ic_baseline_play_circle)),
            MainMenuOptionModel(2,"Team", ContextCompat.getDrawable(requireContext(), R.drawable.ic_baseline_team_option)),
            MainMenuOptionModel(3,"Inventory", ContextCompat.getDrawable(requireContext(), R.drawable.ic_baseline_inventory_option)),
            MainMenuOptionModel(4,"Gachamon Store", ContextCompat.getDrawable(requireContext(), R.drawable.ic_baseline_gachamon_store_option)),
            MainMenuOptionModel(5,"Options", ContextCompat.getDrawable(requireContext(), R.drawable.ic_baseline_settings_option)),
            MainMenuOptionModel(6,"Exit", ContextCompat.getDrawable(requireContext(), R.drawable.ic_baseline_exit_to_app_option))
        )

        stats = sampleDataGachamonStats.statsGachamonNormal
    }

    override fun onItemClicked(id:Int) {
        navigate(id)
    }

    private fun navigate(id: Int){
        when(id){
            4 -> findNavController().navigate(R.id.action_FirstFragment_to_gachaStoreFragment)
        }
    }


}