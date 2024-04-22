[![Latest version](https://img.shields.io/maven-central/v/software.xdev/testcontainers-java-junit4-mock?logo=apache%20maven)](https://mvnrepository.com/artifact/software.xdev/testcontainers-java-junit4-mock)
[![Build](https://img.shields.io/github/actions/workflow/status/xdev-software/testcontainers-java-junit4-mock/checkBuild.yml?branch=develop)](https://github.com/xdev-software/testcontainers-java-junit4-mock/actions/workflows/checkBuild.yml?query=branch%3Adevelop)
[![Quality Gate Status](https://sonarcloud.io/api/project_badges/measure?project=xdev-software_testcontainers-java-junit4-mock&metric=alert_status)](https://sonarcloud.io/dashboard?id=xdev-software_testcontainers-java-junit4-mock)

# testcontainers-java-junit4-mock

Mocks the few [JUnit 4](https://github.com/junit-team/junit4) classes that [testcontainers](https://github.com/testcontainers/testcontainers-java) needs so that JUnit 4 can be excluded.

Fixes/Works around [testcontainers-java#970](https://github.com/testcontainers/testcontainers-java/issues/970)

## Usage

_Note that you may need to insert the corresponding versions below_

```xml
<dependency>
    <groupId>software.xdev</groupId>
    <artifactId>testcontainers-java-junit4-mock</artifactId>
</dependency>

<dependency>
    <groupId>org.testcontainers</groupId>
    <artifactId>testcontainers</artifactId>
    <exclusions>
        <!-- No JUnit 4 -->
        <exclusion>
            <groupId>junit</groupId>
            <artifactId>junit</artifactId>
        </exclusion>
    </exclusions>
</dependency>
```

## Installation
[Installation guide for the latest release](https://github.com/xdev-software/testcontainers-java-junit4-mock/releases/latest#Installation)

## Support
If you need support as soon as possible and you can't wait for any pull request, feel free to use [our support](https://xdev.software/en/services/support).

## Contributing
See the [contributing guide](./CONTRIBUTING.md) for detailed instructions on how to get started with our project.

## Dependencies and Licenses
View the [license of the current project](LICENSE) or the [summary including all dependencies](https://xdev-software.github.io/testcontainers-java-junit4-mock/dependencies)
