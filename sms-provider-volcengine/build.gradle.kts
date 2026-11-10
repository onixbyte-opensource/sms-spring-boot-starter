plugins {
    id("sms.java-conventions")
}

dependencies {
    api(project(":sms-core"))

    implementation(platform(libs.spring.boot.dependencies))
    implementation(libs.spring.web)
}