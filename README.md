# Driving Test project



## Getting Started

These instructions will help you get a copy of the project up and running on your local machine for development and testing purposes.

### Prerequisites

Before you begin, ensure you have met the following requirements:

- Java Development Kit (JDK)
- Node.js and Angular CLI
- PostgreSQL database (You can use a Docker container)

### Installation

1. Clone the repository:

   ```bash
   git clone https://github.com/MoldovanAbelSamuel/Final-Project on branch main

2. Start the Spring Boot application:

cd drivingTest
./mvnw spring-boot:run

3. Start the Angular application:

cd frontend-ok
npm install
ng serve

4. Start the PostgreSQL Docker container and create a db called drivingtestdb:

docker run --name postgres-container -e POSTGRES_PASSWORD=your-password -p 5432:5432 -d postgres


