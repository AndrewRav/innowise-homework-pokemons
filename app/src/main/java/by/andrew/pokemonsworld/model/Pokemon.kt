package by.andrew.pokemonsworld.model

import androidx.annotation.DrawableRes

data class Pokemon(
    val id: Int,
    val name: String,
    val types: List<String>,
    val weight: Int,
    val height: Int,
    @DrawableRes val imageRes: Int
)
