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
        minSdkVersion(13)
    }

    compileSdkVersion(29)
    buildToolsVersion = "29.0.3"


    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}
