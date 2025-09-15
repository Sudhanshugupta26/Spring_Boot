# SpringBootRestfulWS

A simple Spring Boot RESTful web service that exposes CRUD APIs to manage User resources persisted via Spring Data JPA to a MySQL database.

## Project Characteristics
- Purpose: Demonstrates a layered Spring Boot REST API (Controller → Service → Repository) for basic user management.
- Domain Model: `User` entity with fields: id, name, email, password, city.
- Persistence: Spring Data JPA with MySQL; `ddl-auto=update` for schema evolution; SQL logging enabled.
- Endpoints:
  - POST `/user` – create a user
  - GET `/users` – list all users
  - GET `/user/{id}` – get a user by id
  - PUT `/user/{id}` – update a user by id
  - DELETE `/user/{id}` – delete a user by id
- HTTP Semantics: JSON request/response; 200 for success, 404 when resource not found (GET/PUT/DELETE by id).
- Architecture: 
  - Controller: `MyController` exposes REST endpoints.
  - Service: `UserService` + `UserServiceImpl` encapsulate business logic.
  - Repository: `UserRepository` extends `JpaRepository<User, Integer>`.
- Tech Stack: Java, Spring Boot, Spring Web, Spring Data JPA, MySQL, Maven.
- Configuration: `src/main/resources/application.properties` includes datasource and JPA settings.
- Build tool: Maven (mvnw provided for wrapper usage).
- Tests: Basic Spring context test present in `src/test/java`.

## Getting Started

### Prerequisites
- JDK 17+ (compatible with your Spring Boot configuration)
- MySQL running locally with a database named `restful_db`
- Maven (or use the provided Maven Wrapper `mvnw` / `mvnw.cmd`)

### Configuration
Edit `src/main/resources/application.properties` with your local MySQL credentials:
```
spring.datasource.url=jdbc:mysql://localhost:3306/restful_db
spring.datasource.username=<your-username>
spring.datasource.password=<your-password>
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

Note: Do not commit real passwords to version control. Consider using environment variables or Spring Boot externalized configuration for secrets.

### Build and Run
- Build: `./mvnw clean package` (Linux/macOS) or `mvnw.cmd clean package` (Windows)
- Run: `./mvnw spring-boot:run` or execute the generated jar in `target/`

The application will start on `http://localhost:8080` by default.

## API Examples
- Create User
  - POST `http://localhost:8080/user`
  - Body:
    ```json
    {
      "name": "Alice",
      "email": "alice@example.com",
      "password": "secret",
      "city": "Delhi"
    }
    ```
- Get All Users
  - GET `http://localhost:8080/users`
- Get User By Id
  - GET `http://localhost:8080/user/1`
- Update User
  - PUT `http://localhost:8080/user/1`
  - Body: same shape as create
- Delete User
  - DELETE `http://localhost:8080/user/1`

## Project Structure
- `in.gupta.main.SpringBootRestfulWsApplication` – Spring Boot entry point
- `in.gupta.main.controller.MyController` – REST endpoints
- `in.gupta.main.entities.User` – JPA entity
- `in.gupta.main.services.*` – service interface and implementation
- `in.gupta.main.repository.UserRepository` – JPA repository

## Notes & Limitations
- No DTOs or validation currently; payloads map directly to the entity.
- `updateUser` saves the provided `newUser` as-is; ensure its `id` matches the path id.
- No authentication/authorization implemented.
- Error handling is minimal (404 for not found; runtime exception in service on missing user during update).

## License
This project is provided as-is for learning purposes. Add a license file if needed.
