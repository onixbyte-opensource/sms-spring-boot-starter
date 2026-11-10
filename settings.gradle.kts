rootProject.name = "sms-spring-boot-starter"

// 核心抽象：厂商无关的短信客户端、请求/响应模型与异常体系，不依赖 Spring
include("sms-core")

// 厂商接入层：每个云厂商一个模块，基于 RestClient 直接调用其 HTTP API，不使用厂商 SDK
include("sms-provider-volcengine")
include("sms-provider-aliyun")
include("sms-provider-tencent")

// Spring Boot 自动装配与配置属性，按类路径中存在的厂商模块条件激活
include("sms-spring-boot-autoconfigure")

// 对外发布的 Starter：聚合自动装配，应用按需额外引入所用厂商模块
include("sms-spring-boot-starter")