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
1. binary: a simple byte[] reader writer.
2. classes: units method for class.
3. reflect: units of enhance reflection.
4. error: Domain error type and Result type.
5. codegen: Basic components for compile time code generate or class enhance.
6. processor: A framework for write CodeGenerator with APT process. JavaPoet required at classpath to enable processors.
7. enhancer: A framework for bytecode enhance on compile time. ByteBuddy required, and also compile time plugin.

# Processor
1. Requires [JavaPoet](https://github.com/square/javapoet) to run;
2. Requires [slf4j-api](https://www.qos.ch/) to run;
3. Property `process.debug` to enable Locator debug print;
4. Properties `process.properites` to config processors;
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
4. Property `enhance.debug` to enable Locator debug print;
5. Properties `enhance.properites` to config processors;
# Reflect
1. Requires [Caffeine](https://github.com/ben-manes/caffeine) to run.