Spring IO platform extension
============================

[![License](https://img.shields.io/badge/License-Apache%202.0-blue.svg)](https://opensource.org/licenses/Apache-2.0)
[![Maven Central](https://maven-badges.herokuapp.com/maven-central/cn.javaer/platform-bom-extension/badge.svg)](https://maven-badges.herokuapp.com/maven-central/cn.javaer/platform-bom-extension)

[![Build Status](https://travis-ci.org/cn-src/platform-bom-extension.svg?branch=master)](https://travis-ci.org/cn-src/platform-bom-extension)

* 对Spring IO platform的一些扩展依赖管理
* 对部分旧依赖的**scope**变更为`runtime`, 如：`commons-lang`已被`commons-lang3`替代
* 排除一些依赖关系，如：依赖`commons-logging`
* 升级Spring IO platform已经管理的部分依赖的版本
* 添加一些Spring IO platform没有进行管理的依赖
* 管理的依赖支持到jdk8, 因此部分依赖只适合在jdk8的环境下

## Use
Maven Central
```xml
<dependencyManagement>
    <dependencies>
        <dependency>
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
