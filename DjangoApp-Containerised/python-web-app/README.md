# Python Django Application

## Overview
This project is a simple **Python Django application** that has been containerized using Docker. The application structure includes:
- **Main Project Folder (`devops`)**: Contains the project settings, URLs, and other configurations.
- **Demo Application (`demo`)**: Created using `python manage.py startapp demo`, this folder contains the core application logic.
- **`manage.py`**: A command-line utility to interact with the Django project to start the development server to test the application.

The application is accessible at `http://localhost:8000/demo` after running the Docker container.

---

## Quick Setup

Follow these steps to build and run the containerized application:

1. **Clone this repository:**
   ```bash
   git clone https://github.com/YashPatil1609/Docker-Projects.git
   ```

2. **Navigate to the project folder:**
   ```bash
   cd DjangoApp-Containerised/python-web-app
   ```

3. **Build the Docker image:**
   ```bash
   docker build -t django-app .
   ```

4. **Run the Docker container:**
   ```bash
   docker run -p 8000:8000 django-app
   ```

5. **Access the application:**
   Open your browser and go to `http://localhost:8000/demo`.

---

## Blog
For a detailed explanation of the project, including architecture and implementation steps, visit [this blog post](https://yashpatilofficial.hashnode.dev/containerizing-a-django-web-application-serving-static-pages-with-docker).

---

Thank you for exploring this project! Feel free to reach out with feedback or questions.
