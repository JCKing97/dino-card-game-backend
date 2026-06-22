# Dino Card Game Backend

A simple Spring Boot application containerized with Docker. This project is the backend of the dino card game.

---

## 🚀 Features

- **Spring Boot 3.x**: A lightweight, modern Java framework.
- **Dockerized**: Run your Spring Boot app in a container.
- **REST API**: A simple set of endpoints for the dino card game.

---

## 📦 Prerequisites

Before you begin, ensure you have the following installed:

- [Docker](https://www.docker.com/get-started)
- An IDE (e.g., [IntelliJ IDEA](https://www.jetbrains.com/idea/) or [VS Code](https://code.visualstudio.com/))

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

You should see a JSON response like:

```json
{
  "dinos": [
    {
      "name": "Velociraptor",
      "description": "Pack hunter!",
      "image": "https://live.staticflickr.com/65535/55342202106_4fb61d2f13_c.jpg"
    },
    {
      "name": "Brachiosaurus",
      "description": "Gentle giant",
      "image": "https://live.staticflickr.com/65535/55342406499_200e2b116b_c.jpg"
    }
  ]
}
```