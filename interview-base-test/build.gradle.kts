plugins {
    id("com.android.library")
    id("kotlin-android")
    id("kotlin-kapt")
    id("kotlin-android-extensions")
}

android {
    compileSdkVersion(29)

    defaultConfig {
        minSdkVersion(21)
        targetSdkVersion(29)
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
    testApi("junit:junit:4.13")
    testApi("androidx.test:core:1.2.0")
    testApi("org.mockito:mockito-core:3.3.3")

    testApi("org.powermock:powermock-api-mockito:1.6.2")
    testApi("org.powermock:powermock-module-junit4-rule-agent:1.6.2")
    testApi("org.powermock:powermock-module-junit4-rule:2.0.7")
    testApi("org.powermock:powermock-module-junit4:2.0.7")
}
