package com.polariumx.gachamonsters.features

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.polariumx.gachamonsters.databinding.FragmentMainMenuGachamonstersStatsItemBinding
import com.polariumx.gachamonsters.features.model.MainMenuGachaStatModel
import com.polariumx.gachamonsters.features.model.MainMenuOptionModel

class MainMenuOptionGachamonstersStatsAdapter(
    private val stats: Array<MainMenuGachaStatModel>,
) : RecyclerView
.Adapter<MainMenuOptionGachamonstersStatsAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            FragmentMainMenuGachamonstersStatsItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        )
    }

    override fun getItemCount(): Int = stats.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindView(stats[position])
    }

    class ViewHolder(
        private val binding: FragmentMainMenuGachamonstersStatsItemBinding,
    ) : RecyclerView.ViewHolder(binding.root) {

        fun bindView(stat: MainMenuGachaStatModel) = with(binding) {

            fragmentMainMenuGachamonstersStatsNameItemText.text = stat.statName
            fragmentMainMenuGachamonstersStatsValueItemText.text = stat.statValue.toString()
        }
    }

}
