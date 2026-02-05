🎓 Student Management System – Docker & Kubernetes Practice Project

A hands-on DevOps learning project demonstrating how to containerize a Spring Boot application using Docker and deploy it to Kubernetes with PostgreSQL as the backend database.

This project focuses on real-world containerization and orchestration concepts including Docker images, multi-container setups, Kubernetes deployments, services, configuration management, persistence, and scaling.

🚀 Project Overview

The Student Management System is a simple REST-based application that allows users to create and retrieve student records.

The system consists of:

Spring Boot REST API (Java)

PostgreSQL database

Docker for containerization

Docker Compose for local multi-container development

Kubernetes (Minikube) for orchestration

The backend API communicates with PostgreSQL using Kubernetes Services, and all components are deployed using YAML manifests.

🏗️ Architecture
Client / Browser
        |
   Kubernetes Service (NodePort)
        |
   Spring Boot API Pods (Deployment)
        |
   PostgreSQL Service (ClusterIP)
        |
   PostgreSQL Pod + Persistent Volume

🧰 Tech Stack

Java 17 / Spring Boot

PostgreSQL

Docker & Docker Compose

Kubernetes (Minikube)

Maven

kubectl

Git

📁 Project Structure
student-api/
│
├── src/                         # Spring Boot source code
├── target/                     # Generated JAR
├── pom.xml
├── Dockerfile
├── docker-compose.yml
│
└── k8s/
    ├── api-deployment.yaml
    ├── api-service.yaml
    ├── db-deployment.yaml
    ├── db-service.yaml
    ├── configmap.yaml
    ├── secret.yaml
    └── pvc.yaml

✨ Features Implemented
Docker

Dockerfile for Spring Boot application

Image building and tagging

Multi-container setup using Docker Compose

Environment variable configuration

Local development with PostgreSQL

Docker Hub image publishing

Kubernetes

Deployments for API and database

Services for internal and external communication

ConfigMaps for application configuration

Secrets for sensitive credentials

PersistentVolumeClaim for PostgreSQL data

Horizontal scaling using replicas

Rolling updates

Pod logs and debugging using kubectl

⚙️ Prerequisites

Make sure the following are installed:

Docker Desktop

Minikube

kubectl

Java 17

Maven

Git

Verify:

docker --version
kubectl version --client
minikube version

▶️ Run Locally with Docker Compose
Build application
mvn clean package

Start containers
docker compose up --build


API available at:

http://localhost:8080/students

☸️ Run on Kubernetes (Minikube)
Start cluster
minikube start

Apply all manifests
kubectl apply -f k8s/

Check resources
kubectl get pods
kubectl get svc

Access API
minikube service api-service

🔄 Scaling

Scale API pods:

kubectl scale deployment student-api --replicas=5

🔁 Rolling Update

Update image:

kubectl set image deployment/student-api api=yourdockerhub/student-api:v2


Monitor rollout:

kubectl rollout status deployment student-api

🧪 Sample API
Create Student
POST /students
Content-Type: application/json

{
  "name": "John",
  "email": "john@example.com"
}

Get Students
GET /students

🧠 Learning Objectives

This project demonstrates:

Containerizing Spring Boot applications

Multi-service Docker environments

Kubernetes deployment workflows

Service-based communication

Configuration management

Persistent storage

Scaling and rolling deployments

Real-world DevOps project organization

🚧 Future Improvements

Ingress Controller

Helm Charts

CI/CD using GitHub Actions

Monitoring with Prometheus & Grafana

React Frontend

Authentication & Authorization

👤 Author

Shashika Ekanayaka

📄 License

This project is for educational purposes.
