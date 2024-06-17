package by.andrew.pokemonsworld.repository

import by.andrew.pokemonsworld.R
import by.andrew.pokemonsworld.model.Pokemon

object PokemonsRepository {
    private val pokemons: HashMap<Int, Pokemon> = hashMapOf(
        1 to Pokemon(
            id = 1,
            name = "Bulbasaur",
            types = listOf("Grass", "Poison"),
            weight = 69,
            height = 7,
            image = R.drawable.bulbasaur
        ),
        2 to Pokemon(
            id = 2,
            name = "Ivynsaur",
            types = listOf("Grass", "Poison"),
            weight = 130,
            height = 10,
            image = R.drawable.ivynsaur
        ),
        3 to Pokemon(
            id = 3,
            name = "Venusaur",
            types = listOf("Grass", "Poison"),
            weight = 1000,
            height = 20,
            image = R.drawable.venusaur
        ),
        4 to Pokemon(
            id = 4,
            name = "Charmander",
            types = listOf("Fire"),
            weight = 85,
            height = 6,
            image = R.drawable.charmander
        ),
        5 to Pokemon(
            id = 5,
            name = "Charmeleon",
            types = listOf("Fire"),
            weight = 190,
            height = 11,
            image = R.drawable.charmeleon
        ),
        6 to Pokemon(
            id = 6,
            name = "Charizard",
            types = listOf("Fire", "Flying"),
            weight = 905,
            height = 17,
            image = R.drawable.charizard
        ),
        7 to Pokemon(
            id = 7,
            name = "Squirtle",
            types = listOf("Water"),
            weight = 90,
            height = 5,
            image = R.drawable.squirtle
        )
    )

    fun getPokemonById(id: Int?): Pokemon? {
        return pokemons[id]
    }
}