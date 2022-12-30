plugins {
    id("kotlin2js")
}
dependencies {
    compile(project(":threejs-wrapper"))
    compile("org.jetbrains.kotlin:kotlin-stdlib-js:1.3.21")
}

//val assembleWeb = tasks.create("assembleWeb",  Sync::class) {
//    configurations["compile"].all {
//        from(zipTree(absolutePath), {
//            includeEmptyDirs = false
//            include { fileTreeElement ->
//                val path = fileTreeElement.path
//                path.endsWith(".js") && (path.startsWith("META-INF/resources/") ||
//                        !path.startsWith("META-INF/"))
//            }
//        })
//    }
//    from(compileKotlin2Js.destinationDir)
//    into("${projectDir}/web/js/kt2js")
//
//    dependsOn( classes)
//}
//
//tasks["assemble"].dependsOn(assembleWeb)
