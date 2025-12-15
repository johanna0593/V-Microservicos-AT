Arquitetura de Microserviços Reativos com Spring Boot

## Curso
Engenharia de Software – Infnet

## Disciplina
Microsserviços e DevOps com Spring Boot e Spring Cloud

---

## 📌 Descrição do Projeto

Este projeto tem como objetivo a implementação de uma aplicação baseada em **microserviços**, utilizando os **princípios da programação reativa**, conforme solicitado no enunciado do trabalho prático (AT).

A aplicação foi desenvolvida com **Spring Boot**, adotando:
- Programação reativa com **Spring WebFlux**
- Persistência de dados com **Spring Data R2DBC**
- Comunicação HTTP reativa com **WebClient**
- Testes de integração com **Testcontainers**
- Organização em múltiplos microserviços independentes

O projeto demonstra boas práticas de arquitetura distribuída, desacoplamento, escalabilidade e testabilidade.

---

## 🧱 Estrutura do Projeto

O projeto está organizado como um **multi-módulo Maven**, contendo os seguintes microserviços:

```text
microservices-final/
│
├── user-service/      → Microserviço responsável pelos usuários
├── order-service/     → Microserviço responsável pelos pedidos
├── db-service/        → Microserviço responsável pela persistência de dados
└── pom.xml            → POM pai (gerenciamento de dependências)
Cada microserviço possui:

Configuração independente

Porta própria

Banco de dados acessado via R2DBC

Capacidade de execução isolada

⚙️ Tecnologias Utilizadas
Java 17

Spring Boot

Spring WebFlux

Spring Data R2DBC

PostgreSQL

Testcontainers

Maven

Docker

IntelliJ IDEA
