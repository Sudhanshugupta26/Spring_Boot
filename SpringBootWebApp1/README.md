# SpringBootWebApp1

A simple Spring Boot MVC web application demonstrating user registration and login using JSP views and MySQL persistence via Spring Data JPA.

Project characteristics
- Architecture: Layered (Controller → Service → Repository → Entity)
- View technology: JSP (Jakarta EE) with view prefix/suffix mapping
- Persistence: Spring Data JPA with MySQL; Hibernate auto DDL update enabled
- Authentication: Basic email+password check (plain text comparison in service layer)
- Session/logout: Invalidates HTTP session on logout endpoint
- Build tool: Maven
- Java version: 21 (Spring Boot 3.5.x)
- Packaging: Executable Spring Boot JAR

Tech stack
- Spring Boot 3.5.5
- Spring MVC (spring-boot-starter-web)
- Spring Data JPA (spring-boot-starter-data-jpa)
- MySQL Connector/J (runtime)
- JSP support via Tomcat Jasper
- JSTL API
- Java 21, Maven

Features
- Register a new user and persist to MySQL
- Login with email and password
- Display a simple profile page after successful login
- Logout that invalidates the session
- Static pages (index.html, contact-us.html)

Modules and key classes
- Entity: src/main/java/.../entities/User.java
  - Fields: id (PK, auto), name, email, password, mobile
  - Table: users
- Repository: src/main/java/.../repositiories/UserRepository.java
  - Extends JpaRepository<User, Integer>
  - Custom finder: findByEmail(String email)
- Service: src/main/java/.../services/UserService.java & UserImpl.java
  - saveUser(User): persists a user (boolean status)
  - login(email, password): fetch by email and compare plain-text password
- Web Controller: src/main/java/.../controller/MyController.java
  - GET /regiPage → register.jsp
  - POST /register → saves user, sets Smessage/Emessage
  - GET /loginPage → login.jsp
  - POST /loginForm → authenticates; on success returns profile.jsp
  - GET /logout → invalidates session and redirects to /loginPage

Views and static resources
- JSP views (resolved with prefix/suffix from application.properties):
  - src/main/webapp/views/register.jsp
  - src/main/webapp/views/login.jsp
  - src/main/webapp/views/profile.jsp
- Static pages:
  - src/main/resources/static/index.html
  - src/main/resources/static/contact-us.html

Configuration
- src/main/resources/application.properties
  - spring.mvc.view.prefix=/views/
  - spring.mvc.view.suffix=.jsp
  - spring.datasource.url=jdbc:mysql://localhost:3306/springboot_mvcdb
  - spring.datasource.username=YOUR_USERNAME
  - spring.datasource.password=YOUR_PASSWORD
  - spring.jpa.hibernate.ddl-auto=update
  - spring.jpa.show-sql=true

How to run (Windows/Maven)
1) Prerequisites
   - Java 21 installed and JAVA_HOME configured
   - Maven installed (or use mvnw/mvnw.cmd wrapper)
   - A local MySQL instance with database springboot_mvcdb created:
     CREATE DATABASE springboot_mvcdb CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;
   - Update application.properties with your MySQL username/password
2) Build
   - Using wrapper: mvnw.cmd clean package
   - Or with Maven: mvn clean package
3) Run
   - java -jar target/SpringBootWebApp1-0.0.1-SNAPSHOT.jar
4) Access
   - Home: http://localhost:8080/
   - Register page: http://localhost:8080/regiPage
   - Login page: http://localhost:8080/loginPage

Security note
- Passwords are stored and compared in plain text in this demo. For production use, integrate Spring Security and hash passwords (e.g., BCrypt), add CSRF protection, validation, and proper session handling.

Project structure (simplified)
- pom.xml
- src/main/java/in/gupta/main/springbootwebapp1
  - SpringBootWebApp1Application.java
  - controller/MyController.java
  - entities/User.java
  - repositiories/UserRepository.java
  - services/{UserService.java, UserImpl.java}
- src/main/webapp/views/{login.jsp, register.jsp, profile.jsp}
- src/main/resources
  - application.properties
  - static/{index.html, contact-us.html}
- src/test/java/.../SpringBootWebApp1ApplicationTests.java

License
- Not specified.
