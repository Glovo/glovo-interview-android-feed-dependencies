import org.gradle.api.artifacts.dsl.DependencyHandler
import org.gradle.kotlin.dsl.kotlin

const val kotlinVersion = "1.3.72"

val DependencyHandler.kotlinStdlib get() = kotlin("stdlib-jdk8", version = kotlinVersion)

object Config {

    object Versions {
        const val recyclerView = "1.1.0"
        const val cardView = "1.0.0"
        const val constraintLayout = "1.1.3"

        const val rxJava = "2.2.19"
        const val rxKotlin = "2.4.0"
        const val rxAndroid = "2.1.1"

        const val coroutinesCore = "1.3.2"
        const val coroutinesAndroid = "1.3.2"

        const val junit = "4.13"
        const val robolectric = "4.3.1"
        const val mockito = "3.3.3"
        const val mockk = "1.10.0"
        const val testOrchestrator = "1.2.0"
        const val jacoco = "0.8.3"
        const val testEspresso = "3.2.0"
        const val fragmentTesting = "1.2.2"
        const val androidXTest = "1.2.0"
        const val androidXJUnit = "1.1.1"
        const val wireMock = "2.26.3" // 2.27.0 breaks on Android
        const val apacheClientAndroid = "4.3.5.1"
        const val rxIdler = "0.11.0"
        const val archCore = "2.1.0"
    }

    object Android {
        const val minSdk = 21
        const val compileSdk = 29
        const val targetSdk = compileSdk
    }

    object Testing {
        const val junit = "junit:junit:${Versions.junit}"
        const val mockitoCore = "org.mockito:mockito-core:${Versions.mockito}"
        const val mockk = "io.mockk:mockk:${Versions.mockk}"

        const val fragmentTesting = "androidx.fragment:fragment-testing:${Versions.fragmentTesting}"
        const val robolectric = "org.robolectric:robolectric:${Versions.robolectric}"

        const val androidXTestRules = "androidx.test:rules:${Versions.androidXTest}"
        const val androidXTestJunitKtx = "androidx.test.ext:junit-ktx:${Versions.androidXJUnit}"
        const val androidXTestEspresso = "androidx.test.espresso:espresso-contrib:${Versions.testEspresso}"
        const val androidXTestEspressoIntents = "androidx.test.espresso:espresso-intents:${Versions.testEspresso}"
        const val androidXTestOrchestrator = "androidx.test:orchestrator:${Versions.testOrchestrator}"
        const val androidXTestArch = "androidx.arch.core:core-testing:${Versions.archCore}"
        const val wireMock = "com.github.tomakehurst:wiremock:${Versions.wireMock}"
        const val apacheClientAndroid = "org.apache.httpcomponents:httpclient-android:${Versions.apacheClientAndroid}"
        const val rxIdler = "com.squareup.rx.idler:rx3-idler:${Versions.rxIdler}"
    }

    object Libraries {
        const val recyclerView = "androidx.recyclerview:recyclerview:${Versions.recyclerView}"
        const val cardView = "androidx.cardview:cardview:${Versions.cardView}"
        const val constraintLayout = "androidx.constraintlayout:constraintlayout:${Versions.constraintLayout}"
        const val constraintLayoutSolver = "androidx.constraintlayout:constraintlayout-solver:${Versions.constraintLayout}"

        const val rxJava = "io.reactivex.rxjava2:rxjava:${Versions.rxJava}"
        const val rxAndroid = "io.reactivex.rxjava2:rxandroid:${Versions.rxAndroid}"
        const val rxKotlin = "io.reactivex.rxjava2:rxkotlin:${Versions.rxKotlin}"

        const val coroutinesCore = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.coroutinesCore}"
        const val coroutinesAndroid = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.coroutinesAndroid}"
    }
}
