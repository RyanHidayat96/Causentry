import com.v7878.zygisk.gradle.ZygoteLoader

plugins {
    alias(libs.plugins.android.application)
    id("com.github.aerath-stuff.ZygoteLoader") version "bf5078e182"
    id("io.github.vova7878.RaungPlugin") version "v1.0.1"
}

android {
    namespace = "com.causentry.zygote"
    compileSdk = 36

    sourceSets {
        getByName("main") {
            java.srcDirs(
                "third_party/AndroidVMTools/src/main/java",
                "third_party/PanamaPort/Core/src/main/java",
                "third_party/PanamaPort/Core/src/openjdk/java",
                "third_party/PanamaPort/Unsafe/src/main/java",
                "third_party/PanamaPort/LLVM/src/main/java",
                "third_party/PanamaPort/VarHandles/src/main/java",
                "third_party/PanamaPort/stubs/buffers/src/main/java",
            )
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_21
        targetCompatibility = JavaVersion.VERSION_21
    }

    buildFeatures {
        buildConfig = true
    }

    defaultConfig {
        applicationId = "com.causentry.zygote"
        minSdk = 26
        targetSdk = 35
        versionCode = 1
        versionName = "1.1.0"
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = true
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro",
            )
        }
    }
}

zygisk {
    // PACKAGE_SYSTEM_SERVER + providers: binder-level hooks (PackageManager, Settings,
    // Accessibility, USB state) that must intercept queries from any app.
    // ALL_PACKAGES: in-process root-detection bypass (File, Runtime.exec,
    // SystemProperties) injected into every app process; ZygoteEntry.main()
    // gates actual hook installation on CloakPolicy.hasHiddenPackages(uid)
    // so overhead for unprotected apps is a single UID check and an early return.
    packages(
        ZygoteLoader.PACKAGE_SYSTEM_SERVER,
        ZygoteLoader.ALL_PACKAGES,
        "com.android.providers.settings",
        "com.google.android.providers.media.module",
        "com.android.providers.media.module",
    )
    id = "causentry"
    name = "Causentry"
    author = "exery"
    description = "Causentry system-side package and Settings cloak backend"
    entrypoint = "com.causentry.zygote.ZygoteEntry"
    archiveName = "Causentry-Zygisk"
    isAddVariantToArchiveName = false
}

dependencies {
    implementation("io.github.vova7878:DexFile:v1.6.1")
    implementation("io.github.vova7878:SunUnsafeWrapper:v1.0.2")
    implementation("io.github.vova7878:R8Annotations:v1.0.1")
    implementation("io.github.vova7878:SunCleanerStub:v1.0.1")
}
