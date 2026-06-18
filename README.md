# Spring Boot + Docker Demo

A simple Spring Boot application containerized with Docker. This project is the backend of the dino card game.

---

## 🚀 Features

- **Spring Boot 3.x**: A lightweight, modern Java framework.
- **Dockerized**: Run your Spring Boot app in a container.
- **REST API**: A simple set of endpoints for the dino card game.

---

## 📦 Prerequisites

Before you begin, ensure you have the following installed:

- [Java JDK 17+](https://www.oracle.com/java/technologies/javase-jdk17-downloads.html) (or OpenJDK 17)
- [Maven 3.8+](https://maven.apache.org/download.cgi)
- [Docker](https://www.docker.com/get-started)
- An IDE (e.g., [IntelliJ IDEA](https://www.jetbrains.com/idea/), [Eclipse](https://www.eclipse.org/), or [VS Code](https://code.visualstudio.com/))

---

## 🛠️ Setup Instructions

### 1. Clone the Repository
```bash
git clone https://github.com/JCKing97/dino-card-game-backend.git
cd dino-card-game-backend
```

### 3. Build the Docker Image

Run the following command to build the Docker image:

```bash
docker build -t dino-card-game-backend .
```

### 4. Run the Docker Container

Start the container using:

```bash
docker run -p 8080:8080 -d dino-card-game-backend
```
-p 8080:8080 maps port 8080 on your local machine to port 8080 in the container.
-d runs the container in detached mode (in the background).

Verify the container is running:

```bash
docker ps
```

### 5. Test the Application

Open your browser or use a tool like Postman or cURL to test the endpoint:

http://localhost:8080/api/dinos?dinoCount=2

You should see the response:

```json
Hello, Docker!
```