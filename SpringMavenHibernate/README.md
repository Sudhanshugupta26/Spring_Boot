# SpringMavenHibernate

A minimal Java console project demonstrating how to use plain Hibernate (no Spring) with Maven to perform basic CRUD operations against a MySQL database.

Key characteristics
- Tech stack: Java, Maven, Hibernate Core 5.6.x, MySQL Connector/J 9.x, JUnit 3 (tests scaffolded).
- Packaging: jar; entry point in in.gupta.main.App.
- ORM mapping: Annotation-based JPA entity in.gupta.entity.User mapped to table hibernate_user.
- Configuration: hibernate.cfg.xml defines MySQL connection, hbm2ddl.auto=update, and SQL logging enabled.
- Example CRUD: App.java includes examples (commented/active) for insert, read, update, and delete using Session/Transaction API.
- Target DB: jdbc:mysql://localhost:3306/hibernate_db (username=root). You must provide a valid password/user locally.

Project layout
- pom.xml: Maven project configuration and dependencies.
- src/main/java/in/gupta/entity/User.java: JPA @Entity with fields id, name, email, password, gender, city.
- src/main/java/in/gupta/main/App.java: main method showcasing CRUD patterns with Hibernate SessionFactory/Session/Transaction.
- src/main/resources/hibernate.cfg.xml: Hibernate configuration, datasource and mappings.
- src/test/java/in/gupta/main/AppTest.java: basic JUnit placeholder.

Prerequisites
- Java 8+ (project uses standard Hibernate 5; Java 11+ also works).
- Maven 3.6+.
- MySQL 8+ running locally with a database named hibernate_db.

Setup and run
1. Ensure MySQL is running and create DB: CREATE DATABASE hibernate_db;.
2. Update src/main/resources/hibernate.cfg.xml with your MySQL username and password.
3. Build: mvn clean package.
4. Run: java -cp target/SpringMavenHibernate-1.0-SNAPSHOT.jar;target/dependency/* in.gupta.main.App
   - Alternatively, use your IDE to run App.main.

Notes
- hbm2ddl.auto=update will create/alter the table; for production, prefer validated schema management.
- The current main method executes a delete example; switch between the commented sections to test other CRUD operations.
- Avoid committing real credentials to VCS; consider environment variables or Maven profiles for local secrets.

License
- This repository does not declare a license; add one if you intend to distribute.