# Raj Estate 🏡

Raj Estate is a web application built using **Spring Boot** for the backend and **JavaScript** for the frontend. It helps manage real estate properties efficiently by organizing **colonies**, **plots**, and **customer data** in a structured, visual, and user-friendly way.

## 🔑 Features

- **User Authentication**: Sign up and log in securely.
- **Colony Management**: Create and manage colonies.
- **Plot Tracking**:
  - Add and view plots under each colony.
  - Sold plots are marked **green**.
  - Unsold plots are marked **red**.
- **Customer Management**:
  - View customer details including name, contact number, and purchased plots.
  - Each customer's purchased plots are mapped with the respective colony.
- **Real-time Updates**:
  - When a plot is sold, both colony and customer records are updated accordingly.

## 🗂️ Application Structure

- Colonies can have multiple plots.
- Plots can be sold to customers.
- Customers are linked with the plots they’ve purchased.

## 🛠 Tech Stack

- **Backend**: Spring Boot
- **Frontend**: HTML, CSS, JavaScript
- **Database**: MongoDB
- **Authentication**: JWT (JSON Web Tokens)
- **Caching**: Redis
- **Containerization**: Docker
- **Orchestration**: Kubernetes

## 🚀 How to Run Locally

1. **Clone the repository**
   ```bash
   git clone https://github.com/KaranG03/RajEstate.git
   cd raj-estate

2. **Configure the Backend**
   - Set up your `application.properties` (or `application.yml`) with:
     - MongoDB connection string
     - Redis configuration
     - JWT secret key
   - Example:
     ```properties
     spring.data.mongodb.uri=mongodb://localhost:27017/raj_estate
     jwt.secret=your_jwt_secret
     spring.redis.host=localhost
     spring.redis.port=6379
     ```

3. **Run the Application**
   - Use Maven or your IDE to start the Spring Boot app:
     ```bash
     ./mvnw spring-boot:run
     ```
   - Or build and run the JAR:
     ```bash
     ./mvnw clean package
     java -jar target/raj-estate-0.0.1-SNAPSHOT.jar
     ```

## 📸 Screenshots

### 🏠 Home Page
![Home](https://github.com/KaranG03/eCom/blob/master/Home.png?raw=true)

### 🔐 Sign Up
![Sign Up](https://github.com/KaranG03/eCom/blob/master/Signup.png?raw=true)

### 🔑 Login
![Login](https://github.com/KaranG03/eCom/blob/master/login.png?raw=true)

### 📊 Dashboard
![Dashboard](https://github.com/KaranG03/eCom/blob/master/dashboard.png?raw=true)

### 🏘️ Add New Colony
![Add Colony](https://github.com/KaranG03/eCom/blob/master/add%20colony.png?raw=true)

### 🟢 Sold Plots
![Sold Plot](https://github.com/KaranG03/eCom/blob/master/sold%20plots.png?raw=true)

### 🔴 Unsold Plots
![Unsold Plots](https://github.com/KaranG03/eCom/blob/master/unsold%20plots.png?raw=true)

### ✏️ Edit Plot Details
![Edit Plot](https://github.com/KaranG03/eCom/blob/master/edit%20plot%20details.png?raw=true)

### 📋 Customer List
![Customers](https://github.com/KaranG03/eCom/blob/master/customer.png?raw=true)
