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
        versionCode = 192
        versionName = "1.0.7"
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
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk7:1.3.61")
    implementation("androidx.appcompat:appcompat:1.1.0")
    implementation("androidx.core:core-ktx:1.2.0")

    implementation("androidx.recyclerview:recyclerview:1.1.0")
    implementation("androidx.cardview:cardview:1.0.0")
    implementation("androidx.constraintlayout:constraintlayout:1.1.3")
    implementation("androidx.constraintlayout:constraintlayout-solver:1.1.3")

    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.3.2")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.3.2")

    implementation("io.reactivex.rxjava2:rxjava:2.2.15")
    implementation("io.reactivex.rxjava2:rxandroid:2.1.1")
    implementation("io.reactivex.rxjava2:rxkotlin:2.4.0")

    testImplementation("org.mockito:mockito-core:3.2.0")
    androidTestImplementation("org.mockito:mockito-core:3.2.0")

    androidTestImplementation("androidx.test:runner:1.2.0")

    testImplementation("org.powermock:powermock-core:2.0.4")
    testImplementation("org.powermock:powermock-api-mockito2:2.0.4")
    testImplementation("org.powermock:powermock-module-junit4:2.0.4")
    testImplementation("org.powermock:powermock-module-junit4-rule:2.0.4")
    testImplementation("junit:junit:4.12")
    androidTestImplementation("androidx.test.ext:junit:1.1.1")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.2.0")

}