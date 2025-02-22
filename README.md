# User Management Full-Stack Application (Spring Boot + React.js)

## Overview
This project is a full-stack **User Management System** built using **Spring Boot (Backend)** and **React.js (Frontend)**. It fetches user data from an **external API** (`https://dummyjson.com/users`), stores it in an **H2 in-memory database**, and provides RESTful APIs to retrieve user information.

## Tech Stack
### Backend:
- **Java 17**
- **Spring Boot** (Web, JPA, H2 Database, OpenAPI/Swagger, Resilience4J)
- **H2 Database** (In-Memory)
- **JUnit & Mockito** (Unit Testing)
- **Maven** (Build & Dependency Management)

### Frontend:
- **React.js** (Vite or Create React App)
- **React Router** (For Navigation)
- **Axios** (For API Requests)
- **CSS (TailwindCSS or Vanilla CSS)**

## Features
 Fetches user data from an external API (`https://dummyjson.com/users`).  
 Stores users in an **H2 database** on backend startup.  
 Provides **RESTful APIs** for user management.  
 Displays users in a **grid format** using React.js.  
 Allows **filtering users by role** and **sorting by age**.  
 **Responsive Design** with React Router-based navigation.  
 **Unit tests** for backend services and API endpoints.  
 **Swagger UI** for API documentation.  

## Installation & Setup
### **1 Clone the Repository**
```bash
git clone https://github.com/yourusername/user-management.git
cd user-management
```

### **2 Setup Backend (Spring Boot)**
#### **Prerequisites:**
- Java 17+
- Maven 3+

#### **Run Backend**
```bash
cd backend
mvn spring-boot:run
```
Backend will start at **`http://localhost:8080`**

#### **Test API Endpoints in Postman or Swagger**
- **Swagger UI:** [http://localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html)

### **3 Setup Frontend (React.js)**
#### **Prerequisites:**
- Node.js 16+
- npm or yarn

#### **Run Frontend**
```bash
cd frontend
npm install
npm start
```
Frontend will start at **`http://localhost:3000`**

## API Endpoints
| Method | Endpoint | Description |
|--------|---------|-------------|
| **GET** | `/users` | Get all users |
| **GET** | `/users/role/{role}` | Get users by role |
| **GET** | `/users/sorted?ascending=true` | Get users sorted by age |
| **GET** | `/users/{id}` | Get user by ID |
| **GET** | `/users/ssn/{ssn}` | Get user by SSN |

## 🧪 Running Tests
### Backend Tests
```bash
cd backend
mvn test
```
### Frontend Tests (If Implemented)
```bash
cd frontend
npm test
```




