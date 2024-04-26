plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

val jdkVersion = JavaVersion.VERSION_17

android {
    namespace = "au.com.ourveryown.ovoandroidhomeworktask"
    compileSdk = 34

    defaultConfig {
        applicationId = "au.com.ourveryown.ovoandroidhomeworktask"
        minSdk = 26
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"
        testInstrumentationRunner = "android.support.test.runner.AndroidJUnitRunner"
    }

    buildFeatures {
        compose = true
    }

    buildTypes {
        release {

            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }

    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.12"
    }

    compileOptions {
        sourceCompatibility = jdkVersion
        targetCompatibility = jdkVersion
    }
}

dependencies {
    implementation(platform("androidx.compose:compose-bom:2024.04.01"))
    implementation("androidx.compose.ui:ui")
    implementation("androidx.compose.ui:ui-tooling")
    implementation("androidx.compose.material:material")

    implementation("androidx.activity:activity-compose:1.9.0")
    implementation("androidx.appcompat:appcompat:1.6.1")

    implementation("com.google.code.gson:gson:2.10.1")

    testImplementation("junit:junit:4.13.2")

    androidTestImplementation("com.android.support.test:runner:1.0.2")
    androidTestImplementation("com.android.support.test.espresso:espresso-core:3.0.2")
}
