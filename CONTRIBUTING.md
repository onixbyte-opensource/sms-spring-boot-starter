# Contributing

Thanks for your interest in contributing! This document explains how to set up your environment and the conventions the project follows.

## Development setup

- JDK 17 or later (the Gradle toolchain resolves Java 17 for compilation)
- No Gradle installation needed — always use the wrapper: `./gradlew`
- Build and test everything: `./gradlew build`
- Build a single module: `./gradlew :sms-provider-volcengine:build`

## Project layout

| Module | Purpose |
| --- | --- |
| `sms-core` | Vendor-neutral abstractions (client interface, request/response models, exceptions). Must stay free of Spring and vendor types. |
| `sms-provider-*` | One module per cloud vendor, implementing the core abstractions via Spring `RestClient`. |
| `sms-spring-boot-autoconfigure` | `@ConfigurationProperties` and conditional auto-configuration. Provider modules are `compileOnly` here. |
| `sms-spring-boot-starter` | Dependency-only aggregator. Never put code here. |
| `buildSrc` | Shared build logic (`sms.java-conventions`). |
| `gradle/libs.versions.toml` | Central version catalog — add new dependencies here first. |

## Hard rules

- **No vendor SDKs.** All vendor HTTP calls go through Spring `RestClient` (`spring-web`). Signing uses JDK built-ins such as `javax.crypto`.
- **Keep `sms-core` Spring-free.** It must be usable in plain Java environments.
- **No code in the starter module.** It only aggregates dependencies.
- Source files are UTF-8. Comments are reserved for non-obvious *why* — do not narrate what the code does.

## Adding a new provider

1. Create `sms-provider-<vendor>/build.gradle.kts`, applying `sms.java-conventions` and depending on `api(project(":sms-core"))` plus `libs.spring.web` (see an existing provider for the pattern).
2. Register the module in `settings.gradle.kts`.
3. Implement the core client interface against the vendor's HTTP API; keep vendor-specific fields inside the provider module.
4. Add a `compileOnly` dependency on the new module in `sms-spring-boot-autoconfigure`, and guard its auto-configuration with `@ConditionalOnClass` so it activates only when the provider is on the application's classpath.
5. Cover signing and request mapping with unit tests (JUnit 6 is wired up by the convention plugin).

## Commit messages

- Use [Conventional Commits](https://www.conventionalcommits.org/): `<type>(<scope>): <subject>`, e.g. `feat(volcengine): add SendSms request signing`.
- Keep the subject lowercase, imperative, under 50 characters.
- One coherent feature per commit — include its tests and wiring in the same commit so every commit builds.

## Pull requests

1. Fork and create a topic branch (`feature/...`, `fix/...`, `chore/...`).
2. Make sure `./gradlew build` passes.
3. Describe the motivation and the vendor API documentation you relied on.

## Licence

By contributing, you agree that your contributions are licensed under the [MIT licence](LICENCE) that covers this project.