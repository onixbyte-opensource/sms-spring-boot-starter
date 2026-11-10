plugins {
    id("sms.java-conventions")
}

dependencies {
    api(project(":sms-core"))

    implementation(platform(libs.spring.boot.dependencies))
    implementation(libs.spring.boot.autoconfigure)
    // RestClient 位于 spring-web，不会经 spring-boot-autoconfigure 传递引入
    implementation(libs.spring.web)

    // 厂商模块仅在编译期可见，运行时由应用按需引入，配合 @ConditionalOnClass 激活
    compileOnly(project(":sms-provider-volcengine"))
    compileOnly(project(":sms-provider-aliyun"))
    compileOnly(project(":sms-provider-tencent"))

    compileOnly(libs.spring.boot.configuration.processor)
    annotationProcessor(platform(libs.spring.boot.dependencies))
    annotationProcessor(libs.spring.boot.configuration.processor)
}