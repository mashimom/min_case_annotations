# Minimal case for wrong exception being thrown when using JetBrains java-annotations 19.0.0

> This project run with Java 8 (OpenJDK 8.0.252), original problem appeared on SpringBoot project 2.X using Java 14.

There is a single production class `org.mashimom.SimpleClass` with a single method that takes a single String argument annotated with `org.jetbrains.annotations.NotNull`.

There are also two tests:
* `org.mashimom.SimpleClassSpec` - Spock
* `org.mashimom.SimpleClassTest` - JUnit4-style

Both tests expect the `java.lang.IllegalArgumentException` to be thrown when method is invoked with `null`, currently both tests fail.
