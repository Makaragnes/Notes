// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.jetbrains.kotlin.android) apply false

    //id("com.android.application") version "8.2.2" apply false
//    id("org.jetbrains.kotlin.android") version "1.9.10" apply false
//
    kotlin("kapt") version "1.9.10"
    id("com.google.dagger.hilt.android") version "2.48" apply false
//
//    id("io.realm.kotlin") version "1.11.0" apply false
}