package by.andrew.pokemonsworld

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import by.andrew.pokemonsworld.databinding.ActivityDetailsBinding
import by.andrew.pokemonsworld.recyclerView.TypesAdapter
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
        pokemon?.let {
            binding.imageView.setImageResource(pokemon.imageRes)
            binding.nameTextView.text = pokemon.name
            binding.weightTextView.text = "${pokemon.weight} kg"
            binding.heightTextView.text = "${pokemon.height} cm"
            val adapter = TypesAdapter(pokemon.types)
            binding.typesRecyclerView.layoutManager = LinearLayoutManager(this)
            binding.typesRecyclerView.adapter = adapter
        } ?: run {
            Toast.makeText(this, "Invalid pokemon id", Toast.LENGTH_SHORT).show()
            finish()
        }
    }
}