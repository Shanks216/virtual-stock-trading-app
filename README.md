# Virtual Stock Trading App — Backend

A secure and scalable backend service for a virtual stock trading platform built with Spring Boot. This application provides authentication, authorization, and core backend services for managing users and enabling integration with a frontend client.

---

## Tech Stack

- Java 17+
- Spring Boot
- Spring Security
- JWT (JSON Web Token) Authentication
- Maven
- Docker (optional)

---

## Project Structure

```text
backend/
├── src/
│   ├── main/
│   │   ├── java/com/virtualtrader/backend/
│   │   │   ├── config/        # Security, CORS, and application configuration
│   │   │   ├── controller/    # REST API controllers
│   │   │   ├── dto/           # Request and response models
│   │   │   ├── entity/        # Database entities
│   │   │   ├── repository/    # Data access layer
│   │   │   ├── security/      # JWT filters and services
│   │   │   └── service/       # Business logic
│   │   └── resources/
│   │       └── application.properties
│   └── test/
├── pom.xml
├── Dockerfile
├── mvnw
└── mvnw.cmd
```


---

## Features

- User registration and login
- JWT-based authentication and authorization
- Secure REST APIs using Spring Security
- CORS configuration for frontend integration
- Layered architecture for maintainability

---

## Setup and Installation

### 1. Clone the repository

git clone https://github.com/Shanks216/virtual-stock-trading-app.git
cd virtual-stock-trading-app

### 2. Build the project

On Linux/macOS:
./mvnw clean install

On Windows:
mvnw.cmd clean install

### 3. Run the application

./mvnw spring-boot:run

### 4. Access the application

http://localhost:6969

---

## API Endpoints

Authentication endpoints:

POST /api/auth/register  
Registers a new user

POST /api/auth/login  
Authenticates a user and returns a JWT token

---

## Docker

### Build the image

docker build -t virtual-trader-backend .

### Run the container

docker run -p 6969:6969 virtual-trader-backend

---

## Configuration

Edit the following file to configure environment variables:

src/main/resources/application.properties

Typical configurations include:
- Server port
- JWT secret key
- Database settings (if added)

---

## Testing

Run tests using:

./mvnw test

---

## Notes

- This repository contains backend services only
- A separate frontend application is required
- Ensure CORS settings allow requests from your frontend

---

## License

This project is licensed under the MIT License.

---

## Author

Shanks216

---

## Future Improvements

- Integration with real-time stock market APIs
- Portfolio and transaction management
- Trade simulation features
- Database integration (PostgreSQL/MySQL)
- Deployment setup (Docker Compose, cloud platforms)
