
# AI Agent-to-Agent (A2A) Orchestration System

This repository contains a modular Java-based **Agent-to-Agent (A2A) compliant multi-agent system**, demonstrating how independent agents can collaborate intelligently through a parent orchestrator using a standardized protocol.

The **Parent Agent is now located under the `/estore` module**, while additional child agents (Order Agent, Seller Agent, etc.) operate independently and communicate via the A2A protocol.

---

## 🚀 Overview

The system showcases how to build dynamic, extensible AI-driven agent ecosystems using:

* **Spring Boot** — application framework
* **Maven** — build and dependency management
* **Ollama** — local LLM integration for intelligent routing
* **A2A Protocol** — standardized communication and capability discovery

The orchestration model supports chaining multiple agents, interpreting user intents, and generating natural-language responses.

---

## 🧩 Architecture

### Core Concepts

* **Parent Agent (Estore)**
  Acts as the central orchestrator. It interprets user queries using an LLM and delegates tasks to the appropriate child agents.

* **Child Agents (Order, Seller, etc.)**
  Independent Spring Boot services publishing their capabilities via a standard `agent.json` (AgentCard).

### Architectural Principles
```
| Principle                   | Description                                                                                                    |
| --------------------------- | -------------------------------------------------------------------------------------------------------------- |
| **Dynamic Discovery**       | Parent discovers child agent capabilities by fetching their AgentCard (`/agent.json`). No hardcoding required. |
| **A2A Standardization**     | Agents communicate using a unified A2A `Message` object.                                                       |
| **LLM-Driven Task Routing** | User queries interpreted by Ollama → mapped to relevant agent capabilities.                                    |
| **Chained Calls**           | Parent can orchestrate multi-agent workflows (Order Agent → Seller Agent).                                     |
| **Loose Coupling**          | Each agent is independent, versionable, and deployable on its own.                                             |
```
---

## ✨ Key Features

* ✔️ **A2A Protocol Compliance**
* 🔄 **Dynamic Agent Capability Discovery**
* 🧠 **LLM-Powered Intent Understanding**
* 🔗 **Chained Orchestration for Complex Workflows**
* 📦 **Aggregated Unified Responses**
* 🧱 **Modular & Extendable Architecture**

---

## 🧪 Example Use Cases
```
| Scenario    | Example Query                             | Agents Triggered           |
| ----------- | ----------------------------------------- | -------------------------- |
| **Simple**  | “Get B2C Orders”                          | Order Agent                |
| **Simple**  | “Get Seller Info for ID 123”              | Seller Agent               |
| **Complex** | “Get B2C Orders with Seller Details”      | Order Agent → Seller Agent |
| **Complex** | “Get sellers for all orders placed today” | Order Agent → Seller Agent |

```
---

## 🗂️ Project Modules

```
ai-agent2agent/
│
├── estore/               → Parent Agent (Orchestrator)
│   ├── src/
│   ├── agent.json
│   └── pom.xml
│
├── order-agent/          → Child Agent: Orders
├── seller-agent/         → Child Agent: Sellers
└── ...
```

---

## 🔧 Getting Started

### 1. Prerequisites

* Java 17+
* Maven 3.9+
* Ollama installed and a model pulled (e.g., `llama3`, `mistral`)

### 2. Build & Run

* [Estore Agent (Multi Agent)](https://github.com/loginvijayan/ai-agent2agent/blob/main/estore/README.MD)
* [Order Agent](https://github.com/loginvijayan/ai-agent2agent/blob/main/order/README.MD)
* [Seller Agent](https://github.com/loginvijayan/ai-agent2agent/blob/main/seller/README.MD)

---

## 🧠 How Orchestration Works (High-Level Flow)

1. User sends a natural-language request to **Estore**.
2. Estore sends the query to **Ollama** → LLM interprets & maps to child capabilities.
3. Estore dynamically fetches each child’s **AgentCard** to confirm capabilities.
4. Estore sends A2A **Message** payloads to the relevant agents.
5. Agents respond with structured results.
6. Estore aggregates and converts the output into a final natural-language answer.


---

## 📚 Reference Documentation

* Spring Boot: [https://spring.io/projects/spring-boot](https://spring.io/projects/spring-boot)
* Maven: [https://maven.apache.org/](https://maven.apache.org/)
* Spring AI + Ollama: [https://docs.spring.io/spring-ai/reference/](https://docs.spring.io/spring-ai/reference/)
* A2A Protocol Pattern: [https://a2aprotocol.ai/docs/](https://a2aprotocol.ai/docs/)

---


## Flow Diagram

<img width="1100" height="688" alt="MCP SERVER" src="https://github.com/loginvijayan/general-artifacts/blob/main/asserts/a2a/hld.png?raw=true" />

***

<img width="942" height="1144" alt="a2a drawio" src="https://github.com/loginvijayan/general-artifacts/blob/main/asserts/a2a/flow.png?raw=true" />

## Use Case & Testing Prompts

<img width="1360" height="741" alt="Screenshot demo1" src="https://github.com/loginvijayan/general-artifacts/blob/main/asserts/a2a/demo1.png?raw=true" />

----

<img width="1360" height="614" alt="Screenshot demo2" src="https://github.com/loginvijayan/general-artifacts/blob/main/asserts/a2a/demo2.png?raw=true" />

---

<img width="1368" height="879" alt="Screenshot demo3" src="https://github.com/loginvijayan/general-artifacts/blob/main/asserts/a2a/demo3.png?raw=true" />

---

<img width="1368" height="879" alt="Screenshot demo3" src="https://github.com/loginvijayan/general-artifacts/blob/main/asserts/a2a/demo5.png?raw=true" />



