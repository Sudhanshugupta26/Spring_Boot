# SpringBootRegLogin

A simple Spring Boot 3 application demonstrating user registration and login using Thymeleaf views, Spring Data JPA, and MySQL.

## Project Characteristics
- Purpose: Showcase a minimal end‑to‑end auth flow (register, login, view profile, logout) using MVC + Thymeleaf.
- Tech Stack:
  - Java 21
  - Spring Boot 3.5.5
  - Spring Web (MVC)
  - Spring Data JPA
  - Thymeleaf
  - MySQL (runtime driver: mysql-connector-j)
  - Maven
- Architecture:
  - Controller layer: Handles HTTP requests and returns Thymeleaf templates.
  - Service layer: Encapsulates business logic for registering and validating users.
  - Repository layer: JPA repository for User entity persistence.
  - View layer: Thymeleaf templates for register, login, and profile pages.
- Persistence:
  - JPA/Hibernate with a `User` entity containing fields such as `id`, `name`, `email`, `password`.
- Views (Thymeleaf templates):
  - `register.html` — Registration form and success/error messages.
  - `login.html` — Login form and failure messages.
  - `profile.html` — Simple profile page showing the logged-in user’s name.
- Routing/Endpoints:
  - `GET /register` — Show registration page.
  - `POST /regiForm` — Handle registration submissions.
  - `GET /login` — Show login page.
  - `POST /loginForm` — Handle login submissions.
  - `GET /logout` — Invalidate session and return to login page.
- Session handling:
  - On logout, existing HTTP session is invalidated.
- Templates/Data binding:
  - Forms bind to `User` model attributes via `@ModelAttribute`.

## Source Layout
- `src/main/java/in/gupta/main/springbootreglogin/`
  - `controller/MyController.java` — MVC controller for auth flows.
  - `entities/User.java` — JPA entity for users.
  - `repository/UserRepo.java` — Spring Data JPA repository.
  - `service/UserService.java`, `service/UserServiceImpl.java` — Business logic.
- `src/main/resources/templates/` — Thymeleaf templates (`register.html`, `login.html`, `profile.html`).
- `src/main/resources/application.properties` — App configuration (DB settings, etc.).

## Building and Running
Prerequisites:
- Java 21
- Maven 3.9+
- MySQL running and reachable; configure credentials in `src/main/resources/application.properties`.

Steps:
1. Configure database properties in `application.properties` (example):
   - spring.datasource.url=jdbc:mysql://localhost:3306/your_db
   - spring.datasource.username=your_user
   - spring.datasource.password=your_password
   - spring.jpa.hibernate.ddl-auto=update
2. Build: `mvn clean package`
3. Run: `mvn spring-boot:run` or run the generated jar in `target/`.
4. Access in browser:
   - Registration page: http://localhost:8080/register
   - Login page: http://localhost:8080/login

## Notes & Limitations
- Passwords are stored and compared as-is in this demo (no hashing). For production, always hash and salt passwords (e.g., BCryptPasswordEncoder).
- No CSRF protection or validation hardening included; add standard Spring Security for real applications.
- Minimal error handling and input validation; extend as needed.

## License
This project is for educational/demo purposes. Add a license of your choice if distributing.