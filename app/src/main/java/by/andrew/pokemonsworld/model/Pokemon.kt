package by.andrew.pokemonsworld.model

data class Pokemon(
    val id: Int,
    val name: String,
    val types: List<String>,
    val weight: Int,
    val height: Int,
    val image: Int
)
