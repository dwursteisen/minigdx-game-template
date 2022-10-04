plugins {
    id("com.android.application")
    id("com.github.minigdx.android")
}

dependencies {
    implementation(project(":common"))
}

// Configure Android
android {
    defaultConfig {
        minSdk = 21
    }

    compileSdk = 31

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}
