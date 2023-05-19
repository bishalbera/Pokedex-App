<h1 align="center">Pokedex</h1>

<p align="center">  
🗡️ Pokedex demonstrates modern Android development with Hilt, Coroutines, Flow, Jetpack (Room, ViewModel), and Material Design based on MVVM architecture.
</p>
</br>

![WhatsApp Image 2023-05-19 at 12 18 08](https://github.com/bishalbera/Pokedex-App/assets/123734227/917a988f-432f-4d58-8a91-a79c38aca85d)

![WhatsApp Image 2023-05-19 at 12 18 08](https://github.com/bishalbera/Pokedex-App/assets/123734227/46b3a51e-508a-4001-9b33-f3892efc639c)


https://github.com/bishalbera/Pokedex-App/assets/123734227/aac6a79e-eac1-44b1-a821-b6e9540f2480

## Tech stack & Open-source libraries
- Minimum SDK level 21
- [Kotlin](https://kotlinlang.org/) based, [Coroutines](https://github.com/Kotlin/kotlinx.coroutines) + [Flow](https://kotlin.github.io/kotlinx.coroutines/kotlinx-coroutines-core/kotlinx.coroutines.flow/) for asynchronous.
- Jetpack
  - Lifecycle: Observe Android lifecycles and handle UI states upon the lifecycle changes.
  - ViewModel: Manages UI-related data holder and lifecycle aware. Allows data to survive configuration changes such as screen rotations.
  - DataBinding: Binds UI components in your layouts to data sources in your app using a declarative format rather than programmatically.
  - Room: Constructs Database by providing an abstraction layer over SQLite to allow fluent database access.
  - [Hilt](https://dagger.dev/hilt/): for dependency injection.
- Architecture
  - MVVM Architecture (View - DataBinding - ViewModel - Model)
- [Retrofit2 & OkHttp3](https://github.com/square/retrofit): Construct the REST APIs and paging network data.
- [Material-Components](https://github.com/material-components/material-components-android): Material design components for building ripple animation, and CardView.

## Open API

<img src="https://user-images.githubusercontent.com/24237865/83422649-d1b1d980-a464-11ea-8c91-a24fdf89cd6b.png" align="right" width="21%"/>

Pokedex using the [PokeAPI](https://pokeapi.co/) for constructing RESTful API.<br>
PokeAPI provides a RESTful API interface to highly detailed objects built from thousands of lines of data related to Pokémon.
