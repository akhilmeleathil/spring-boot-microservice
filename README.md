# 🛒 E-Commerce Microservice Application

A study-purpose project built with **Spring Boot** to simulate an e-commerce application using a microservices architecture.  
This repository demonstrates backend service design, API integration, and containerized deployment.

---

## 🚀 Features
- User authentication with **Spring Security + JWT**
- Role-based access control (Admin, Customer)
- Product catalog management
- Shopping cart and order management
- Payment simulation service
- RESTful APIs for communication between services
- Centralized configuration and service discovery
- Dockerized setup for reproducible deployment

---

## 🛠️ Tech Stack
| Layer              | Technology |
|--------------------|------------|
| Backend Framework  | Spring Boot |
| Database           | PostgreSQL, MongoDB |
| Security           | Spring Security, JWT |
| API Gateway        | Spring Cloud Gateway |
| Service Discovery  | Netflix Eureka |
| Containerization   | Docker |
| Build Tool         | Maven |

---

## 📂 Project Structure
ecommerce-microservice/ ├── product-service/        # Manages product catalog ├── order-service/          # Handles orders and cart ├── payment-service/        # Simulates payment workflow ├── user-service/           # Authentication & user management ├── api-gateway/            # Entry point for all requests ├── config-server/          # Centralized configuration └── discovery-server/       # Eureka service registr

---

## ⚙️ Setup & Installation
1. **Clone the repository**
   ```bash
   git clone https://github.com/your-username/ecommerce-microservice.git
   cd ecommerce-microservice
