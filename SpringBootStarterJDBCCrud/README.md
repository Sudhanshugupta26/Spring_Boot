# SpringBootStarterJDBCCrud

A minimal Spring Boot project demonstrating CRUD operations using Spring JDBC (JdbcTemplate) against a MySQL database. The example manages a simple User domain and shows how to structure DAO, RowMapper, entity classes, and a command-line runner to trigger data operations at startup.

Project characteristics
- Purpose: Showcase straightforward JDBC-based CRUD without JPA/Hibernate overhead.
- Tech stack: 
  - Java + Spring Boot
  - Spring JDBC (JdbcTemplate)
  - MySQL (configurable via application.properties)
- Domain model: User with fields name, email, city, gender.
- Data access: Hand-coded SQL in a DAO class with robust try/catch around updates.
- Mapping: Custom RowMapper converts ResultSet rows to User objects.
- Execution mode: CommandLineRunner runs on application startup; code snippets provided to insert, update, delete, fetch one, or fetch all users.

Modules and key classes
- in.gupta.main.springbootstarterjdbccrud.SpringBootStarterJdbcCrudApplication
  - Spring Boot entry point; implements CommandLineRunner to demonstrate DAO usage.
- in.gupta.main.springbootstarterjdbccrud.dao.UserDAO
  - insertUser(User), updateUser(User), deleteUser(String email), getUserByEmail(String email), getALlUsers().
  - Uses JdbcTemplate and plain SQL.
- in.gupta.main.springbootstarterjdbccrud.mapper.UserRowMapper
  - Maps ResultSet to User.
- in.gupta.main.springbootstarterjdbccrud.entity.User
  - POJO for name, email, city, gender.

Configuration
- src/main/resources/application.properties
  - spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
  - spring.datasource.url=jdbc:mysql://localhost:3306/Spring_boot_JDBC
  - spring.datasource.username=YOUR_USERNAME
  - spring.datasource.password=YOUR_PASSWORD

Database prerequisites
- MySQL schema must exist (default: Spring_boot_JDBC).
- A table named `user` with columns (name VARCHAR, email VARCHAR PRIMARY KEY/UNIQUE, city VARCHAR, gender VARCHAR) is expected. Example DDL:
  CREATE TABLE user (
    name   VARCHAR(100) NOT NULL,
    email  VARCHAR(150) NOT NULL PRIMARY KEY,
    city   VARCHAR(100),
    gender VARCHAR(20)
  );

How to run
1. Update application.properties with your MySQL connection details.
2. Ensure the database and `user` table exist.
3. Build and run:
   - Windows (PowerShell):
     mvnw.cmd clean spring-boot:run
   - Or package and run the jar:
     mvnw.cmd clean package
     java -jar target\SpringBootStarterJDBCCrud-*.jar

Sample usage (via CommandLineRunner)
- Open SpringBootStarterJdbcCrudApplication and uncomment one of the code blocks to:
  - Insert a user
  - Update a user
  - Delete a user by email
  - Get one user by email
  - List all users
- Re-run the application to execute the chosen operation and observe console logs.

Design notes
- Simplicity first: No ORM; SQL is explicit and transparent.
- Clear separation of concerns: Entity, DAO, RowMapper, bootstrap class.
- Ready for extension: Add services, controllers, or REST endpoints if needed.

Test
- A basic SpringBootStarterJdbcCrudApplicationTests class exists (default Spring Boot test scaffolding). Extend with integration tests against an embedded database (e.g., Testcontainers/MySQL) for real CRUD verification.

License
- Not specified. Add a LICENSE file if you plan to distribute.

Last updated: 2025-09-15 20:38 (local)