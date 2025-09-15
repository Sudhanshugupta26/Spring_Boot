# SpringBootThymeleaf — Project Characteristics

This repository is a minimal Spring Boot web application showcasing server-side rendering with Thymeleaf. It demonstrates fundamental Thymeleaf features such as variable rendering, conditional rendering, and list iteration, wired through a simple Spring MVC controller and exposed via intuitive endpoints.

Key characteristics
- Tech stack: Spring Boot (Web, MVC), Thymeleaf, Java 17+ (adjust if your local JDK differs), Maven.
- Purpose: Educational/demo project to illustrate how to integrate Thymeleaf templates with Spring MVC controllers.
- Stateless demo: No database; data is provided in-memory within the controller for clarity.
- Simple routing: Three GET endpoints mapped to three templates, plus a static index page with links.
- Fast start: Runs as a standard Spring Boot app with embedded Tomcat (no external app server needed).

Features demonstrated
- Profile page: Binds a simple String model attribute and displays it using th:text.
  - GET /myProfile → templates/profile.html
- Conditional rendering: Uses th:if to compare two integers and show the appropriate message.
  - GET /myConditional → templates/conditional.html
- Looping over collections: Iterates over a List<Integer> with th:each to render list items.
  - GET /myLoop → templates/loop.html
- Static landing page: Simple HTML page that links to all sample routes.
  - GET / (served from src/main/resources/static/index.html when app root is requested)

Project layout (selected files)
- src/main/java/in/gupta/main/springbootthymeleaf/
  - SpringBootThymeleafApplication.java — application bootstrap (Spring Boot).
  - controller/MyController.java — MVC controller exposing the demo endpoints.
- src/main/resources/
  - static/index.html — landing page with links to the demos.
  - templates/profile.html — variable binding example.
  - templates/conditional.html — conditional rendering example.
  - templates/loop.html — collection iteration example.
  - application.properties — Spring Boot config (empty/basic by default).

How to run locally
1) Prerequisites
   - Java 17+ installed and on PATH (set JAVA_HOME).
   - Maven installed (or use mvnw/mvnw.cmd provided).
2) Build & run (Windows PowerShell)
   - .\mvnw.cmd spring-boot:run
   - Or: .\mvnw.cmd clean package && java -jar target\\SpringBootThymeleaf-*.jar
3) Open the app
   - Navigate to http://localhost:8080/
   - Try these endpoints directly:
     - http://localhost:8080/myProfile
     - http://localhost:8080/myConditional
     - http://localhost:8080/myLoop

Notes
- No database configuration is required.
- The templates leverage the Thymeleaf XML namespace: xmlns:th="http://www.thymeleaf.org".
- This project is ideal as a starting point for learning Thymeleaf or for bootstrapping a simple SSR module in a larger Spring application.

License
- This code is provided as-is for learning/demonstration purposes. Add a specific license if needed for your distribution use case.
