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

8. **SpringBoot6 – Autowiring using Java Configuration**
   - Demonstrates **Spring’s @Autowired annotation** for automatic dependency injection using a **JavaConfig class** (`@Configuration` and `@ComponentScan`).
   - Shows how Spring automatically detects and injects beans into other beans via **component scanning and annotations** without XML.
   - Includes usage of **@Qualifier annotation** to resolve ambiguity when multiple beans of the same type exist.

9. **SpringBoot6b – Autowiring using XML Configuration**
   - Illustrates **Spring’s autowiring feature** using **XML-based configuration**.
   - Explains different autowiring modes (`byName`, `byType`, `constructor`) and how Spring wires beans automatically through XML configuration.
   - Demonstrates the use of **`autowire-candidate="false"`** to exclude specific beans from autowiring when multiple candidates exist.

10. **MavenSpring1 – Spring Boot in Maven**
   	- Created a **Maven Quickstart project** in IntelliJ named `MavenSpring1`.
   	- Added **Spring Boot dependencies** in `pom.xml`.
   	- Wrote **Spring Boot programs** and ran them within the project structure.
   	- Demonstrates using Spring Boot with a **simple Maven Quickstart setup**.

11. **MavenSpring2 – Spring JDBC CRUD with Java Config**
	- Built a **Java-based configuration** Spring application using **Maven**.
	- Implemented **CRUD operations** (Create, Read, Update, Delete) on a MySQL database using **JdbcTemplate**.
	- Configured **Spring beans via @Configuration** (no XML) for **DataSource** and **JdbcTemplate**.
	- Created **POJO (`Student`)**, **RowMapper (`StudentRowmapper`)**, and tested DB operations in the **main class (`App`)**.
	- Demonstrates **Java-based Spring configuration and JDBC integration** without Spring Boot.

12. MavenSpring3 – Spring JDBC Insert with Java Config (NamedParameterJdbcTemplate)
	- Built a Java-based configuration Spring application using Maven (no XML, no Spring Boot).
	- Wired DriverManagerDataSource and NamedParameterJdbcTemplate via @Configuration and @Bean.
	- Demonstrates an INSERT into MySQL using named parameters (readable :key placeholders instead of ?).
	- Main class (App) boots AnnotationConfigApplicationContext with JavaConfigFile and executes update().
	- Configured DataSource to connect to local MySQL database spring_jdbc_db.
	- Tech stack: Java, Maven, Spring Context 6.x, Spring JDBC 6.x, MySQL Connector/J 9.x.
	- Highlights modern MySQL driver recommendation (com.mysql.cj.jdbc.Driver) for Connector/J 8+/9+.


## 🌿 Tech Stack 🌿

- **Java 21+**
- **MySQL 8.4.6**
- **Spring Boot 3.x**
- **Maven** for dependency management and project builds
- Developed in **IntelliJ IDEA**
- Includes **Spring JAR files** in `Spring Jars` folder for offline use
