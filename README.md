# Spring AI + Ollama + Qwen3

A hands-on project demonstrating how to build AI-powered applications using **Spring AI 2.0**, **Ollama**, and **Qwen3** running locally.

## 🚀 Overview

This project explores the integration of Spring AI with local Large Language Models (LLMs) using Ollama. It covers prompt engineering concepts, ChatClient integration, prompt templates, and production-oriented AI application development.

## 🛠️ Tech Stack

* Java 21
* Spring Boot 3.x
* Spring AI 2.0
* Ollama
* Qwen3 4B-Instruct
* Maven

## ✨ Features

* ChatClient integration
* Local LLM execution using Ollama
* Prompt Templates
* Dynamic Prompt Rendering
* System Prompt & User Prompt handling
* AI response generation
* Production-ready project structure

## 📂 Project Structure

```text
src
├── main
│   ├── java
│   │   ├── controller
│   │   ├── service
│   │   └── config
│   └── resources
│       └── application.yml
└── test
```

## ⚙️ Prerequisites

* Java 21+
* Maven 3.9+
* Ollama installed

Verify installation:

```bash
java -version
mvn -version
ollama --version
```

## 📥 Install Qwen3 Model

```bash
ollama pull qwen3:4b
```

Verify:

```bash
ollama list
```

## 🔧 Configuration

application.yml

```yaml
spring:
  ai:
    ollama:
      base-url: http://localhost:11434
      chat:
        model: qwen3:4b-instruct
```

## ▶️ Run Ollama

```bash
ollama serve
```

## ▶️ Run Application

```bash
mvn spring-boot:run
```

or

```bash
mvn clean package
java -jar target/*.jar
```

## 📌 Example API

```http
GET /ai/explain?topic=Spring Boot&level=Beginner
```

Example Response:

```text
Spring Boot is a framework that simplifies Java application development...
```

## 📖 Topics Covered

* Spring AI Fundamentals
* ChatClient
* Prompt Engineering
* Prompt Templates
* Dynamic Variables
* System Prompts
* Local LLM Integration
* Ollama Configuration
* Qwen3 Model Usage

## 🎯 Learning Goals

This repository is designed for Java developers who want to learn:

* Generative AI with Java
* Spring AI Framework
* Local AI Deployment
* Prompt Engineering
* Building AI-powered applications

## 👨‍💻 Author

Avi

GitHub: https://github.com/Avi9151

## ⭐ Support

If you find this project useful, consider giving it a star.
