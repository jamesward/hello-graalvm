plugins {
    application
    id("org.graalvm.buildtools.native") version "0.9.19"
}

repositories {
    mavenCentral()
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(17))
        vendor.set(JvmVendorSpec.GRAAL_VM)
    }
}

graalvmNative {
    metadataRepository {
        enabled.set(true)
    }
}

application {
    mainClass.set("Hello")
}

afterEvaluate {
    tasks.withType<Copy>().configureEach {
        duplicatesStrategy = DuplicatesStrategy.EXCLUDE
    }
}