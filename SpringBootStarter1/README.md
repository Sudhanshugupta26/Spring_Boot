# SpringBootStarter1 — Spring Boot Web Application

This project is a minimal Spring Boot (3.5.x) web application that demonstrates a clean, annotation-driven MVC entry point using Spring Web. It mirrors the spirit of a layered Spring MVC app while leveraging Spring Boot’s auto-configuration to reduce boilerplate.

Key characteristics
- Clean, annotation-driven controller: The presentation layer is represented by a simple `@Controller` that handles the root path ("/") and returns a plain text response. The method uses `@GetMapping` and `@ResponseBody` to directly return content to the client.
- Auto-configured DispatcherServlet: Instead of a traditional `web.xml`, Spring Boot auto-configures the `DispatcherServlet` and supporting infrastructure. Routes configured via annotations in controllers are automatically detected via component scanning.
- Logical views (ready for extension): While the current controller returns a plain string body, the project can be easily extended to return logical view names (e.g., Thymeleaf, JSP with additional setup) resolved by a view resolver if desired.
- Modular, annotation-driven design: The project uses `@SpringBootApplication` for bootstrap and component scanning and `@Controller`/`@GetMapping` for request mapping. This supports easy scalability to add `@PostMapping`, `@RequestMapping`, and `@ModelAttribute` methods as the app grows.
- Ready for layering: Business and data layers can be introduced as separate packages (e.g., `service`, `repository`) and wired via `@Service`, `@Repository`, and dependency injection. The current footprint is intentionally minimal.
