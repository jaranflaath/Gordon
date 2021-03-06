plugins {
    id("com.android.library")
    kotlin("android")
    id("org.jmailen.kotlinter")
    //id("com.banno.gordon") version "localVersion"
}

android {
    compileSdkVersion(29)
    buildToolsVersion("29.0.3")
    defaultConfig {
        minSdkVersion(21)
        targetSdkVersion(29)
        versionCode = 1
        versionName = "1.0"
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }
    flavorDimensions("foo")
    productFlavors {
        register("bar") {
            dimension = "foo"
        }
        register("baz") {
            dimension = "foo"
            testInstrumentationRunnerArgument("notAnnotation", "org.junit.Test")
        }
    }
}

repositories {
    google()
    mavenCentral()
}

dependencies {
    implementation("androidx.appcompat:appcompat:1.2.0")
    androidTestImplementation("androidx.test:runner:1.3.0")
}
