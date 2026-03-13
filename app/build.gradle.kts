plugins {
    application
    id("org.sonarqube") version "7.2.3.7755"
    checkstyle
}

group = "hexlet.code"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

application {
    mainClass.set("hexlet.code.App")
}

tasks.getByName("run", JavaExec::class) {
    standardInput = System.`in`
}

sonar {
    properties {
        property("sonar.projectKey", "spiri4_java-project-61")
        property("sonar.organization", "spiri4")
    }
}
