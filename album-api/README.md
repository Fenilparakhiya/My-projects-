# Album Management Backend API

A secure **RESTful API** for managing albums and photos, built with **Spring Boot 3**.  
Features **JWT/OAuth2 resource server** support, **H2** for local development, **OpenAPI/Swagger UI** docs, and optional **image processing** (thumbnails) via `imgscalr`.

> Tech: Spring Boot 3.3.x, Spring Web, Spring Data JPA, Validation, OAuth2 Resource Server (JWT), Actuator, H2, springdoc-openapi 2.x, Lombok.

---

## ✨ Features

- **Albums & Photos**: CRUD endpoints and relationships
- **Security**: Bearer **JWT** validation via Spring Security (resource server)
- **Validation**: Bean Validation for request DTOs
- **Persistence**: JPA/Hibernate with **H2** (in-memory) by default
- **Docs**: **Swagger UI** + OpenAPI 3
- **Observability**: Spring Boot **Actuator** endpoints
- **(Optional)** Image processing (resize/thumbnails) via **imgscalr**

---

## 🧱 Stack

- **Java**: 17+
- **Frameworks**: Spring Boot (Web, Data JPA, Validation, Security)
- **DB**: H2 (runtime), easily swappable to MySQL/Postgres
- **Docs**: springdoc-openapi-starter-webmvc-ui
- **Build**: Maven (Spring Boot Maven Plugin)
- **Utils**: Lombok, imgscalr

---

## 🚀 Run Locally

> Prereqs: **Java 17+** and **Maven**.

```bash
# from album-api/
mvn clean spring-boot:run
<img width="468" height="619" alt="image" src="https://github.com/user-attachments/assets/8f7852e0-c4c2-4540-89e0-b47895211a9d" />


	•	API base (example): http://localhost:8080/api
	•	Swagger UI:
	•	http://localhost:8080/swagger-ui.html or
	•	http://localhost:8080/swagger-ui/index.html
	•	OpenAPI JSON: http://localhost:8080/v3/api-docs
	•	H2 Console: http://localhost:8080/h2-console

Default H2 Settings (dev)
	•	JDBC URL: jdbc:h2:mem:albumdb
	•	User: sa
	•	Password: (blank)

These are typical defaults—adjust to match your application.yml/application.properties if different.

🔐 Security (JWT Resource Server)

This service validates Bearer JWT tokens on protected endpoints.
	1.	Obtain a JWT from your auth server (e.g., Keycloak, Cognito, custom issuer).
	2.	Call protected endpoints with: Authorization: Bearer <YOUR_JWT>
  3.	Configure issuer/JWK in application.yml:
    spring:
  security:
    oauth2:
      resourceserver:
        jwt:
         NO ACCESS on Git.

🗺️ Roadmap :
Soft deletes & audit fields
	•	Pagination + filtering on list endpoints
	•	RBAC roles (USER/ADMIN) and fine-grained policies
	•	Rate limiting, request size limits on uploads
👤 Author

Fenil Parakhiya — Toronto, ON
LinkedIn: https://www.linkedin.com/in/fenil-parakhiya
GitHub: https://github.com/Fenilparakhiya
