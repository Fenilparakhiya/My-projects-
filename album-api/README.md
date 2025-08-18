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
