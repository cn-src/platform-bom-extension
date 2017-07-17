[![](https://jitpack.io/v/cn.javaer/platform-bom-extension.svg)](https://jitpack.io/#cn.javaer/platform-bom-extension)
[![License](https://img.shields.io/badge/License-Apache%202.0-blue.svg)](https://opensource.org/licenses/Apache-2.0)
# Spring IO platform extension
* 对Spring IO platform的一些扩展依赖管理
* 对部分旧依赖的**scope**变更为`runtime`, 如：`commons-lang`已被`commons-lang3`替代
* 排除一些依赖关系，如：依赖`commons-logging`
* 升级Spring IO platform已经管理的部分依赖的版本
* 添加一些Spring IO platform没有进行管理的依赖
* 管理的依赖支持到jdk8, 因此部分依赖只适合在jdk8的环境下

## Use
Step 1. Add the JitPack repository to your build file
```xml
<repositories>
    <repository>
        <id>jitpack.io</id>
        <url>https://jitpack.io</url>
    </repository>
</repositories>
```

Step 2. Add the dependency management
```xml
<dependencyManagement>
    <dependencies>
        <dependency>
            <groupId>cn.javaer</groupId>
            <artifactId>platform-bom-extension</artifactId>
            <version>1.0.4</version>
            <type>pom</type>
            <scope>import</scope>
        </dependency>
    </dependencies>
</dependencyManagement>
```

Step 3. Add the dependency
```xml
<dependency>
    <groupId>com.alibaba</groupId>
    <artifactId>druid</artifactId>
</dependency>
```

# Update list

## 1.0.4
Add dependency management

See [itextpdf](http://developers.itextpdf.com/itext-7)

## 1.0.3
Dependency version update
```
com.alibaba:fastjson ................................ 1.2.33 -> 1.2.34
```

## 1.0.2
Dependency version update
```
com.aliyun.oss:aliyun-sdk-oss ......................... 2.6.1 -> 2.7.0
com.github.pagehelper:pagehelper-spring-boot-starter ...1.1.1 -> 1.1.2
com.google.code.findbugs:annotations .................. 2.0.3 -> 3.0.1u2
de.codecentric:spring-boot-admin-server ............... 1.5.1 -> 1.5.2
de.codecentric:spring-boot-admin-server-ui ............ 1.5.1 -> 1.5.2
de.codecentric:spring-boot-admin-server-ui-login ...... 1.5.1 -> 1.5.2
de.codecentric:spring-boot-admin-starter-client ....... 1.5.1 -> 1.5.2
```
