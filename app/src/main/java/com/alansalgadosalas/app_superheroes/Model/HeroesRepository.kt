package com.alansalgadosalas.app_superheroes
import com.alansalgadosalas.app_superheroes.Model.Hero

object HeroesRepository{
    val heroes = listOf(
        Hero(
            nombre = R.string.hero1,
            descripcion = R.string.description1,
            imagen = R.drawable.ic_launcher_foreground
        ),
        Hero(
            nombre = R.string.hero2,
            descripcion = R.string.description2,
            imagen = R.drawable.ic_launcher_foreground
        ),
        Hero(
            nombre = R.string.hero3,
            descripcion = R.string.description3,
            imagen = R.drawable.ic_launcher_foreground
        ),
        Hero(
            nombre = R.string.hero4,
            descripcion = R.string.description4,
            imagen = R.drawable.ic_launcher_foreground
        ),
        Hero(
            nombre = R.string.hero5,
            descripcion = R.string.description5,
            imagen = R.drawable.ic_launcher_foreground
        ),
        Hero(
            nombre = R.string.hero6,
            descripcion = R.string.description6,
            imagen = R.drawable.ic_launcher_foreground
        )
    )
}