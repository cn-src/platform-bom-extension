Spring IO platform extension
============================

[![License](https://img.shields.io/badge/License-Apache%202.0-blue.svg)](https://opensource.org/licenses/Apache-2.0)
[![Maven Central](https://maven-badges.herokuapp.com/maven-central/cn.javaer/platform-bom-extension/badge.svg)](https://maven-badges.herokuapp.com/maven-central/cn.javaer/platform-bom-extension)
[![JitPack](https://jitpack.io/v/cn-src/platform-bom-extension.svg)](https://jitpack.io/#cn-src/platform-bom-extension)

[![Build Status](https://travis-ci.org/cn-src/platform-bom-extension.svg?branch=master)](https://travis-ci.org/cn-src/platform-bom-extension)
[![Dependency Status](https://www.versioneye.com/user/projects/5a05cb3b15f0d72c01255048/badge.svg?style=flat-square)](https://www.versioneye.com/user/projects/5a05cb3b15f0d72c01255048)

* 对 Spring IO platform 的一些扩展依赖管理，配合 Spring IO platform 或 Spring Boot 使用。
* 对部分旧依赖的**scope**变更为`runtime`, 如：`commons-lang`已被`commons-lang3`替代。
* 排除一些依赖关系，如：依赖`commons-logging`。
* 升级 Spring IO platform 已经管理的部分依赖的版本。
* 添加一些 Spring IO platform 没有进行管理的依赖。
* 管理的依赖支持到 Java8, 因此部分依赖只适合在 Java8 的环境下

## Use
Maven Central
```xml
<dependencyManagement>
    <dependencies>
        <dependency>
            <!-- 放在其它管理之前 -->
            <groupId>cn.javaer</groupId>
            <artifactId>platform-bom-extension</artifactId>
            <version>LATEST</version>
            <type>pom</type>
            <scope>import</scope>
        </dependency>
    </dependencies>
</dependencyManagement>
```

Add the dependency
```xml
<dependency>
    <groupId>com.alibaba</groupId>
    <artifactId>druid</artifactId>
</dependency>
```

## 参考文档

[Spring IO Platform 当前版本的依赖管理](https://docs.spring.io/platform/docs/current/reference/htmlsingle/#appendix-dependency-versions)
[Spring Boot 当前版本的依赖管理](https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/#appendix-dependency-versions#appendix-dependency-versions)