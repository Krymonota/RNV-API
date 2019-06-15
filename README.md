# RNV-API
### Java-based client implementation of the RNV (Rhein-Neckar-Verkehr) API. 
You can find the complete documentation and request an API token on the [OpenData Portal of Rhein-Neckar-Verkehr](https://opendata.rnv-online.de/startinfo-api).

---

Installation
---
You can either [download the latest version](https://github.com/Krymonota/rnv-api/releases/latest) and add the `.jar` file to your project libraries, or install the downloaded artifact to your repository and let one of the following build and dependency management tools take care for you:

#### [Maven](https://maven.apache.org/) (`pom.xml`)
Add the dependency:
```xml
<dependencies>
    <dependency>
        <groupId>io.github.krymonota</groupId>
        <artifactId>rnv-api</artifactId>
        <version>1.1.0</version>
    </dependency>
</dependencies>
```

#### [Gradle](https://gradle.org/) (`build.gradle`)
Add the dependency:
```gradle
dependencies {
    implementation 'io.github.krymonota:rnv-api:1.1.0'
}
```

#### [sbt](https://www.scala-sbt.org/) (`build.sbt`)
Add the dependency:
```scala
libraryDependencies += "io.github.krymonota" % "rnv-api" % "1.1.0" 
```

---

Getting Started
---
First you need an API token, which can be requested on the [OpenData Portal of Rhein-Neckar-Verkehr](https://opendata.rnv-online.de/startinfo-api). 

After you've received an API token by email, you can start by creating an instance of [RNVAPIService](https://github.com/Krymonota/RNV-API/blob/master/src/main/io/github/krymonota/rnvapi/RNVAPIService.java) by calling [RNVAPI#createAPIServiceProvider](https://github.com/Krymonota/RNV-API/blob/master/src/main/io/github/krymonota/rnvapi/RNVAPI.java#L40) and passing the API token as a parameter. Then you can collect all desired information by calling the API methods in the [RNVAPIService](https://github.com/Krymonota/RNV-API/blob/master/src/main/io/github/krymonota/rnvapi/RNVAPIService.java) interface. 

For more information on calling these API methods, take a look at the [examples](https://github.com/Krymonota/RNV-API/tree/master/src/examples/java/io/github/krymonota/rnvapi/examples) and [unit tests](https://github.com/Krymonota/RNV-API/tree/master/src/test/java/io/github/krymonota/rnvapi/test).  

---

Interfaces
---
- Station Package
- Line Package
- Station Monitor
- Line Journey
- Station Info
- Journey Info
- News
- Ticker
- Canceled Lines

---

Dependencies ([Maven](https://maven.apache.org))
---
Don't worry, I've already taken care of the project dependencies so that you don't have to deal with them on your own! However, I want to draw some attention to the libraries and tools we use for this project:
- [Project Lombok](https://projectlombok.org)
- [Retrofit](http://square.github.io/retrofit)
- [Gson](https://github.com/google/gson) / Gson-Converter for Retrofit
- [JUnit](https://junit.org/junit5/)

---

License
---
This project is licensed under the Apache License, Version 2.0. See the [LICENSE](https://github.com/Krymonota/rnv-api/blob/master/LICENSE) file for details.
