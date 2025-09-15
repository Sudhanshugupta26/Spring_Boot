# SpringBootStarter2

A minimal Spring Boot starter project demonstrating basic configuration, bean definitions, and application bootstrap. It prints sample Student bean data on application startup using a CommandLineRunner.

## Key Characteristics
- Spring Boot application using `@SpringBootApplication` entry point.
- Java-based configuration with `@Configuration` and `@Bean` methods.
- Demonstrates Dependency Injection by defining and consuming beans (`Student`).
- Uses `CommandLineRunner` to execute logic at startup (prints student info to console).
- Simple POJO model (`Student` with name, age, course) and a display method.
- Conventional package structure under `in.gupta.main.springbootstarter2` to enable component scanning.
- Maven build with wrapper scripts (`mvnw`, `mvnw.cmd`).

## Project Structure
- src/main/java/in/gupta/main/springbootstarter2/
  - SpringBootStarter2Application.java — main entry point annotated with `@SpringBootApplication`.
  - beans/Student.java — simple POJO representing a student; includes a `display()` method.
  - config/AppConfig.java — Java config that defines:
    - Two `Student` beans (`std1`, `std2`).
    - A `CommandLineRunner` bean that prints both students on startup.
- src/main/resources/application.properties — application configuration (currently minimal/default).
- HELP.md — additional helper notes (if any).

## Tech Stack
- Java (version defined by Maven toolchain/parent; typical JDK 8+)
- Spring Boot (as defined in pom.xml)
- Maven

## How to Build
On Windows PowerShell or Command Prompt (project root):

- Using Maven wrapper:
  - `mvnw.cmd clean package`

- If Maven is installed:
  - `mvn clean package`

## How to Run
- Using Maven wrapper (Windows):
  - `mvnw.cmd spring-boot:run`

- Or run the built JAR (after packaging):
  - `java -jar target/<artifact-name>.jar`

When the app starts, the console will show lines like:
```
Students are:
Name: Gaurav, Age: 20, Course: BCA
Name: Raj, Age: 22, Course: BCA
```

## How to Test
- Execute unit tests (if any exist) with:
  - `mvnw.cmd test`

## Configuration
Add or adjust properties in `src/main/resources/application.properties` as needed. The project currently does not depend on external systems (like DB) and should run as-is.

## Notes
- Ensure that all packages remain under `in.gupta.main.springbootstarter2` so that component scanning picks up your configuration and beans, as indicated by the comment in the main application class.

## License
This project currently has no explicit license. Add one if needed.
