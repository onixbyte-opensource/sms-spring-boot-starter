plugins {
    id("sms.java-conventions")
}

dependencies {
    api(project(":sms-spring-boot-autoconfigure"))
    api(platform(libs.spring.boot.dependencies))
    api(libs.spring.boot.starter)
}