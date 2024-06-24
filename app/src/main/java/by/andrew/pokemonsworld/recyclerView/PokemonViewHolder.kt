package by.andrew.pokemonsworld.recyclerView

import androidx.recyclerview.widget.RecyclerView.ViewHolder
import by.andrew.pokemonsworld.databinding.ItemPokemonBinding
import by.andrew.pokemonsworld.model.Pokemon

class PokemonViewHolder(
    private val binding: ItemPokemonBinding
): ViewHolder(binding.root) {

    fun bind (model: Pokemon, onClick: (Pokemon) -> Unit) {
        binding.pokemonName.text = model.name
        binding.root.setOnClickListener {
            onClick(model)
        }
    }
}