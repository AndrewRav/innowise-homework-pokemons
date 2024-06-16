package by.andrew.pokemonsworld

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import by.andrew.pokemonsworld.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupClickListener(binding.bulbasaur, 1)
        setupClickListener(binding.ivynsaur, 2)
        setupClickListener(binding.venusaur, 3)
        setupClickListener(binding.charmander, 4)
        setupClickListener(binding.charmeleon, 5)
        setupClickListener(binding.charizard, 6)
        setupClickListener(binding.squirtle, 7)
    }
    private fun setupClickListener(view: View, id: Int) {
        view.setOnClickListener {
            val intent = Intent(this@MainActivity, DetailsActivity::class.java).apply {
                putExtra("id", id)
            }
            startActivity(intent)
        }
    }
}