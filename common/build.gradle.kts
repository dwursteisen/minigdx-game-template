plugins {
    id("com.github.minigdx.common")
}

minigdx {
    version.set(libs.versions.minigdx.get())
}

android {
    defaultConfig {
        minSdkVersion(13)
    }

    compileSdkVersion(29)
    buildToolsVersion = "29.0.3"

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
