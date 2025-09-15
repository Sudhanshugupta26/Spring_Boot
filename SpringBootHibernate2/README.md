# SpringBootHibernate2

Project characteristics and overview (as of 2025-09-15 20:40 local time):

- Tech stack
  - Java 21
  - Spring Boot 3.5.5 (spring-boot-starter)
  - Hibernate ORM 5.6.15.Final (configured via hibernate.cfg.xml)
  - MySQL Connector/J 9.4.0
  - JAXB (api/core/impl) for XML binding compatibility
  - Build tool: Maven

- Architecture
  - Layered, minimal example integrating Spring Boot with plain Hibernate (without Spring Data JPA)
  - Packages:
    - in.gupta.main.config: Hibernate configuration (SessionFactory)
    - in.gupta.main.entities: JPA/Hibernate entity classes (User)
    - in.gupta.main.repository: Repository abstraction (DBOperation) and implementation (DBOpsImpl) using native Hibernate Session
    - in.gupta.main.springboothibernate2: Spring Boot bootstrap class

- Key components
  - HibernateConfig: exposes a static method to build and return a SessionFactory from hibernate.cfg.xml
  - User entity: mapped to table `hibernate_user` with fields id, name, email, password, gender, city
  - DBOperation interface: declares data access contract (e.g., getUserById)
  - DBOpsImpl: Spring @Repository using Hibernate Session to fetch User by id
  - SpringBootHibernate2Application: Bootstraps Spring application context and demonstrates retrieving a User with ID=1 and printing selected fields

- Configuration
  - hibernate.cfg.xml in src/main/resources provides Hibernate properties (dialect/connection/etc.) and mappings
  - application.properties present for Spring Boot configuration

- How it works (runtime flow)
  1. Spring Boot starts and creates the application context.
  2. A DBOperation bean is discovered (@Repository on DBOpsImpl).
  3. The main method requests the DBOperation bean and calls getUserById(1L).
  4. DBOpsImpl opens a Hibernate Session from SessionFactory and loads the User entity.
  5. Selected fields of the retrieved User are printed to console.

- Notable choices
  - Uses classic Hibernate SessionFactory and manual session handling instead of Spring Data JPA or EntityManager.
  - SessionFactory creation is static and not a managed Spring bean; consider refactoring to a @Configuration with a @Bean for better lifecycle management.
  - Direct System.out.println in main is used for demonstration rather than a service/web layer or logging framework.

- Prerequisites
  - Java 21
  - Maven 3.9+
  - Running MySQL instance with a database/schema matching hibernate.cfg.xml settings and a table `hibernate_user` containing at least one row with id=1

- Build and run
  - Build: mvn clean package
  - Run: mvn spring-boot:run or run the main class SpringBootHibernate2Application

- Future improvements (suggestions)
  - Manage SessionFactory as a Spring bean and leverage dependency injection
  - Introduce a Service layer between controller/main and repository
  - Replace direct printing with logging (SLF4J/Logback) and/or expose REST endpoints
  - Externalize DB credentials to application.properties and environment variables
  - Add tests covering repository methods with an embedded database or testcontainers

- Project metadata (from pom.xml)
  - groupId: in.gupta.main
  - artifactId: SpringBootHibernate2
  - version: 0.0.1-SNAPSHOT
