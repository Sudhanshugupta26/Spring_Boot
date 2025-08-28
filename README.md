# 🌿 Java Spring Boot Projects Repository 🌿

This repository contains a collection of **Java Spring Boot projects**, demonstrating various Spring Boot features, configurations, and dependency injection techniques. All projects are **Maven-based** and developed using **IntelliJ IDEA**, making them easy to run and explore. This repository serves as a practical learning resource and reference for students, beginners, and developers looking to understand Spring Boot concepts.

Additionally, the repository includes a folder named **`Spring Jars`** which contains all the required JAR files for the projects, making it easy to run the applications without manually downloading dependencies. 🌿

## 🌿 Projects Overview 🌿

1. **SpringBoot1 – XML Configuration**
   - Demonstrates classic **XML-based bean configuration**.
   - Shows how to define beans, set properties, and retrieve beans using `ClassPathXmlApplicationContext`.

2. **SpringBoot2 – Java Config File Configuration**
   - Uses **Java-based configuration** with `@Configuration` and `@Bean`.
   - Highlights **annotation-based bean registration** instead of XML.

3. **SpringBoot3 – Annotation-Based Configuration**
   - Fully **annotation-driven configuration** using `@Component`.
   - Demonstrates component scanning and retrieving beans without Spring Boot’s **ApplicationContext**.

4. **SpringBoot4 – Setter Dependency Injection (XML Configuration)**
   - Shows **setter-based dependency injection** using XML configuration.
   - Illustrates how Spring injects dependencies into beans via setter methods.

5. **SpringBoot4b – Constructor Dependency Injection (XML Configuration)**
   - Demonstrates **constructor-based dependency injection** using XML configuration.
   - Useful for immutable dependency design and understanding constructor DI patterns.

6. **SpringBoot5 – Setter Dependency Injection (Java Configuration)**
   - Shows **setter-based dependency injection** using a **JavaConfigFile class** (`@Configuration` and `@Bean`).
   - Demonstrates how Spring injects dependencies into beans via **setter methods** using pure Java configuration without XML.

7. **SpringBoot5b – Constructor Dependency Injection (Java Configuration)**
   - Illustrates **constructor-based dependency injection** using a **JavaConfigFile class** (`@Configuration` and `@Bean`).
   - Highlights best practices for **immutable dependencies** and leverages Spring’s DI capabilities through constructors in a **Java-based configuration** approach.


---

## 🌿 Tech Stack 🌿

- **Java 21+**
- **Spring Boot 3.x**
- **Maven** for dependency management and project builds
- Developed in **IntelliJ IDEA**
- Includes **Spring JAR files** in `Spring Jars` folder for offline use
