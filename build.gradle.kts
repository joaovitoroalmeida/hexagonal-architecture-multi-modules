import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

val projectVersion: String by ext
val projectGroup: String by ext
val targetJVM: String by ext
val kotlinVersion: String by ext

val springBootVersion: String by ext

java {
    sourceCompatibility = JavaVersion.VERSION_19
}

plugins {
    kotlin("jvm") version "1.8.21"
    kotlin("plugin.spring") version "1.8.21"

    id("io.spring.dependency-management") version "1.1.0"
    id("org.springframework.boot") version "3.0.6" apply false
}

allprojects {
    version = projectVersion
    group = projectGroup

    repositories {
        mavenCentral()
        mavenLocal()
    }
}

subprojects {
    apply {
        plugin("kotlin")
        plugin("kotlin-spring")
        plugin("io.spring.dependency-management")
    }

    dependencyManagement {
        imports {
            mavenBom("org.springframework.boot:spring-boot-dependencies:$springBootVersion")
            mavenBom("org.springframework.boot:spring-boot-starter-parent:$springBootVersion")
        }

        dependencies {
            dependency("org.jetbrains.kotlin:kotlin-reflect:$kotlinVersion")
            dependency("org.jetbrains.kotlin:kotlin-stdlib-jdk8:$kotlinVersion")
        }
    }

    dependencies {
        // Kotlin
        implementation("org.jetbrains.kotlin:kotlin-reflect")
        implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")

        // Spring
        implementation("org.springframework.boot:spring-boot-starter-webflux")
        implementation("org.springframework.boot:spring-boot-starter-actuator")
    }

    tasks {
        withType<KotlinCompile> {
            kotlinOptions {
                jvmTarget = targetJVM
            }
        }
    }
}