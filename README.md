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
![Home](https://private-user-images.githubusercontent.com/137709248/456141976-a946d16c-e738-4cf8-a57a-4d29be859e40.png?jwt=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJnaXRodWIuY29tIiwiYXVkIjoicmF3LmdpdGh1YnVzZXJjb250ZW50LmNvbSIsImtleSI6ImtleTUiLCJleHAiOjE3NTAxODMzMzcsIm5iZiI6MTc1MDE4MzAzNywicGF0aCI6Ii8xMzc3MDkyNDgvNDU2MTQxOTc2LWE5NDZkMTZjLWU3MzgtNGNmOC1hNTdhLTRkMjliZTg1OWU0MC5wbmc_WC1BbXotQWxnb3JpdGhtPUFXUzQtSE1BQy1TSEEyNTYmWC1BbXotQ3JlZGVudGlhbD1BS0lBVkNPRFlMU0E1M1BRSzRaQSUyRjIwMjUwNjE3JTJGdXMtZWFzdC0xJTJGczMlMkZhd3M0X3JlcXVlc3QmWC1BbXotRGF0ZT0yMDI1MDYxN1QxNzU3MTdaJlgtQW16LUV4cGlyZXM9MzAwJlgtQW16LVNpZ25hdHVyZT02N2NiMzAyMjQ2YjhmNjVjNTc1Y2VmM2ZiNzBmOTUzYzI3NjMzZGUyMThkZjA1ODI4MTFhMzUzZjlkMjg1OGFlJlgtQW16LVNpZ25lZEhlYWRlcnM9aG9zdCJ9.2GwIbQsy4dKywiFQPfVu8Sn63oOj04dTCTf0u1m8dUI)

### 🔐 Sign Up
![Sign Up](https://private-user-images.githubusercontent.com/137709248/456141975-8a71a497-8917-4d4f-bf7c-4b0d00198e67.png?jwt=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJnaXRodWIuY29tIiwiYXVkIjoicmF3LmdpdGh1YnVzZXJjb250ZW50LmNvbSIsImtleSI6ImtleTUiLCJleHAiOjE3NTAxODM0ODAsIm5iZiI6MTc1MDE4MzE4MCwicGF0aCI6Ii8xMzc3MDkyNDgvNDU2MTQxOTc1LThhNzFhNDk3LTg5MTctNGQ0Zi1iZjdjLTRiMGQwMDE5OGU2Ny5wbmc_WC1BbXotQWxnb3JpdGhtPUFXUzQtSE1BQy1TSEEyNTYmWC1BbXotQ3JlZGVudGlhbD1BS0lBVkNPRFlMU0E1M1BRSzRaQSUyRjIwMjUwNjE3JTJGdXMtZWFzdC0xJTJGczMlMkZhd3M0X3JlcXVlc3QmWC1BbXotRGF0ZT0yMDI1MDYxN1QxNzU5NDBaJlgtQW16LUV4cGlyZXM9MzAwJlgtQW16LVNpZ25hdHVyZT1hOGNhNTY1ODgyZWVjMTRkYjM2OWE5MGY5YTE0YjU1M2ExMzNkOGVmMTMxODk5YWI0YjI1MGNhMWI1NDJmOGJhJlgtQW16LVNpZ25lZEhlYWRlcnM9aG9zdCJ9.H7dmB7CJkNiTkP9jGVdsXQoWGsEOrrQU3dAPLJcKdyw)

### 🔑 Login
![Login](https://private-user-images.githubusercontent.com/137709248/456142306-ea1996e3-ac80-4631-bb74-81ae0e83015b.png?jwt=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJnaXRodWIuY29tIiwiYXVkIjoicmF3LmdpdGh1YnVzZXJjb250ZW50LmNvbSIsImtleSI6ImtleTUiLCJleHAiOjE3NTAxODM0ODAsIm5iZiI6MTc1MDE4MzE4MCwicGF0aCI6Ii8xMzc3MDkyNDgvNDU2MTQyMzA2LWVhMTk5NmUzLWFjODAtNDYzMS1iYjc0LTgxYWUwZTgzMDE1Yi5wbmc_WC1BbXotQWxnb3JpdGhtPUFXUzQtSE1BQy1TSEEyNTYmWC1BbXotQ3JlZGVudGlhbD1BS0lBVkNPRFlMU0E1M1BRSzRaQSUyRjIwMjUwNjE3JTJGdXMtZWFzdC0xJTJGczMlMkZhd3M0X3JlcXVlc3QmWC1BbXotRGF0ZT0yMDI1MDYxN1QxNzU5NDBaJlgtQW16LUV4cGlyZXM9MzAwJlgtQW16LVNpZ25hdHVyZT00ZWFhMDRhMmYyNzMyODNhMGVkYTBmZDQ2NTlhZjNkOGRmMzk3YzNjMGQ4NDdiN2Q4NWQxNTllY2RjYjExNTY1JlgtQW16LVNpZ25lZEhlYWRlcnM9aG9zdCJ9.nHC8X6PTNhwq3MoKPePmtIDAx6zGZObmkRb4MbB7FkA)

### 📊 Dashboard
![Dashboard](https://private-user-images.githubusercontent.com/137709248/456142307-ef4c018d-dea6-4f14-af41-a8cf9d5af736.png?jwt=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJnaXRodWIuY29tIiwiYXVkIjoicmF3LmdpdGh1YnVzZXJjb250ZW50LmNvbSIsImtleSI6ImtleTUiLCJleHAiOjE3NTAxODM0ODAsIm5iZiI6MTc1MDE4MzE4MCwicGF0aCI6Ii8xMzc3MDkyNDgvNDU2MTQyMzA3LWVmNGMwMThkLWRlYTYtNGYxNC1hZjQxLWE4Y2Y5ZDVhZjczNi5wbmc_WC1BbXotQWxnb3JpdGhtPUFXUzQtSE1BQy1TSEEyNTYmWC1BbXotQ3JlZGVudGlhbD1BS0lBVkNPRFlMU0E1M1BRSzRaQSUyRjIwMjUwNjE3JTJGdXMtZWFzdC0xJTJGczMlMkZhd3M0X3JlcXVlc3QmWC1BbXotRGF0ZT0yMDI1MDYxN1QxNzU5NDBaJlgtQW16LUV4cGlyZXM9MzAwJlgtQW16LVNpZ25hdHVyZT02ZTk0YTdmMmQ4NWFjMWNhYjI1ZWQwMWMxYzdkZDYxOTUyNzMwYmY5YzcwMTk3NjlhYzAxZmNiNmJmMjg2YzM1JlgtQW16LVNpZ25lZEhlYWRlcnM9aG9zdCJ9.rlvKWke-q1NaD9nAP1esb60vQ7iT5McFb45LvXEcrDk)

### 🏘️ Add New Colony
![Add Colony](https://private-user-images.githubusercontent.com/137709248/456142304-546f6ce2-f7b1-4e52-9c56-dba892bb97fa.png?jwt=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJnaXRodWIuY29tIiwiYXVkIjoicmF3LmdpdGh1YnVzZXJjb250ZW50LmNvbSIsImtleSI6ImtleTUiLCJleHAiOjE3NTAxODM0ODAsIm5iZiI6MTc1MDE4MzE4MCwicGF0aCI6Ii8xMzc3MDkyNDgvNDU2MTQyMzA0LTU0NmY2Y2UyLWY3YjEtNGU1Mi05YzU2LWRiYTg5MmJiOTdmYS5wbmc_WC1BbXotQWxnb3JpdGhtPUFXUzQtSE1BQy1TSEEyNTYmWC1BbXotQ3JlZGVudGlhbD1BS0lBVkNPRFlMU0E1M1BRSzRaQSUyRjIwMjUwNjE3JTJGdXMtZWFzdC0xJTJGczMlMkZhd3M0X3JlcXVlc3QmWC1BbXotRGF0ZT0yMDI1MDYxN1QxNzU5NDBaJlgtQW16LUV4cGlyZXM9MzAwJlgtQW16LVNpZ25hdHVyZT1lMDNlYjk2YmYyZGJjZTYyODBhZjNmZjlmNjJkYzhhMmE3OGEzY2JkZTg1NzUwMzgwNzZmYTNjNzAxMzVjYWRhJlgtQW16LVNpZ25lZEhlYWRlcnM9aG9zdCJ9.wY7VUE9S3Tu40tCO6-IyP0-TXPKtXTc0PNX0A0cnikI)

### 🟢 Sold Plots
![Sold Plot](https://private-user-images.githubusercontent.com/137709248/456142310-0a9bea78-288c-4f2b-a323-061d6cfdeff7.png?jwt=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJnaXRodWIuY29tIiwiYXVkIjoicmF3LmdpdGh1YnVzZXJjb250ZW50LmNvbSIsImtleSI6ImtleTUiLCJleHAiOjE3NTAxODM0ODAsIm5iZiI6MTc1MDE4MzE4MCwicGF0aCI6Ii8xMzc3MDkyNDgvNDU2MTQyMzEwLTBhOWJlYTc4LTI4OGMtNGYyYi1hMzIzLTA2MWQ2Y2ZkZWZmNy5wbmc_WC1BbXotQWxnb3JpdGhtPUFXUzQtSE1BQy1TSEEyNTYmWC1BbXotQ3JlZGVudGlhbD1BS0lBVkNPRFlMU0E1M1BRSzRaQSUyRjIwMjUwNjE3JTJGdXMtZWFzdC0xJTJGczMlMkZhd3M0X3JlcXVlc3QmWC1BbXotRGF0ZT0yMDI1MDYxN1QxNzU5NDBaJlgtQW16LUV4cGlyZXM9MzAwJlgtQW16LVNpZ25hdHVyZT0zY2QyZDhmODAzNTE3MWE3OTdiYjA1ZDdhYTNkMmQ4NTUyZGQ2NWQyMWJlMzBlNzJlMGQ2YTQzM2EwNmVmZTY1JlgtQW16LVNpZ25lZEhlYWRlcnM9aG9zdCJ9.Mp0L3tSkzuk2tfNAQYPCw_Ok7b0qyka9-bOTuRJtxhU
)

### 🔴 Unsold Plots
![Unsold Plots]([https://private-user-images.githubusercontent.com/137709248/456142305-201dc677-1e4d-4b3d-8e0b-b1847474da4c.png](https://private-user-images.githubusercontent.com/137709248/456142305-201dc677-1e4d-4b3d-8e0b-b1847474da4c.png?jwt=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJnaXRodWIuY29tIiwiYXVkIjoicmF3LmdpdGh1YnVzZXJjb250ZW50LmNvbSIsImtleSI6ImtleTUiLCJleHAiOjE3NTAxODM0ODAsIm5iZiI6MTc1MDE4MzE4MCwicGF0aCI6Ii8xMzc3MDkyNDgvNDU2MTQyMzA1LTIwMWRjNjc3LTFlNGQtNGIzZC04ZTBiLWIxODQ3NDc0ZGE0Yy5wbmc_WC1BbXotQWxnb3JpdGhtPUFXUzQtSE1BQy1TSEEyNTYmWC1BbXotQ3JlZGVudGlhbD1BS0lBVkNPRFlMU0E1M1BRSzRaQSUyRjIwMjUwNjE3JTJGdXMtZWFzdC0xJTJGczMlMkZhd3M0X3JlcXVlc3QmWC1BbXotRGF0ZT0yMDI1MDYxN1QxNzU5NDBaJlgtQW16LUV4cGlyZXM9MzAwJlgtQW16LVNpZ25hdHVyZT1hNjM4NzYwNzM5NTgzNWU2NWE4ZGNmNzljNWQwNjcwYjNkNDA0MGVmMGUzZGVlZTFmODY0YjNlYjIxOTRkYmJiJlgtQW16LVNpZ25lZEhlYWRlcnM9aG9zdCJ9.CZQWFBmuygXkMNfsI25XWmVzHHc8Ixqz0MibEWDuVUk))

### ✏️ Edit Plot Details
![Edit Plot](https://private-user-images.githubusercontent.com/137709248/456142308-bb1aa6c8-4d30-4efa-b661-26dfe6866f4e.png?jwt=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJnaXRodWIuY29tIiwiYXVkIjoicmF3LmdpdGh1YnVzZXJjb250ZW50LmNvbSIsImtleSI6ImtleTUiLCJleHAiOjE3NTAxODM0ODAsIm5iZiI6MTc1MDE4MzE4MCwicGF0aCI6Ii8xMzc3MDkyNDgvNDU2MTQyMzA4LWJiMWFhNmM4LTRkMzAtNGVmYS1iNjYxLTI2ZGZlNjg2NmY0ZS5wbmc_WC1BbXotQWxnb3JpdGhtPUFXUzQtSE1BQy1TSEEyNTYmWC1BbXotQ3JlZGVudGlhbD1BS0lBVkNPRFlMU0E1M1BRSzRaQSUyRjIwMjUwNjE3JTJGdXMtZWFzdC0xJTJGczMlMkZhd3M0X3JlcXVlc3QmWC1BbXotRGF0ZT0yMDI1MDYxN1QxNzU5NDBaJlgtQW16LUV4cGlyZXM9MzAwJlgtQW16LVNpZ25hdHVyZT05ZmNiYzU4MTMzNzViYjcyM2Q2YzI4NmI0NWE0NWU2NWJlMDBiNTY2OTI1YTQ4MTVlNzUyYjg3YTQ4OWFmYThkJlgtQW16LVNpZ25lZEhlYWRlcnM9aG9zdCJ9.Xt4uu5tmSAYoKLZnylITGCV9U220FDQZxvmViHPo038)

### 📋 Customer List
![Customers](https://private-user-images.githubusercontent.com/137709248/456142309-dd7fc032-eab5-4722-a2fb-a94999993616.png?jwt=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJnaXRodWIuY29tIiwiYXVkIjoicmF3LmdpdGh1YnVzZXJjb250ZW50LmNvbSIsImtleSI6ImtleTUiLCJleHAiOjE3NTAxODM0ODAsIm5iZiI6MTc1MDE4MzE4MCwicGF0aCI6Ii8xMzc3MDkyNDgvNDU2MTQyMzA5LWRkN2ZjMDMyLWVhYjUtNDcyMi1hMmZiLWE5NDk5OTk5MzYxNi5wbmc_WC1BbXotQWxnb3JpdGhtPUFXUzQtSE1BQy1TSEEyNTYmWC1BbXotQ3JlZGVudGlhbD1BS0lBVkNPRFlMU0E1M1BRSzRaQSUyRjIwMjUwNjE3JTJGdXMtZWFzdC0xJTJGczMlMkZhd3M0X3JlcXVlc3QmWC1BbXotRGF0ZT0yMDI1MDYxN1QxNzU5NDBaJlgtQW16LUV4cGlyZXM9MzAwJlgtQW16LVNpZ25hdHVyZT0xNTcwNzQ3ODQxNjI2MmQ2ZTUzZTM5NjNiZGZlODQzYTZmYmZlYTU0MDg1NWYxMzMyNjE1NDViYmIyOGI4ZDJkJlgtQW16LVNpZ25lZEhlYWRlcnM9aG9zdCJ9.1rynkc1ZeEytZwT799TqQO85XSPOGUmeOqI1r0kH2Kc)


