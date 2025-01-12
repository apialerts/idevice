pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}

dependencyResolutionManagement {
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "iDevice"
include(":library")

val javaVersion = System.getProperty("java.version")?.split(".")?.firstOrNull()?.toInt() ?: Int.MAX_VALUE

val requiredJava = JavaVersion.VERSION_17.toString().toInt()
check (javaVersion >= requiredJava) {
    "This project needs to be run with Java $requiredJava or higher (found: $javaVersion)."
}
