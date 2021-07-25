object Releases {
    val versionCode = 1
    val versionName = "1.0.0"
}

object Versions {
    val compileSdk = 31
    val targetSdk = 31
    val minSdk = 28
    val kotlinGradle = "1.5.10"
    val kotlin = "1.5.10"
    val buildGradle = "7.0.0-rc01"
    val compose = "1.0.0-rc02"
    val core = "1.6.0"
    val appCompat = "1.3.1"
    val materialDesign ="1.4.0"
    val lifecycle ="2.3.1"
    val composeActivity = "1.3.0-rc02"
}

object Deps {
    val gradle = DepsGradle
    val androidx = DepsAndroid
    val compose = DepsCompose
}
object DepsGradle{
    val kotlinGradle = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlinGradle}"
    val buildGradle = "com.android.tools.build:gradle:${Versions.buildGradle}"
}
object DepsAndroid{
    val core  = "androidx.core:core-ktx:${Versions.core}"
    val appcompat ="androidx.appcompat:appcompat:${Versions.appCompat}"
    val material = "com.google.android.material:material:${Versions.materialDesign}"
    val lifecycle = "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.lifecycle}"
}
object DepsCompose{
    val ui =  "androidx.compose.ui:ui:${Versions.compose}"
    val material = "androidx.compose.material:material:${Versions.compose}"
    val preview = "androidx.compose.ui:ui-tooling-preview:${Versions.compose}"
    val activity = "androidx.activity:activity-compose:${Versions.composeActivity}"
    val debug  = "androidx.compose.ui:ui-tooling:${Versions.compose}"
}
