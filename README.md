# NoteADay

NoteADay is a simple a simple Todo app built with Android that showcases modern Android development
practices and uses the Jetpack Compose framework. It is designed to demonstrate how to create a
fully functional Android app with a clean and organized architecture.

## Features

- Create, read, update, and delete tasks
- Task prioritization with different color codes
- Support for dark and light mode
- Persist tasks using local data storage (Room)
- Navigation between screens
- Dependency injection using Hilt
- Utilizes Kotlin Coroutines for asynchronous operations
- Uses Kotlin Flow for reactive programming
- Follows modern Android architectural patterns with ViewModel

## Technologies and Libraries Used

- [Jetpack Compose](https://developer.android.com/jetpack/compose): A modern Android UI toolkit for
  building native UIs.
- [Kotlin Coroutines](https://kotlinlang.org/docs/coroutines-overview.html): For handling
  asynchronous operations.
- [Kotlin Flow](https://kotlinlang.org/docs/flow.html): For reactive programming and data streams.
- [Android Architecture Components](https://developer.android.com/topic/libraries/architecture):
    - [Room](https://developer.android.com/training/data-storage/room): For local database
      persistence.
    - [DataStore](https://developer.android.com/topic/libraries/architecture/datastore): For
      managing app preferences.
    - [Navigation Component](https://developer.android.com/guide/navigation): For handling
      navigation within the app.
    - [ViewModel](https://developer.android.com/topic/libraries/architecture/viewmodel): For
      managing UI-related data.
- [Hilt](https://dagger.dev/hilt/): For dependency injection.

## Project Structure

The project is organized using the Model-View-ViewModel (MVVM) architecture. Here's an overview of
the main packages and their contents:

- `data`: Contains data sources, repositories, and the local database (Room).
- `di`: Contains dependency injection modules and components using Hilt.
- `ui`: Contains Composable components, screens, and the ViewModel for the UI.
- `util`: Contains utility classes and extensions.

## Getting Started

To get started with this project, follow these steps:

1. Clone the repository:

   ```shell
   git clone https://github.com/your-username/todo-app.git
   ```

2. Open the project in Android Studio.

3. Build and run the project on an Android emulator or a physical device.

## Configuration

Before running the app, you might need to configure a few things:

- Make sure you have Android Studio and the Android SDK installed.
- Check if your Android Studio is set up with Kotlin support and the latest Android Gradle Plugin.

## Demonstrate

<p align="center">
<img src="https://github.com/Shakibaenur/NoteADay/blob/master/resource/demo.mp4" width="500" height="1000" title="Keyboard State Listener">
</p>

## System Design

<p align="center">
<img src="https://github.com/Shakibaenur/NoteADay/blob/master/resource/systemdesign.gif" width="350" height="500" title="NoteADay">

</p>
## Acknowledgments

This project is based on modern Android development practices and makes use of various libraries and
tools. Thanks to the open-source community and Google for providing these resources.

