import java.net.URL

plugins {
  id("java-library")
  id("nebula.kotlin")
  id("published")
  id("info.solidsoft.pitest")
}

dependencies {
  api(project(":strikt-core"))

  compileOnly("io.arrow-kt:arrow-core-data:0.9.0")
  testImplementation("io.arrow-kt:arrow-core-data:0.9.0")

  testImplementation("dev.minutest:minutest:1.7.0")
}

tasks.dokka {
  externalDocumentationLink {
    url = URL("https://arrow-kt.io/docs/apidocs/arrow-core-data/")
  }
}
