import com.vanniktech.maven.publish.SonatypeHost

plugins {
    alias(libs.plugins.kotlinMultiplatform)
    alias(libs.plugins.vanniktech.mavenPublish)
}

group = "com.apialerts"
version = "1.0.1"

kotlin {
    jvm()
    sourceSets {
        val commonTest by getting {
            dependencies {
                implementation(libs.kotlin.test)
            }
        }
    }
}

mavenPublishing {
    publishToMavenCentral(SonatypeHost.CENTRAL_PORTAL)

    signAllPublications()

    coordinates(group.toString(), "idevice", version.toString())

    pom {
        name = "iDevice"
        description = "Short mapper util library to convert an Apple device code to its human readable name."
        inceptionYear = "2024"
        url = "https://github.com/apialerts/idevice"
        licenses {
            license {
                name = "MIT License"
                url = "https://opensource.org/licenses/MIT"
                distribution = "https://opensource.org/licenses/MIT"
            }
        }
        developers {
            developer {
                id = "apialerts"
                name = "API Alerts"
                url = "https://github.com/apialerts"
            }
        }
        scm {
            url = "https://github.com/apialerts/idevice"
            connection = "scm:git:git://github.com/apialerts/idevice.git"
            developerConnection = "scm:git:ssh://git@github.com/apialerts/idevice.git"
        }
    }
}
