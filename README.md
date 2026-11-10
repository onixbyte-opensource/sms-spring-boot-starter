# sms-spring-boot-starter

A Spring Boot starter that adds SMS-sending capability to applications. It calls cloud vendors' HTTP APIs directly through Spring's `RestClient`, with no vendor SDKs.

> Status: early development. Only the multi-module build skeleton exists so far; Volcengine is the first provider being implemented.

## Features (planned)

- Unified, vendor-neutral SMS abstraction with per-vendor switching
- HTTP calls via Spring `RestClient`, zero vendor SDK dependencies
- Spring Boot auto-configuration, activated conditionally on the provider modules present on the classpath
- Supports Spring Boot 3.2+ (`RestClient` is available since Spring Framework 6.1)

## Modules

| Module | Purpose |
| --- | --- |
| `sms-core` | Vendor-neutral abstractions: client interface, request/response models, exceptions. No Spring dependency. |
| `sms-provider-volcengine` | Volcengine SMS integration (first implementation target) |
| `sms-provider-aliyun` | Aliyun SMS integration (placeholder) |
| `sms-provider-tencent` | Tencent Cloud SMS integration (placeholder) |
| `sms-spring-boot-autoconfigure` | Auto-configuration and `@ConfigurationProperties` |
| `sms-spring-boot-starter` | Published aggregator starter; applications add the provider module they need |

## Requirements

- Java 17+
- Spring Boot 3.2+ (dependency management baseline is currently 3.5.x)
- Gradle 9.x (no installation needed — use the bundled wrapper)

## Building from source

```bash
./gradlew build
```

## Quick start (planned)

Once published, applications add the starter plus the desired provider module:

```kotlin
dependencies {
    implementation("com.onixbyte:sms-spring-boot-starter:1.0-SNAPSHOT")
    implementation("com.onixbyte:sms-provider-volcengine:1.0-SNAPSHOT")
}
```

Configuration properties and API details will be documented as the implementation lands.

## Contributing

See [CONTRIBUTING.md](CONTRIBUTING.md).

## Licence

This project is open source under the [MIT](LICENCE) licence. Third-party dependency licences are listed in [THIRD_PARTY_NOTICES.md](THIRD_PARTY_NOTICES.md).

---

## 中文摘要

为 Spring Boot 应用提供短信发送能力的 Starter，基于 Spring `RestClient` 直接调用云厂商 HTTP API，不引入任何厂商 SDK。

**状态：早期开发中。** 当前仅完成多模块构建骨架，首个实现的厂商为火山引擎。

- 环境要求：Java 17+、Spring Boot 3.2+（`RestClient` 自 Spring Framework 6.1 起提供）
- 模块：`sms-core`（厂商无关抽象）、`sms-provider-*`（各厂商实现）、`sms-spring-boot-autoconfigure`（自动装配）、`sms-spring-boot-starter`（聚合发布）
- 从源码构建：`./gradlew build`
- 欢迎贡献，请参阅 [CONTRIBUTING.md](CONTRIBUTING.md)
- 本项目基于 [MIT](LICENCE) 许可证开源；第三方依赖许可证见 [THIRD_PARTY_NOTICES.md](THIRD_PARTY_NOTICES.md)