# Basic Python Script: Hello World

## Overview
This project contains a very basic Python script (`app.py`) that prints "Hello, World!" to the console. The purpose of this is to demonstrate the fundamentals of Docker, creating images and running containers using a simple Dockerfile.

The Dockerfile used is an entry-level example for beginners to understand how to containerize applications.

---

## Quick Setup

Follow these steps to build and run the containerized application:

1. **Clone this repository:**
   ```bash
   git clone https://github.com/YashPatil1609/Docker-Projects.git
   ```

2. **Navigate to the project folder:**
   ```bash
   cd First-DockerImage
   ```

3. **Build the Docker image:**
   ```bash
   docker build -t hello-world-app .
   ```

4. **Run the Docker container:**
   ```bash
   docker run hello-world-app
   ```

5. **Output:**
   You should see the message "Hello, World!" printed to your console.

---

## Blog
To understand Docker's architecture, why it was introduced, and its core concepts (images, containers, and more), read [this blog post](https://yashpatilofficial.hashnode.dev/docker-101-a-guide-to-docker-commands-terminologies-dockerfile).

---

Thank you for exploring this project! Feedback is always welcome.
