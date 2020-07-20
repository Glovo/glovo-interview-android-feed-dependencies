plugins {
    id("com.android.library")
    id("kotlin-android")
    id("kotlin-kapt")
    id("kotlin-android-extensions")
}

android {
    compileSdkVersion(Config.Android.compileSdk)

    defaultConfig {
        minSdkVersion(Config.Android.minSdk)
        targetSdkVersion(Config.Android.targetSdk)
        versionCode = 1
        versionName = "1.0.0"
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = true
            proguardFile("proguard-rules.pro")
        }
    }
}

dependencies {
    api("org.mockito:mockito-core:3.2.0")
    api("org.mockito:mockito-core:3.2.0")
    api("androidx.test:runner:1.2.0")
    api("org.powermock:powermock-core:2.0.4")
    api("org.powermock:powermock-api-mockito2:2.0.4")
    api("org.powermock:powermock-module-junit4:2.0.4")
    api("org.powermock:powermock-module-junit4-rule:2.0.4")
    api("junit:junit:4.12")
    api("androidx.test.ext:junit:1.1.1")
    api("androidx.test.espresso:espresso-core:3.2.0")
}