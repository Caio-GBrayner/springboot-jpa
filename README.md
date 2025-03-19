<div align="center">

<h1 align="center">User and Product Management System</h1>

<p align="center">
    <strong>This software is a backend for managing users and products</strong>
</p>

[![pt-BR](https://img.shields.io/badge/lang-pt--BR-green.svg)](./docs/README.pt-BR.md)
[![en](https://img.shields.io/badge/lang-en-red.svg)](./README.md)

</div>

## Table of Contents

- [Table of Contents](#table-of-contents)
- [About](#-about)
- [Features](#-features)
- [Technologies Used](#-technologies-used)
- [Contributing](#-contributing)
  - [Connect with me on LinkedIn](#-connect-with-me-on-linkedin)
  - [Fork and clone the repository](#-fork-and-clone-the-repository)
  - [Project Structure](#-project-structure)
- [Build from Source](#-build-from-source)
  - [Prerequisites](#prerequisites)
  - [Install Spring Tool Suite](#install-spring-tool-suite)
  - [Install Java 21 LTS](#install-java-21-lts)
  - [Install Maven Dependencies](#install-maven-dependencies)
- [Running](#running)
- [License](#license)

## About
This project is a comprehensive **backend** application developed using **Spring Boot**. It serves as a foundation for **managing users and products** in a **web application**. The project leverages the powerful features of **Spring Boot** to ensure a robust and scalable solution.

## Features

- User Management (CRUD).
- Product Management (CRUD).
- Database Integration.
- RESTful API.

## Technologies Used

- Spring Boot
- Spring Data JPA
- H2 Database
- Maven
- Apache Tomcat
- Java 21 LTS

## Contributing

### Connect with me on LinkedIn

Connect with me on [LinkedIn](https://www.linkedin.com/in/caiogomesbrayner).

### Fork and clone the repository

1. Fork the repository [(click here to fork now)](https://github.com/Caio-GBrayner/springboot-jpa)
2. Clone your fork `https://github.com/Caio-GBrayner/springboot-jpa.git`
3. Create a new branch
4. Push your commits
5. Submit a new Pull Request

### Project Structure

- src/config: Configuration tests
- src/entities: Contains the system entities, which represent the database tables.
- src/repositories: Contains interfaces that extend `JpaRepository` for database access.
- src/resources/: Contains resource files, such as configuration properties and messages.
- src/resources/exceptions: Contains custom exception classes.
- src/service/: Contains service classes that implement business logic.
- src/service/exceptions: Contains exceptions specific to the service layer.

## Build from Source

### Prerequisites

- Java 21 LTS installed.
- Maven installed.
- H2 database configured.

### Install Spring Tool Suite

1. Download Spring Tool Suite [here](https://spring.io/tools).
2. Follow the installation instructions for your operating system.

### Install Java 21 LTS

1. Download JDK 21 [here](https://www.oracle.com/java/technologies/javase-jdk21-downloads.html).
2. Configure the `JAVA_HOME` environment variable.

### Install Maven Dependencies

1. Run the following command in the project root:
```bash
mvn clean install
```

## LICENSE

Este projeto está licenciado sob a licença MIT. Consulte o arquivo [LICENSE](LICENSE) para mais detalhes.