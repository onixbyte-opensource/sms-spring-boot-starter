# Third-Party Notices

This project itself is licensed under the MIT licence (see [LICENCE](LICENCE)). It depends on the following third-party components at runtime or during build/test. Versions reflect the current dependency management baseline (Spring Boot 3.5.16 BOM, JUnit 6.1.3).

## Runtime dependencies

| Component | Version | Licence | Upstream |
| --- | --- | --- | --- |
| Spring Framework (`spring-core`, `spring-beans`, `spring-context`, `spring-aop`, `spring-expression`, `spring-web`, `spring-jcl`) | 6.2.19 | Apache-2.0 | https://github.com/spring-projects/spring-framework |
| Spring Boot (`spring-boot`, `spring-boot-autoconfigure`, `spring-boot-starter`, `spring-boot-starter-logging`) | 3.5.16 | Apache-2.0 | https://github.com/spring-projects/spring-boot |
| Micrometer (`micrometer-observation`, `micrometer-commons`) | 1.15.12 | Apache-2.0 | https://github.com/micrometer-metrics/micrometer |
| SLF4J (`slf4j-api`, `jul-to-slf4j`) | 2.0.18 | MIT | https://github.com/qos-ch/slf4j |
| Logback (`logback-classic`, `logback-core`) | 1.5.34 | EPL-1.0 OR LGPL-2.1 (dual-licensed) | https://github.com/qos-ch/logback |
| Apache Log4j (`log4j-api`, `log4j-to-slf4j`) | 2.24.3 | Apache-2.0 | https://github.com/apache/logging-log4j2 |
| Jakarta Annotations API (`jakarta.annotation-api`) | 2.1.1 | EPL-2.0 OR GPL-2.0-with-classpath-exception (dual-licensed) | https://github.com/jakartaee/common-annotations-api |
| SnakeYAML | 2.4 | Apache-2.0 | https://bitbucket.org/snakeyaml/snakeyaml |

## Test-only dependencies

| Component | Version | Licence | Upstream |
| --- | --- | --- | --- |
| JUnit (`junit-bom`, `junit-jupiter`, `junit-platform-launcher`) | 6.1.3 | EPL-2.0 | https://github.com/junit-team/junit |
| OpenTest4J | 1.3.0 | Apache-2.0 | https://github.com/ota4j-team/opentest4j |
| API Guardian | 1.1.2 | Apache-2.0 | https://github.com/apiguardian-team/apiguardian |

## Build tooling

| Component | Version | Licence | Upstream |
| --- | --- | --- | --- |
| Gradle Wrapper | 9.6.0 | Apache-2.0 | https://github.com/gradle/gradle |
| Kotlin (embedded in Gradle `kotlin-dsl`, build scripts only) | bundled with Gradle | Apache-2.0 | https://github.com/JetBrains/kotlin |

## Licence texts

- Apache-2.0: https://www.apache.org/licenses/LICENSE-2.0
- MIT: https://opensource.org/licenses/MIT
- EPL-1.0: https://www.eclipse.org/legal/epl-v10.html
- EPL-2.0: https://www.eclipse.org/legal/epl-2.0/
- LGPL-2.1: https://www.gnu.org/licenses/old-licenses/lgpl-2.1.html
- GPL-2.0-with-classpath-exception: https://www.gnu.org/software/classpath/license.html

Components are the property of their respective copyright holders. Dual-licensed components may be used under either of the listed licences; this project elects the more permissive option where a choice exists (EPL-1.0 for Logback, EPL-2.0 for Jakarta Annotations). Full licence texts are also available inside the respective dependency JARs (`META-INF/LICENSE*`, `META-INF/NOTICE*`).