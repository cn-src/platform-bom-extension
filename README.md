[![](https://jitpack.io/v/cn.javaer/platform-bom-extension.svg)](https://jitpack.io/#cn.javaer/platform-bom-extension)

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
            <version>1.0.1</version>
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
