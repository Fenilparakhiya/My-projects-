# BlogSite (Blogging Platform) — Spring Boot + Thymeleaf (Secure Blogging Platform)

A production-style **blog application** built with **Spring Boot 3**, **Thymeleaf**, and **Spring Security**. Features authentication, role-based access to author features, server-rendered pages, validation, password-reset via email, and a persistent **H2 file database** for easy local demos.

---

## ✨ Features

- **Authentication & Roles** — Spring Security + Thymeleaf security dialect (show/hide UI by role)
- **Blog CRUD** — create, edit, delete, and view posts
- **Validation** — robust bean validation on forms
- **Password Reset** — time-boxed token flow (configurable)
- **Email Delivery** — SMTP integration (Gmail-compatible)
- **Persistent Local DB** — H2 **file** mode (not in-memory) for a realistic dev experience
- **Developer UX** — devtools, H2 Console, clean layered architecture

---

## 🧱 Tech Stack

- **Java 17+, Spring Boot 3.3.3**
- Spring Web, Spring Data JPA, Spring Security, Validation
- **Thymeleaf** + extras: `thymeleaf-extras-springsecurity6`, `thymeleaf-extras-java8time`
- **H2 Database** (file mode), Lombok, DevTools, Mail
- Build: **Maven**

---

## 🚀 Run Locally (Quick Start)

> Prereqs: **Java 17+** and **Maven**

```bash
mvn clean spring-boot:run

	•	App:            http://localhost:8080/
	•	H2 Console:     http://localhost:8080/db-console

Build fat JAR:
  mvn clean package
  java -jar target/BlogSite-*.jar

⚙️ Configuration (already set)
*properties
server.port=8080

*H2 Console
spring.datasource.url=jdbc:h2:file:./db/blogdb
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=admin
spring.datasource.password=pass987
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
spring.jpa.hibernate.ddl-auto=create-drop   # dev only
spring.jpa.properties.hibernate.enable_lazy_load_no_trans=true

*Thymeleaf
thymeleaf.version=3.0.4.RELEASE
thymeleaf-layout-dialect.version=2.1.1

password.token.reset.timeout.minutes=600
site.domain=http://localhost:8080/

*Email (SMTP)
spring.config.import=secrect.properties
spring.mail.host=smtp.gmail.com
spring.mail.port=587
spring.mail.properties.mail.smtp.auth=true
spring.mail.properties.mail.smtp.starttls.enable=true
spring.mail.smtp.ssl.trust=smtp.gmail.com
mail.transport.protocol=smtp

*Create secrect.properties (not committed) with:
spring.mail.username=your_email@example.com
spring.mail.password=your_app_password

*Logging Properties
logging.level.org.fenil.BlogSite=INFO
logging.file.name=appLog.log

🔐 Security Notes
	•	Secured endpoints and views (Spring Security + Thymeleaf Security)
	•	Password reset uses time-boxed token (password.token.reset.timeout.minutes)
	•	For demos, expose public routes (home/post list) and require auth for authoring

⸻

🧪 Demo Data & DB Notes
	•	Using H2 file DB ⇒ data persists at ./db/blogdb
	•	spring.jpa.hibernate.ddl-auto=create-drop recreates schema on start/stop
(great for demos, not for production)

☑️ What This Demonstrates 
	•	Secure, server-rendered Spring Boot app with clean layering
	•	Auth, roles, validation, email workflows (real backend responsibilities)
	•	Sensible configuration (secrets externalized, persistent local DB)
	•	Production-minded logging and console access for debugging

⸻

👤 Author

Fenil Parakhiya — Toronto, ON
LinkedIn: https://www.linkedin.com/in/fenil-parakhiya
GitHub:   https://github.com/Fenilparakhiya
