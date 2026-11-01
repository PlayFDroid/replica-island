plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "com.replica.replicaisland"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.replica.replicaisland"
        minSdk = 24
        targetSdk = 35
        versionCode = 20
        versionName = "1.4"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

dependencies {
    // Pure Android framework - no unnecessary dependencies
}

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(17)
    }
}
