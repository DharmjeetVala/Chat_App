plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "com.example.chat_application"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.chat_application"
        minSdk = 26
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
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

    buildFeatures{
        viewBinding = true
    }
}

dependencies {

    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)
    implementation(kotlin("script-runtime"))

    //Support for Different Screen Sizes
    implementation ("com.intuit.sdp:sdp-android:1.0.6")
    implementation ("com.intuit.sdp:sdp-android:1.0.6")

    //Rounded imageView
    implementation ("de.hdodenhof:circleimageview:3.1.0")
}