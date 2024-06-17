package by.andrew.pokemonsworld

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import by.andrew.pokemonsworld.databinding.ActivityDetailsBinding
import by.andrew.pokemonsworld.repository.PokemonsRepository

class DetailsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonBackView.setOnClickListener {
            finish()
        }

        val pokemonId = intent.extras?.getInt("id")
        val pokemon = PokemonsRepository.getPokemonById(pokemonId)
        if (pokemon != null) {
            binding.imageView.setImageResource(pokemon.image)
            binding.nameTextView.text = pokemon.name
            binding.weightTextView.text = "${pokemon.weight} kg"
            binding.heightTextView.text = "${pokemon.height} cm"
            val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, pokemon.types)
            binding.typesListView.adapter = adapter
        } else {
            Toast.makeText(this, "Invalid pokemon id", Toast.LENGTH_SHORT).show()
            finish()
        }
    }
}