import java.net.URI
pluginManagement {
//    resolutionStrategy {
//        eachPlugin {
//            if (requested.id.namespace == "com.android.tools.build") {
//                useModule("com.android.tools.build:gradle:4.1.2")
//            }
//            if (requested.id.namespace == "org.jetbrains.kotlin") {
//                val kotlin_version = "1.9.0"
//                useModule("org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlin_version")
//            }
//            if (requested.id.namespace == "com.github.dcendents") {
//                useModule("com.github.dcendents:android-maven-gradle-plugin:1.5")
//            }
//        }
//    }
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        maven { url = uri("https://jitpack.io") }
    }
}

rootProject.name = "ClickEffects"
include(":Library")
