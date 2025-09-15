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

13. WebApp1 **Student Registration System – MVC Pattern with Servlets and JDBC**
    - Designed a Java web application following the **MVC design pattern**.
    - **Model:** Includes POJO classes and `DbConnection` utility for MySQL via JDBC.
    - **View:** HTML files (`register.html`, `login.html`, etc.) for user interaction.
    - **Controller:** Servlet classes (`Register`, `Login`) handle requests, coordinate with the model, and control navigation.
    - Handles user registration and authentication by processing form data, performing database operations, and managing responses.
    - Demonstrates modular structure, clear separation of concerns, and deployment on Tomcat using annotation-based configuration.

14. SpringWebMvc **Spring MVC-Based Web Application**

	- Follows a clean, layered architecture with Spring Web MVC, separating concerns across presentation (JSP views), business (service logic, ready for extension), and data layers (prepared for future integration).
	- `web.xml` acts as the Front Controller, directing requests to `MyController`, which maps and handles specific routes using annotation-based configuration.
	- The `myds-servlet` view resolver translates logical view names from the controller into JSP files located in the views directory, ensuring flexible rendering of user interfaces.
	- The modular structure enhances maintainability, scalability, and supports straightforward expansion for future business logic and data access needs.
15. SpringWebMvc2 **Spring MVC-Based Web Application**
	- Implements a clean, layered architecture with Spring Web MVC, separating concerns across the presentation layer (JSP views), controller logic, and business/data layers (ready for future extensions).
	- `web.xml` configures the Front Controller (`DispatcherServlet`) to route incoming requests to `MyController`, which manages specific paths using annotation-based configurations.
	- Logical view names returned by controller methods are resolved into JSP files by the view resolver, allowing for flexible and maintainable user interface rendering.
	- Annotation-driven modular structure (`@Controller`, `@GetMapping`, `@PostMapping`, `@RequestMapping`, `@ModelAttribute`) enhances maintainability and scalability, supporting easy expansion for additional business logic or data integration.
16. SpringBootStarter1 **Spring Boot Web Application**
   - Minimal Spring Boot (3.5.x) web app showcasing an annotation-driven MVC entry point using Spring Web, with auto-configuration reducing boilerplate.  
   - Clean controller layer: a simple `@Controller` mapped to root ("/") using `@GetMapping` and `@ResponseBody` to return plain text directly to the client.  
   - Auto-configured `DispatcherServlet` replaces the need for manual `web.xml` setup, with routes automatically detected via component scanning.  
   - Supports extension to logical views (e.g., Thymeleaf, JSP) through view resolvers if needed, making it flexible for UI rendering.  
   - Annotation-driven modular design using `@SpringBootApplication`, `@Controller`, and mapping annotations (`@GetMapping`, `@PostMapping`, etc.), ready for scaling with additional layers (`@Service`, `@Repository`) and dependency injection.  
17. SpringBootStarter2 **Spring Boot Starter with Beans and Bootstrap**
   - Minimal Spring Boot starter project demonstrating basic configuration, bean definitions, and application bootstrap.
   - Entry point with `@SpringBootApplication` for auto-configuration and component scanning.
   - Java-based configuration using `@Configuration` and `@Bean` methods for defining beans.
   - Demonstrates Dependency Injection through a simple `Student` bean consumed at runtime.
   - Uses `CommandLineRunner` to run logic on startup (prints student info to console).
   - Simple POJO model: `Student` (name, age, course) with a display method.
   - Organized under conventional package structure `in.gupta.main.springbootstarter2` for scanning.
   - Maven-based build, includes wrapper scripts (`mvnw`, `mvnw.cmd`) for easy execution.
18. SpringBootStarterJDBCCrud **Spring Boot JDBC CRUD Application**
   - Minimal Spring Boot project demonstrating CRUD operations using Spring JDBC (`JdbcTemplate`) with MySQL.
   - Purpose: Provide a simple, lightweight alternative to JPA/Hibernate by using direct JDBC.
   - Tech Stack:
     - Java + Spring Boot
     - Spring JDBC (`JdbcTemplate`)
     - MySQL (configurable in `application.properties`)
   - Domain model: `User` entity with fields → name, email, city, gender.
   - Data Access Layer: DAO class with hand-written SQL queries and try/catch handling for inserts, updates, deletes, and retrieval.
   - Mapping: Custom `RowMapper` implementation to map `ResultSet` rows into `User` objects.
   - Execution: `CommandLineRunner` triggers CRUD operations at application startup, with examples for insert, update, delete, fetch one, and fetch all users.
19. SpringMavenHibernate **Hibernate + Maven CRUD Application**
   - Minimal Java console project using plain Hibernate (without Spring) to perform CRUD operations.
   - Tech Stack:
     - Java
     - Maven
     - Hibernate Core 5.6.x
     - MySQL Connector/J 9.x
     - JUnit 3 (basic test scaffolding)
   - Packaging: `jar`; entry point → `in.gupta.main.App`.
   - ORM Mapping: Annotation-based JPA entity `in.gupta.entity.User` mapped to table `hibernate_user`.
   - Configuration:
     - `hibernate.cfg.xml` defines MySQL connection
     - `hibernate.hbm2ddl.auto=update`
     - SQL logging enabled
   - CRUD Examples:
     - `App.java` demonstrates insert, read, update, delete operations using `Session` and `Transaction` API (commented/active code snippets).
   - Target DB: `jdbc:mysql://localhost:3306/hibernate_db` (username: `root`, password required locally).
20. SpringBootHibernate **Spring Boot + Hibernate ORM Application**
   - A minimal Spring Boot application demonstrating direct Hibernate integration (without Spring Data JPA) for ORM against a MySQL database.
   - Tech Stack:
     - Java 21
     - Maven (spring-boot-maven-plugin)
     - Spring Boot 3.5.5 (spring-boot-starter)
     - Hibernate Core 5.6.15.Final
     - MySQL Connector/J 9.4.0
     - JAXB (jaxb-api, jaxb-core, jaxb-impl for XML binding support)
   - Packaging: Executable Spring Boot JAR.
   - ORM Mapping: Annotation-based entity classes mapped to MySQL tables.
   - Configuration:
     - `hibernate.cfg.xml` in `src/main/resources`
     - Manual `SessionFactory` creation inside `main()` method
     - SQL logging enabled
   - Key Features:
     - Uses programmatic SessionFactory setup (not auto-configured EntityManager).
     - Explicit Hibernate usage inside a Spring Boot context.
     - Clean separation of entity + persistence logic.
   - Target DB: `jdbc:mysql://localhost:3306/hibernate_db` (username: `root`, local password required).
21. SpringBootHibernate2 **Spring Boot + Hibernate (XML Config)**
   - Minimal Spring Boot project showcasing direct Hibernate ORM integration with MySQL, configured via classic `hibernate.cfg.xml` instead of Spring Data JPA.
   - Tech Stack:
     - Java 21
     - Spring Boot 3.5.5 (`spring-boot-starter`)
     - Hibernate ORM 5.6.15.Final
     - MySQL Connector/J 9.4.0
     - JAXB (jaxb-api, jaxb-core, jaxb-impl) for XML binding
     - Maven (build + dependency management)
   - Packaging: Spring Boot executable JAR (via spring-boot-maven-plugin).
   - Configuration:
     - `hibernate.cfg.xml` in `src/main/resources` defines DB connection and Hibernate properties.
     - Manual `SessionFactory` setup programmatically (no Spring Data JPA auto-config).
     - SQL logging enabled.
   - ORM Mapping: Annotation-based entity classes mapped to relational tables.
   - Key Features:
     - Demonstrates raw Hibernate API usage inside Spring Boot context.
     - Retains flexibility of XML-based configuration with modern Spring Boot runtime.
     - Clean separation between application bootstrap and ORM persistence logic.
   - Target DB: `jdbc:mysql://localhost:3306/hibernate_db` (username: `root`, local password required).
22. SpringBootDataJPA **Spring Boot + Spring Data JPA Application**
   - Minimal Spring Boot project showcasing layered architecture with Spring Data JPA for CRUD operations on a Student domain.
   - Tech Stack:
     - Java 21
     - Spring Boot 3.5.5
     - Spring Data JPA (Hibernate as ORM provider)
     - MySQL (via mysql-connector-j)
     - Maven (spring-boot-maven-plugin)
     - Testing: spring-boot-starter-test
   - Packaging: Executable JAR.
   - Architecture & Components:
     - **Application Bootstrap**: `in.gupta.main.springbootdatajpa.SpringBootDataJpaApplication`
     - **Entity**: `in.gupta.main.springbootdatajpa.entities.Student` (annotated JPA entity mapped to DB table).
     - **Repository**: `in.gupta.main.springbootdatajpa.repository.StudentRepository`
       - Likely extends `JpaRepository<Student, ID>` for auto CRUD and query methods.
     - **Service Layer**:
       - Interface: `in.gupta.main.springbootdatajpa.service.StudentServices`
       - Implementation: `in.gupta.main.springbootdatajpa.service.StudentServicesImpl`
   - Key Features:
     - Demonstrates standard layered architecture: Entity → Repository → Service → Controller.
     - CRUD operations auto-implemented by Spring Data JPA.
     - Schema auto-generation handled by JPA/Hibernate (based on `application.properties`).
     - Easy extension for custom queries using method naming or `@Query`.
   - Target DB: `jdbc:mysql://localhost:3306/<your_db>` (credentials configured in `application.properties`).
23. SpringBootWebApp1 **Spring Boot MVC Web Application**
   - Simple Spring Boot MVC project demonstrating user registration and login flow with JSP views and MySQL persistence.
   - Tech Stack:
     - Java 21
     - Spring Boot 3.5.x
     - Spring Data JPA (Hibernate ORM)
     - MySQL (persistence store)
     - JSP (Jakarta EE) as the view technology
     - Maven (spring-boot-maven-plugin)
   - Packaging: Executable Spring Boot JAR.
   - Architecture & Components:
     - **Controller Layer**: Handles registration, login, and logout endpoints.
     - **Service Layer**: Business logic for validating email/password and managing user sessions.
     - **Repository Layer**: Extends `JpaRepository` for user persistence.
     - **Entity Layer**: User entity mapped to a relational table.
   - Features:
     - JSP views with prefix/suffix configured for rendering UI.
     - Hibernate auto DDL update enabled (schema generated automatically).
     - Simple authentication: plain text email + password validation in the service layer.
     - Session management: HTTP session invalidated upon logout for basic security.
   - Target DB: `jdbc:mysql://localhost:3306/<your_db>` (credentials in `application.properties`).
24. SpringBootThymeleaf **Spring Boot + Thymeleaf Web Application**
   - Minimal Spring Boot MVC project demonstrating server-side rendering with Thymeleaf templates.
   - Tech Stack:
     - Java 17+ (compatible with higher JDKs if adjusted)
     - Spring Boot (Web, MVC)
     - Thymeleaf (template engine)
     - Maven (spring-boot-maven-plugin)
   - Packaging: Executable Spring Boot JAR.
   - Architecture & Components:
     - **Controller Layer**: Simple `@Controller` class returning model attributes to Thymeleaf templates.
     - **Templates**: Thymeleaf HTML files showcasing:
       - Variable rendering (`th:text`)
       - Conditional rendering (`th:if`, `th:unless`)
       - List iteration (`th:each`)
     - **Static Page**: Index page with navigation links to demo endpoints.
   - Features:
     - No database (in-memory data provided via controller for simplicity).
     - Three GET endpoints mapped to three corresponding Thymeleaf templates.
     - Easy to extend with additional forms, fragments, or layouts.
     - Runs on embedded Tomcat—no external server required.
   - Purpose:
     - Educational demo to illustrate Spring MVC + Thymeleaf integration.
     - Provides a lightweight foundation for building dynamic server-side rendered applications.
25. SpringBootRegLogin **Spring Boot + Thymeleaf Registration & Login**
   - Minimal Spring Boot 3 MVC application implementing an end-to-end authentication flow (register → login → profile → logout).
   - Tech Stack:
     - Java 21
     - Spring Boot 3.5.5
     - Spring Web (MVC), Spring Data JPA, Thymeleaf
     - MySQL (mysql-connector-j)
     - Maven
   - Architecture:
     - **Controller**: Manages HTTP endpoints for register, login, profile, and logout.
     - **Service**: Handles business logic for user registration and validation.
     - **Repository**: JPA repository for `User` entity.
     - **View**: Thymeleaf templates (`register.html`, `login.html`, `profile.html`).
   - Features:
     - User entity with fields: `id`, `name`, `email`, `password`.
     - Form data binding with `@ModelAttribute`.
     - Session management: HTTP session invalidated on logout.
   - Endpoints:
     - `GET /register`, `POST /regiForm`
     - `GET /login`, `POST /loginForm`
     - `GET /logout`
26. SpringBootRestfulWS **Spring Boot RESTful Web Service**
   - Minimal REST API built with Spring Boot, exposing CRUD operations for a User resource persisted with Spring Data JPA and MySQL.
   - Tech Stack:
     - Java
     - Spring Boot (Web + Data JPA)
     - MySQL (mysql-connector-j)
     - Maven (with wrapper scripts)
   - Packaging: Executable Spring Boot JAR.
   - Domain Model:
     - `User` entity with fields: `id`, `name`, `email`, `password`, `city`.
   - Architecture:
     - **Controller**: `MyController` defines REST endpoints.
     - **Service**: `UserService` + `UserServiceImpl` handle business logic.
     - **Repository**: `UserRepository` extends `JpaRepository<User, Integer>`.
   - Endpoints:
     - `POST /user` → Create user
     - `GET /users` → Fetch all users
     - `GET /user/{id}` → Fetch user by ID
     - `PUT /user/{id}` → Update user by ID
     - `DELETE /user/{id}` → Delete user by ID
   - Features:
     - JSON request/response.
     - Proper HTTP semantics (200 OK, 404 Not Found for missing resources).
     - Auto schema evolution with `spring.jpa.hibernate.ddl-auto=update`.
     - SQL logging enabled for debugging.
   - Configuration: `application.properties` defines datasource + JPA settings.
   - Testing: Basic Spring Boot context test under `src/test/java`.

## 🌿 Tech Stack 🌿

- **Java 21+**
- **MySQL 8.4.6**
- **Spring Boot 3.x**
- **Maven** for dependency management and project builds
- **Tomcat 11.0.10** for application server
- **Postman** for testing API
- Developed in **IntelliJ IDEA**
- Includes **Spring JAR files** in `Spring Jars` folder for offline use
