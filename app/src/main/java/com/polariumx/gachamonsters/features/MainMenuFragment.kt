package com.polariumx.gachamonsters.features

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.appcompat.content.res.AppCompatResources
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import com.polariumx.gachamonsters.R
import com.polariumx.gachamonsters.databinding.FragmentMainMenuBinding
import com.polariumx.gachamonsters.features.model.MainMenuGachaStatModel
import com.polariumx.gachamonsters.features.model.MainMenuOptionModel

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
            MainMenuOptionModel("Play", ContextCompat.getDrawable(requireContext(), R.drawable.ic_baseline_play_circle)),
            MainMenuOptionModel("Team", ContextCompat.getDrawable(requireContext(), R.drawable.ic_baseline_team_option)),
            MainMenuOptionModel(
                "Inventory",
                ContextCompat.getDrawable(requireContext(), R.drawable.ic_baseline_inventory_option)
            ),
            MainMenuOptionModel("Options", ContextCompat.getDrawable(requireContext(), R.drawable.ic_baseline_settings_option)),
            MainMenuOptionModel("Exit", ContextCompat.getDrawable(requireContext(), R.drawable.ic_baseline_exit_to_app_option))
        )

        stats = arrayOf(
            MainMenuGachaStatModel("HP", 10),
            MainMenuGachaStatModel("ATK", 1),
            MainMenuGachaStatModel("DEF", 1),
            MainMenuGachaStatModel("M.ATK", 1),
            MainMenuGachaStatModel("M.DEF", 1),
            MainMenuGachaStatModel("SPEED", 1)
        )
    }

    override fun onDestroyView() {
        super.onDestroyView()
    }

    override fun onChatClicked(text: String) {
        Toast.makeText(requireContext(), text + " tapped", Toast.LENGTH_SHORT).show()
    }


}