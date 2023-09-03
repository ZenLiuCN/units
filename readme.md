<p>
<img src="https://img.shields.io/badge/license-GPLv2%20CE-green?style=plastic" alt="license"/>
<img src="https://img.shields.io/badge/java-8+-yellowgreen?style=plastic" alt="java version"/>
<a href="https://central.sonatype.com/search?smo=true&q=parent&namespace=io.github.zenliucn.units">
<img src="https://img.shields.io/maven-central/v/io.github.zenliucn.units/parent?style=plastic" alt="maven central"/>
</a>
</p>

# Units
 Tools for java

## License

License as `GPL v2 with classpath exception`.

# Modules
1. ~~binary: a simple byte[] reader writer.~~ *removed in `0.1.x`* .
2. classes: units method for class.
3. codec: netty-buffer codec. *new in `0.1.x`* .
4. conf: `com.typesafe:config` wrapper.  *new in `0.1.x`* .
5. reflect: units of enhance reflection.
6. error: Domain error type and Result type.
7. codegen: Basic components for compile time code generate or class enhance.
8. processor: A framework for write CodeGenerator with APT process. JavaPoet required at classpath to enable processors.
9. enhancer: A framework for bytecode enhance on compile time. ByteBuddy required, and also compile time plugin.

# Processor
1. Requires [JavaPoet](https://github.com/square/javapoet) to run;
2. Requires [slf4j-api](https://www.qos.ch/) to run;
3. Property `debug` to enable Locator debug print;
4. HOCON `codegen.conf` to config processors;
# Enhancer
1. Requires [ByteBuddy](https://bytebuddy.net/) to run; 
2. Requires [slf4j-api](https://www.qos.ch/) to run;
3. Requires ByteBuddy Plugin for build tool maven or gradle. Eg:
    ```xml
    <plugin>
        <groupId>net.bytebuddy</groupId>
        <artifactId>byte-buddy-maven-plugin</artifactId>
        <version>${byte-buddy-maven-plugin.version}</version>
        <executions>
            <execution>
                <id>post-compile</id>
                <phase>compile</phase>
                <goals>
                    <goal>transform</goal>
                </goals>
            </execution>
            <execution>
                <id>post-test-compile</id>
                <phase>test-compile</phase>
                <goals>
                    <goal>transform-test</goal>
                </goals>
            </execution>
        </executions>
        <configuration>
            <!-- this will autoload enhancers -->
            <classPathDiscovery>true</classPathDiscovery>
        </configuration>
    </plugin>
    ```
4. Property `debug` to enable Locator debug print;
5. HOCON `codegen.conf` to config processors;
# Reflect
1. Requires [Caffeine](https://github.com/ben-manes/caffeine) to run.
# Note
 `main` branch had dump to support java 17+, versions start with `0.1.x`. older version remains under `0.x` branch and versions are limit to `0.0.x`.