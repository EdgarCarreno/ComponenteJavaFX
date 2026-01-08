plugins {
    java
    application
    id("org.openjfx.javafxplugin") version "0.1.0"
}

group = "aplicacion"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(25)
    }
}

tasks.withType<JavaCompile> {
    options.encoding = "UTF-8"
}

application {
    mainModule.set("aplicacion")
    mainClass.set("aplicacion.TestComponente")
    this.applicationDefaultJvmArgs = listOf("--enable-native-access=javafx.graphics")
}

javafx {
    sdk = "C:/Java/JavaFX-SDK-25"
    modules = listOf("javafx.graphics", "javafx.controls", "javafx.fxml","javafx.base")
}

dependencies {

}