plugins {
    id("com.github.minigdx.common")
}

minigdx {
    version.set(libs.versions.minigdx.get())
}

android {
    defaultConfig {
        minSdk = 21
    }

    compileSdk = 29

    sourceSets.getByName("main") {
        manifest.srcFile("src/androidMain/AndroidManifest.xml")
        assets.srcDirs("src/commonMain/resources")
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    kotlinOptions {
        jvmTarget = JavaVersion.VERSION_1_8.toString()
    }
}
