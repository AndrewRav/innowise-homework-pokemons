package by.andrew.pokemonsworld

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import by.andrew.pokemonsworld.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.bulbasaur.setOnClickListener {
            val intent = Intent(this@MainActivity, DetailsActivity::class.java).apply {
                putExtra("id", 1)
            }
            startActivity(intent)
        }
        binding.ivynsaur.setOnClickListener {
            val intent = Intent(this@MainActivity, DetailsActivity::class.java).apply {
                putExtra("id", 2)
            }
            startActivity(intent)
        }
        binding.venusaur.setOnClickListener {
            val intent = Intent(this@MainActivity, DetailsActivity::class.java).apply {
                putExtra("id", 3)
            }
            startActivity(intent)
        }
        binding.charmander.setOnClickListener {
            val intent = Intent(this@MainActivity, DetailsActivity::class.java).apply {
                putExtra("id", 4)
            }
            startActivity(intent)
        }
        binding.charmeleon.setOnClickListener {
            val intent = Intent(this@MainActivity, DetailsActivity::class.java).apply {
                putExtra("id", 5)
            }
            startActivity(intent)
        }
        binding.charizard.setOnClickListener {
            val intent = Intent(this@MainActivity, DetailsActivity::class.java).apply {
                putExtra("id", 6)
            }
            startActivity(intent)
        }
        binding.squirtle.setOnClickListener {
            val intent = Intent(this@MainActivity, DetailsActivity::class.java).apply {
                putExtra("id", 7)
            }
            startActivity(intent)
        }
    }
}