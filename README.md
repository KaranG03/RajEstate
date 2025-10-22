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
![Home](https://private-user-images.githubusercontent.com/137709248/456141976-a946d16c-e738-4cf8-a57a-4d29be859e40.png?jwt=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpc3MiOiJnaXRodWIuY29tIiwiYXVkIjoicmF3LmdpdGh1YnVzZXJjb250ZW50LmNvbSIsImtleSI6ImtleTUiLCJleHAiOjE3NjExMTQ0ODUsIm5iZiI6MTc2MTExNDE4NSwicGF0aCI6Ii8xMzc3MDkyNDgvNDU2MTQxOTc2LWE5NDZkMTZjLWU3MzgtNGNmOC1hNTdhLTRkMjliZTg1OWU0MC5wbmc_WC1BbXotQWxnb3JpdGhtPUFXUzQtSE1BQy1TSEEyNTYmWC1BbXotQ3JlZGVudGlhbD1BS0lBVkNPRFlMU0E1M1BRSzRaQSUyRjIwMjUxMDIyJTJGdXMtZWFzdC0xJTJGczMlMkZhd3M0X3JlcXVlc3QmWC1BbXotRGF0ZT0yMDI1MTAyMlQwNjIzMDVaJlgtQW16LUV4cGlyZXM9MzAwJlgtQW16LVNpZ25hdHVyZT1kNDM5NDFmNWY2ZjE0ZDFlMTMxYTZiNTQ5MzY0MDYyNTVmMjRlYmY0ODkxMzJlODBiYTg1NTJmODkxMjFjNzkwJlgtQW16LVNpZ25lZEhlYWRlcnM9aG9zdCJ9.mvkt7b2ih4IR3ARMo8AqtZ5XvDBdubtoRvSoLVOB5E4)

### 🔐 Sign Up
![Sign Up](https://private-user-images.githubusercontent.com/137709248/456142306-ea1996e3-ac80-4631-bb74-81ae0e83015b.png?jwt=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpc3MiOiJnaXRodWIuY29tIiwiYXVkIjoicmF3LmdpdGh1YnVzZXJjb250ZW50LmNvbSIsImtleSI6ImtleTUiLCJleHAiOjE3NjExMTQ1NjAsIm5iZiI6MTc2MTExNDI2MCwicGF0aCI6Ii8xMzc3MDkyNDgvNDU2MTQyMzA2LWVhMTk5NmUzLWFjODAtNDYzMS1iYjc0LTgxYWUwZTgzMDE1Yi5wbmc_WC1BbXotQWxnb3JpdGhtPUFXUzQtSE1BQy1TSEEyNTYmWC1BbXotQ3JlZGVudGlhbD1BS0lBVkNPRFlMU0E1M1BRSzRaQSUyRjIwMjUxMDIyJTJGdXMtZWFzdC0xJTJGczMlMkZhd3M0X3JlcXVlc3QmWC1BbXotRGF0ZT0yMDI1MTAyMlQwNjI0MjBaJlgtQW16LUV4cGlyZXM9MzAwJlgtQW16LVNpZ25hdHVyZT1kZWEyMGNiZWM3ZWQwODUyMmQ4ZGIzYzE5ZTFiNzZlMjgyMzM1YzliNGRmOTQwMDIyZGY4Nzg2MTZiOTBhNWQ5JlgtQW16LVNpZ25lZEhlYWRlcnM9aG9zdCJ9.pguLXduEp-M8QkiXY3GE9Bc60zuuR4vtF3FoJj_MeR8)

### 🔑 Login
![Login](https://private-user-images.githubusercontent.com/137709248/456141975-8a71a497-8917-4d4f-bf7c-4b0d00198e67.png?jwt=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpc3MiOiJnaXRodWIuY29tIiwiYXVkIjoicmF3LmdpdGh1YnVzZXJjb250ZW50LmNvbSIsImtleSI6ImtleTUiLCJleHAiOjE3NjExMTQ1NjAsIm5iZiI6MTc2MTExNDI2MCwicGF0aCI6Ii8xMzc3MDkyNDgvNDU2MTQxOTc1LThhNzFhNDk3LTg5MTctNGQ0Zi1iZjdjLTRiMGQwMDE5OGU2Ny5wbmc_WC1BbXotQWxnb3JpdGhtPUFXUzQtSE1BQy1TSEEyNTYmWC1BbXotQ3JlZGVudGlhbD1BS0lBVkNPRFlMU0E1M1BRSzRaQSUyRjIwMjUxMDIyJTJGdXMtZWFzdC0xJTJGczMlMkZhd3M0X3JlcXVlc3QmWC1BbXotRGF0ZT0yMDI1MTAyMlQwNjI0MjBaJlgtQW16LUV4cGlyZXM9MzAwJlgtQW16LVNpZ25hdHVyZT1jYmJiZjViMzI3N2U4MjVmN2NhYmU0NjIxMjFjNWZhYzc1NjAyMzBjMTIzNTg5M2YzZGNjMjJlYTA2NTVkZTQ0JlgtQW16LVNpZ25lZEhlYWRlcnM9aG9zdCJ9.wCYK1CX0tHkohnunzT4V9lrv7r3-IkgdsBeKP5x0Lfo)

### 📊 Dashboard
![Dashboard](https://private-user-images.githubusercontent.com/137709248/456142307-ef4c018d-dea6-4f14-af41-a8cf9d5af736.png?jwt=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpc3MiOiJnaXRodWIuY29tIiwiYXVkIjoicmF3LmdpdGh1YnVzZXJjb250ZW50LmNvbSIsImtleSI6ImtleTUiLCJleHAiOjE3NjExMTQ1NjAsIm5iZiI6MTc2MTExNDI2MCwicGF0aCI6Ii8xMzc3MDkyNDgvNDU2MTQyMzA3LWVmNGMwMThkLWRlYTYtNGYxNC1hZjQxLWE4Y2Y5ZDVhZjczNi5wbmc_WC1BbXotQWxnb3JpdGhtPUFXUzQtSE1BQy1TSEEyNTYmWC1BbXotQ3JlZGVudGlhbD1BS0lBVkNPRFlMU0E1M1BRSzRaQSUyRjIwMjUxMDIyJTJGdXMtZWFzdC0xJTJGczMlMkZhd3M0X3JlcXVlc3QmWC1BbXotRGF0ZT0yMDI1MTAyMlQwNjI0MjBaJlgtQW16LUV4cGlyZXM9MzAwJlgtQW16LVNpZ25hdHVyZT1kMzAwYmIzMGRlNGU5NzVhOWUyMjAyYmM1ZDViNDQ5ZDc2OGMwZjdmNGMwY2M4MWI5N2VhZGQ4ZThjZDNiY2FlJlgtQW16LVNpZ25lZEhlYWRlcnM9aG9zdCJ9.euYdu3ct6y_V069kH8IgCSK3FEJfTPvfxRkOMIM3YQI)

### 🏘️ Add New Colony
![Add Colony](https://private-user-images.githubusercontent.com/137709248/456142304-546f6ce2-f7b1-4e52-9c56-dba892bb97fa.png?jwt=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpc3MiOiJnaXRodWIuY29tIiwiYXVkIjoicmF3LmdpdGh1YnVzZXJjb250ZW50LmNvbSIsImtleSI6ImtleTUiLCJleHAiOjE3NjExMTQ4MzIsIm5iZiI6MTc2MTExNDUzMiwicGF0aCI6Ii8xMzc3MDkyNDgvNDU2MTQyMzA0LTU0NmY2Y2UyLWY3YjEtNGU1Mi05YzU2LWRiYTg5MmJiOTdmYS5wbmc_WC1BbXotQWxnb3JpdGhtPUFXUzQtSE1BQy1TSEEyNTYmWC1BbXotQ3JlZGVudGlhbD1BS0lBVkNPRFlMU0E1M1BRSzRaQSUyRjIwMjUxMDIyJTJGdXMtZWFzdC0xJTJGczMlMkZhd3M0X3JlcXVlc3QmWC1BbXotRGF0ZT0yMDI1MTAyMlQwNjI4NTJaJlgtQW16LUV4cGlyZXM9MzAwJlgtQW16LVNpZ25hdHVyZT0yZWM1ODZlMjg1NTAxYjI0Y2U1NjE0ZWEwNjE5NWQ1ZDA4NjEzYmY3M2UzNjNiOTE5ZmVkMGZjZGMyODFmMjUxJlgtQW16LVNpZ25lZEhlYWRlcnM9aG9zdCJ9.bnwj-bq9-oMiIKh8MvHL62QHM1JRui2w90lqcnmUzJ4)

### 🟢 Sold Plots
![Sold Plot](https://private-user-images.githubusercontent.com/137709248/456142304-546f6ce2-f7b1-4e52-9c56-dba892bb97fa.png?jwt=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpc3MiOiJnaXRodWIuY29tIiwiYXVkIjoicmF3LmdpdGh1YnVzZXJjb250ZW50LmNvbSIsImtleSI6ImtleTUiLCJleHAiOjE3NjExMTQ1NjAsIm5iZiI6MTc2MTExNDI2MCwicGF0aCI6Ii8xMzc3MDkyNDgvNDU2MTQyMzA0LTU0NmY2Y2UyLWY3YjEtNGU1Mi05YzU2LWRiYTg5MmJiOTdmYS5wbmc_WC1BbXotQWxnb3JpdGhtPUFXUzQtSE1BQy1TSEEyNTYmWC1BbXotQ3JlZGVudGlhbD1BS0lBVkNPRFlMU0E1M1BRSzRaQSUyRjIwMjUxMDIyJTJGdXMtZWFzdC0xJTJGczMlMkZhd3M0X3JlcXVlc3QmWC1BbXotRGF0ZT0yMDI1MTAyMlQwNjI0MjBaJlgtQW16LUV4cGlyZXM9MzAwJlgtQW16LVNpZ25hdHVyZT1mOWFmOThiNjlhYmVmNTgxNWVhYWExMzAyNzJjMmVlMzA3YmI0NTQyNGQ1ZGFkNWY2NGQ0NGYwMGVlNTBlZWFmJlgtQW16LVNpZ25lZEhlYWRlcnM9aG9zdCJ9.Vtgd4HrDkb5Xu44rPUoMUjw6lx1vliB7QL9eWpE-czE)

### 🔴 Unsold Plots
![Unsold Plots](https://private-user-images.githubusercontent.com/137709248/456142305-201dc677-1e4d-4b3d-8e0b-b1847474da4c.png?jwt=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpc3MiOiJnaXRodWIuY29tIiwiYXVkIjoicmF3LmdpdGh1YnVzZXJjb250ZW50LmNvbSIsImtleSI6ImtleTUiLCJleHAiOjE3NjExMTQ1NjAsIm5iZiI6MTc2MTExNDI2MCwicGF0aCI6Ii8xMzc3MDkyNDgvNDU2MTQyMzA1LTIwMWRjNjc3LTFlNGQtNGIzZC04ZTBiLWIxODQ3NDc0ZGE0Yy5wbmc_WC1BbXotQWxnb3JpdGhtPUFXUzQtSE1BQy1TSEEyNTYmWC1BbXotQ3JlZGVudGlhbD1BS0lBVkNPRFlMU0E1M1BRSzRaQSUyRjIwMjUxMDIyJTJGdXMtZWFzdC0xJTJGczMlMkZhd3M0X3JlcXVlc3QmWC1BbXotRGF0ZT0yMDI1MTAyMlQwNjI0MjBaJlgtQW16LUV4cGlyZXM9MzAwJlgtQW16LVNpZ25hdHVyZT02NTU3MWRmYmMzYzE1MzVlNzU0YjEwNjc0MGFmMWEzNDM2ODhiM2QxNDhjMWFiN2M3MzcwOWE1ZDdmZjFhYTg1JlgtQW16LVNpZ25lZEhlYWRlcnM9aG9zdCJ9.kWWvwUlRJcSKtDrTIVSLs314Jc4SjD0ZwvUdOsU3eOY)

### ✏️ Edit Plot Details
![Edit Plot](https://private-user-images.githubusercontent.com/137709248/456142308-bb1aa6c8-4d30-4efa-b661-26dfe6866f4e.png?jwt=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpc3MiOiJnaXRodWIuY29tIiwiYXVkIjoicmF3LmdpdGh1YnVzZXJjb250ZW50LmNvbSIsImtleSI6ImtleTUiLCJleHAiOjE3NjExMTQ1NjAsIm5iZiI6MTc2MTExNDI2MCwicGF0aCI6Ii8xMzc3MDkyNDgvNDU2MTQyMzA4LWJiMWFhNmM4LTRkMzAtNGVmYS1iNjYxLTI2ZGZlNjg2NmY0ZS5wbmc_WC1BbXotQWxnb3JpdGhtPUFXUzQtSE1BQy1TSEEyNTYmWC1BbXotQ3JlZGVudGlhbD1BS0lBVkNPRFlMU0E1M1BRSzRaQSUyRjIwMjUxMDIyJTJGdXMtZWFzdC0xJTJGczMlMkZhd3M0X3JlcXVlc3QmWC1BbXotRGF0ZT0yMDI1MTAyMlQwNjI0MjBaJlgtQW16LUV4cGlyZXM9MzAwJlgtQW16LVNpZ25hdHVyZT03OTVkNmZkY2M4ODE3ODU1ZmM1ZmFkYWMzZTcyYmZjZDg2M2ZhNzc0YzBiMWVmNGVkMmFjNjlhNGJiN2Y0YmEwJlgtQW16LVNpZ25lZEhlYWRlcnM9aG9zdCJ9.RVB33a8p5OeIHcNJ4pMr_HHuT5_217xPsqQltHJNCwI)

### 📋 Customer List
![Customers](https://private-user-images.githubusercontent.com/137709248/456142309-dd7fc032-eab5-4722-a2fb-a94999993616.png?jwt=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpc3MiOiJnaXRodWIuY29tIiwiYXVkIjoicmF3LmdpdGh1YnVzZXJjb250ZW50LmNvbSIsImtleSI6ImtleTUiLCJleHAiOjE3NjExMTQ1NjAsIm5iZiI6MTc2MTExNDI2MCwicGF0aCI6Ii8xMzc3MDkyNDgvNDU2MTQyMzA5LWRkN2ZjMDMyLWVhYjUtNDcyMi1hMmZiLWE5NDk5OTk5MzYxNi5wbmc_WC1BbXotQWxnb3JpdGhtPUFXUzQtSE1BQy1TSEEyNTYmWC1BbXotQ3JlZGVudGlhbD1BS0lBVkNPRFlMU0E1M1BRSzRaQSUyRjIwMjUxMDIyJTJGdXMtZWFzdC0xJTJGczMlMkZhd3M0X3JlcXVlc3QmWC1BbXotRGF0ZT0yMDI1MTAyMlQwNjI0MjBaJlgtQW16LUV4cGlyZXM9MzAwJlgtQW16LVNpZ25hdHVyZT1lMjFjOWM1ODliZTJlMjc1MmU4MGVjZGZkZTQxMDA1YWZhZDE4ZjZjYzNjOThkODNlMDUxZDc5YWU1Y2JjMzA5JlgtQW16LVNpZ25lZEhlYWRlcnM9aG9zdCJ9.hFk-OE1l-SJAuHY57NKfvgkMTC1LxQAGkB_NbE-Rb-U)
