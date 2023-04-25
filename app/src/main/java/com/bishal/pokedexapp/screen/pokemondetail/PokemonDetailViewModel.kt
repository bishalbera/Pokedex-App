package com.bishal.pokedexapp.screen.pokemondetail

import androidx.lifecycle.ViewModel
import com.bishal.pokedexapp.model.Pokemon
import com.bishal.pokedexapp.repository.PokemonRepository
import com.bishal.pokedexapp.util.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class PokemonDetailViewModel @Inject constructor(
    private val repository: PokemonRepository): ViewModel() {

        suspend fun getPokemonInfo(pokemonName: String): Resource<Pokemon> {
            return repository.getPokemonInfo(pokemonName)
        }
}