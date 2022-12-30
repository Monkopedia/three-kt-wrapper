
println("Gradle version is ${gradle.getGradleVersion()}")

val kotlin_version = "1.3.21"

buildscript {
    val kotlin_version = "1.3.21"

    repositories {
        mavenCentral()
    }
    dependencies {
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlin_version")
    }
}

subprojects {
    repositories {
        mavenCentral()
    }
}