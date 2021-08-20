## Week Two

### "I would like one large with no XML, please."

### - Part one -
#### To watch:

- [ ] Watch "Section 9: Spring Configuration with Java Annotations Bean Scopes and Lifecycle Methods" lessons 76 to 82.

#### To do:

Prerequisite:
- Add the `javax.annotation-api` to `build.gradle` dependencies and refresh Gradle.
```
dependencies {
    ...
    implementation group: 'javax.annotation', name: 'javax.annotation-api', version: '1.3.2'
    ...
}
```

- [ ] Use the **@PostConstruct** and **@PreDestroy** annotations to initialize data and print console messages.
- [ ] **[OPTIONAL]** Use the `@Scope` annotation on the `PizzeriaService` beans to test different scope values, by fetching 
the same bean twice in `PizzaApp` and printing the object (memory location) returned. What happens when the scope is `prototype` vs `singleton` ?.
- [ ] Commit the changes with a consistent git massage format.

### - Part two -

#### To watch:

- [ ] Watch "Section 10: Spring Configuration with Java Code (no xml)" lessons 84 to 95 of the course.

#### To read:

Learn about the Spring Stereotype annotations concept by reading one (or more) of the following online resources:

    https://www.baeldung.com/spring-bean-annotations
    https://www.oodlestechnologies.com/blogs/Stereotype-Annotations-in-Spring-Framework/
    https://howtodoinjava.com/spring-core/stereotype-annotations/

#### To do:

- [ ] Convert the project to "no XML"!
  - Define a `PizzaConfig` class to set up Spring component scanning and dependency injection.
  - Try to use the most suited **stereotype annotations** for the existing Beans.
  - Construct one of the Beans manually in `PizzaConfig` using the `@Bean` annotation.
  - Instead of `@Qualifier`, use the `@Primary` annotation the resolve ambiguity between `PizzeriaService`s when fetching from context.
  - **[OPTIONAL]** Revert code about `@Scope` testing.
  - Make sure the app works as before, and the `PizzeriaService` used depends on which Bean has `@Primary`.
- [ ] Commit the changes to git.

### - Part three -

### "You have some tomato sauce on your (Spring) boot."

#### To watch:

- [ ] Watch "Section 11: CRUD Operations with Spring MVC" to learn how a Spring MVC configuration works.
- [ ] **[OPTIONAL]** "Section 12: Validation and Constraints with Spring MVC" (at least the )
- [ ] **Watch "Section 70: Section 70: Spring Boot - Overview"**
- [ ] Watch "Section 71: Spring Boot - Spring Boot Dev Tools and Spring Boot Actuator" *only* lesson 520
- [ ] Watch "Section 73: Spring Boot - Application Properties"

#### To do:

Prerequisite:
- Change your `build.gradle` to the following to enable Spring Boot, and refresh Gradle.
```
plugins {
    id 'org.springframework.boot' version "${springBootVersion}"
    id 'io.spring.dependency-management' version '1.0.11.RELEASE'
    id 'java'
}

group 'ag04.sbss'
version '1.0'
sourceCompatibility = '11'

configurations {
    compileOnly {
        extendsFrom annotationProcessor
    }
}

repositories {
    mavenCentral()
}

dependencies {
    implementation 'org.springframework.boot:spring-boot-starter-web'
    testImplementation 'org.springframework.boot:spring-boot-starter-test'
}

test {
    useJUnitPlatform()
}

```

- [ ] Convert your `PizzaApp` to Spring Boot!
- [ ] Check that it runs successfully.
- [ ] Commit the changes.