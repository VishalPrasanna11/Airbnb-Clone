# AirbnbClone

## Introduction

AirbnbClone is a comprehensive full-stack application designed to replicate the core functionalities of Airbnb. This project features both backend and frontend components, allowing users to manage bookings, search for properties, and handle reservations. The system leverages modern technologies to deliver a robust and scalable solution.

## Key Features

- 📅 **Booking Management**: Enables travelers to manage their bookings and view reservation history.
- 🏠 **Landlord Reservation Management**: Allows landlords to manage their property listings and track reservations.
- 🔍 **Search for Houses**: Provides a powerful search functionality based on location, date, number of guests, beds, and other criteria.
- 🔐 **Authentication and Authorization**: Secure user access and role management implemented with Auth0 (OAuth2).
- 🏢 **Domain-Driven Design**: Utilizes a domain-driven design approach to ensure a clean and maintainable architecture.
- 🌐 **AWS Deployment**: Deployed on AWS to ensure high availability, scalability, and reliability.

## Technologies Used

- **Backend**: Spring Boot 3
- **Frontend**: Angular 17 with PrimeNG
- **Database**: PostgreSQL
- **Authentication**: Auth0
- **Build Tool**: Maven
- **Deployment**: AWS

## Installation

### Prerequisites

- JDK 21
- PostgreSQL
- IDE (VSCode, IntelliJ)

### Clone the Repository

```bash
git clone https://github.com/VishalPrasanna11/Airbnb-Clone.git

```

## Backend Setup

1. Navigate to the backend directory:
    ```bash
    cd backend
    ```

2. Run the application using Maven:
    ```bash
    ./mvnw spring-boot:run -Dspring-boot.run.arguments="--AUTH0_CLIENT_ID=<client-id> --AUTH0_CLIENT_SECRET=<client-secret>"
    ```

   Alternatively, if using IntelliJ:
   - Add the necessary environment variables (`AUTH0_CLIENT_ID` and `AUTH0_CLIENT_SECRET`) in IntelliJ.
   - Run the application.

## Frontend Setup

1. Navigate to the frontend directory:
    ```bash
    cd frontend
    ```

2. Install dependencies and start the Angular application:
    ```bash
    npm install
    npm start
    ```

## Project Structure

- **Backend**: Contains the Spring Boot application, business logic, REST APIs, and database interactions.
- **Frontend**: Contains the Angular application with user interfaces, client-side logic, and PrimeNG components.

## Configuration

Ensure you set up the environment variables for Auth0 authentication in both the backend and frontend environments. Refer to the `.env` or configuration files for details on required environment variables.

## Database Schema

The application uses PostgreSQL for data storage. Make sure to set up the PostgreSQL database and configure it according to the `application.yml` and `application-prod.yml` settings.

## Deployment

The application is deployed on AWS, leveraging AWS services to ensure high availability and scalability. This includes the use of AWS RDS for PostgreSQL database hosting and AWS EC2 or Elastic Beanstalk for application hosting.

## Contributing

Special thanks to : Sai Srunith (silvery.s@northeastern.edu)

If you would like to contribute to this project, please fork the repository and submit a pull request with your changes. Ensure that your code adheres to the project's coding standards and includes appropriate tests.

## License

This project is licensed under the MIT License - see the `LICENSE` file for details.
