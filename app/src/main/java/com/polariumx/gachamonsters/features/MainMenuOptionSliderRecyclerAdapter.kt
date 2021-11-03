package com.polariumx.gachamonsters.features

import android.graphics.drawable.Drawable
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.polariumx.gachamonsters.databinding.FragmentMainMenuOptionSliderItemBinding
import com.polariumx.gachamonsters.features.model.MainMenuOptionModel

class MainMenuOptionSliderRecyclerAdapter(
    private val options: Array<MainMenuOptionModel>,
    private val optionItemListener: OptionItemListener
) : RecyclerView
.Adapter<MainMenuOptionSliderRecyclerAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            FragmentMainMenuOptionSliderItemBinding.inflate(LayoutInflater.from(parent.context), parent, false),
            optionItemListener
        )
    }

    override fun getItemCount(): Int = options.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindView(options[position])
    }

    class ViewHolder(
        private val binding: FragmentMainMenuOptionSliderItemBinding,
        private val listener: OptionItemListener
    ) : RecyclerView.ViewHolder(binding.root) {

        fun bindView(option: MainMenuOptionModel) = with(binding) {

            fragmentMainMenuOptionSliderItemImage.setImageDrawable(option.optionDrawable)
            fragmentMainMenuOptionSliderItemImage.setOnClickListener { listener.onChatClicked(option.optionText) }
            fragmentMainMenuOptionSliderItemText.text = option.optionText
        }
    }

    interface OptionItemListener {
        fun onChatClicked(text: String)
    }
}
