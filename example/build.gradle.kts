plugins {
    id("kotlin-multiplatform")
}

kotlin {
    js(IR) {
        browser {
            webpackTask {
                output.libraryTarget =
                    org.jetbrains.kotlin.gradle.targets.js.webpack
                        .KotlinWebpackOutput.Target.COMMONJS
            }
            dceTask {
                keep += "kotlin.defineModule"
                keep += "io.ktor.http.Headers"
                keep += "kotlin.math.pow"
                println("Adding to $name")
            }
        }
        binaries.executable()
    }
    sourceSets["jsMain"].apply {
        kotlin.srcDir("src/main/kotlin")
        dependencies {
            implementation(project(":threejs-wrapper"))
            implementation(kotlin("stdlib-js"))
        }
    }
}