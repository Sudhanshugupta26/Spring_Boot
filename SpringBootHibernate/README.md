SpringBootHibernate — Project Characteristics

Overview
- A minimal Spring Boot application demonstrating direct Hibernate usage for ORM against a MySQL database.
- Uses programmatic SessionFactory setup via hibernate.cfg.xml instead of Spring Data JPA or Spring Boot auto-configured EntityManager.

Key Characteristics
- Language/Build: Java 21, Maven project (spring-boot-maven-plugin)
- Framework: Spring Boot 3.5.5 (spring-boot-starter)
- ORM/Persistence: Hibernate Core 5.6.15.Final with annotated entity classes
- Database: MySQL (mysql-connector-j 9.4.0)
- Configuration Style: Classic Hibernate XML (src/main/resources/hibernate.cfg.xml) with manual SessionFactory creation in main()
- JAXB: Explicit JAXB dependencies (jaxb-api, jaxb-core, jaxb-impl) to support older XML binding needs
- Packaging: Standard Spring Boot executable JAR

Runtime Behavior
- Application bootstraps Spring Boot and then manually builds a Hibernate SessionFactory using hibernate.cfg.xml.
- It opens a Session and performs a simple read (session.get) for User with id=1, then prints selected fields to stdout.
- No REST controllers or web endpoints included; this is a console-style demo inside a Spring Boot app context.

Domain Model
- Entity: in.gupta.main.entities.User mapped to table hibernate_user
  - Fields: id (IDENTITY), name, email, password, gender, city

Configuration Files
- application.properties
  - spring.application.name=SpringBootHibernate
- hibernate.cfg.xml
  - MySQL connection props (driver, url, username, password)
  - hbm2ddl.auto=update and show_sql=true
  - Mapping for in.gupta.main.entities.User

Notable Design Choices
- Hybrid approach: Spring Boot runtime with old-school Hibernate configuration and session management.
- Bypasses Spring Data JPA and Boot’s autoconfigured EntityManager, offering clearer visibility into Hibernate basics.
- Direct credentials and JDBC URL live in hibernate.cfg.xml (not externalized), which is fine for local demos but not recommended for production.

Prerequisites
- Java 21
- Maven 3.9+
- Local MySQL instance with a database named hibernate_db and appropriate credentials

How to Build & Run
- Build: mvn clean package
- Run: mvn spring-boot:run or java -jar target/SpringBootHibernate-0.0.1-SNAPSHOT.jar
- Expected behavior: Logs SQL statements to console; if a row with id=1 exists in hibernate_user, user fields are printed.

Future Enhancements (Ideas)
- Externalize DB credentials to application.properties or environment variables
- Replace manual SessionFactory with Spring Boot JPA auto-configuration and Spring Data repositories
- Add CRUD services and REST endpoints
- Add Flyway/Liquibase for schema management

Security Note
- The repository currently contains plaintext DB credentials in hibernate.cfg.xml; remove or secure them for any shared or production use.
