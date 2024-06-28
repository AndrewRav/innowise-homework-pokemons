package by.andrew.pokemonsworld

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.LinearLayoutManager
import by.andrew.pokemonsworld.databinding.ActivityMainBinding
import by.andrew.pokemonsworld.recyclerView.PokemonListAdapter
import by.andrew.pokemonsworld.repository.PokemonsRepository

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val adapter = PokemonListAdapter().apply {
            onClick = { pokemon ->
                val intent = Intent(this@MainActivity, DetailsActivity::class.java)
                    .apply {
                        putExtra("id", pokemon.id)
                    }
                startActivity(intent)
            }
        }

        binding.recycler.adapter = adapter

        val dividerItemDecoration = androidx.recyclerview.widget.DividerItemDecoration(
            this,
            LinearLayoutManager.VERTICAL
        )
        ContextCompat.getDrawable(this, R.drawable.divider)?.let {
            dividerItemDecoration.setDrawable(it)
        }
        binding.recycler.addItemDecoration(dividerItemDecoration)

        val pokemons = PokemonsRepository.getPokemonList()
        adapter.setItems(pokemons)
    }
}