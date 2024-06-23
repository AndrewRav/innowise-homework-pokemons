package by.andrew.pokemonsworld.recyclerView

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import by.andrew.pokemonsworld.databinding.ItemPokemonBinding
import by.andrew.pokemonsworld.model.Pokemon

class PokemonListAdapter: RecyclerView.Adapter<PokemonViewHolder>() {
    private var items = emptyList<Pokemon>()
    var onClick: (Pokemon) -> Unit = {}

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PokemonViewHolder {
        return PokemonViewHolder(ItemPokemonBinding.inflate(LayoutInflater.from(parent.context),
            parent, false))
    }

    override fun getItemCount(): Int = items.size

    override fun onBindViewHolder(holder: PokemonViewHolder, position: Int) {
        holder.bind(items[position], onClick)
    }

    fun setItems(newItems: List<Pokemon>) {
        val diffCallback = PokemonDiffCallback(items, newItems)
        val diffResult = DiffUtil.calculateDiff(diffCallback)
        items = newItems
        diffResult.dispatchUpdatesTo(this)
    }
}