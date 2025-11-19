# 📦 Order Service --- Spring Boot + Spring AI + Maven

This project is part of the **AI Agent-to-Agent (A2A)** ecosystem.\
The Order service is a Spring Boot application built using **Maven**,
featuring:

-   Spring AI (Ollama integration)
-   REST APIs
-   Java 21
-   Jackson (JSON/YAML)
-   Spring Boot core web stack

------------------------------------------------------------------------

# 🚀 Getting Started

## ✔️ Prerequisites

Ensure you have:

-   **Java 21**
-   **Maven 3.9+**
-   **Eclipse IDE with Maven support**
-   **Ollama** (optional, for local model inference)

------------------------------------------------------------------------

# ▶️ Running the Application

## **1. Run via Maven CLI**

### Run the application:

``` bash
mvn spring-boot:run
```

### Build a JAR file:

``` bash
mvn clean package
```

### Execute the JAR:

``` bash
java -jar target/order-0.0.1-SNAPSHOT.jar
```

------------------------------------------------------------------------

# ▶️ Running the Project in Eclipse

## **Step 1 --- Import as Maven Project**

1.  Open **Eclipse**
2.  Navigate to:\
    **File → Import → Maven → Existing Maven Projects**
3.  Select the folder:\
    `ai-agent2agent/order`
4.  Eclipse will detect the `pom.xml`
5.  Click **Finish**

------------------------------------------------------------------------

## **Step 2 --- Configure Java 21**

1.  Go to: **Preferences → Java → Installed JREs**
2.  Add and select **JDK 21**
3.  Then go to: **Preferences → Java → Compiler**
4.  Set **Compiler compliance level = 21**

------------------------------------------------------------------------

## **Step 3 --- Update Maven Dependencies**

Right‑click the project → **Maven → Update Project... (Alt+F5)**\
Enable **Force Update** → OK

------------------------------------------------------------------------

## **Step 4 --- Run the Application**

### **Option A --- Spring Boot Dashboard**

1.  Open the **Spring Boot Dashboard**
2.  Select the Order service
3.  Click **Run**

### **Option B --- Standard Run**

1.  Right‑click the main application class\
    (typically `OrderApplication.java`)
2.  Choose\
    **Run As → Spring Boot App**

------------------------------------------------------------------------

# 📚 Reference Documentation

### Maven & Spring Boot

-   [Official Maven Documentation](https://maven.apache.org/guides/)
-   [Spring Boot Maven
    Plugin](https://docs.spring.io/spring-boot/3.5.5/maven-plugin)
-   [Create an OCI Image with
    Maven](https://docs.spring.io/spring-boot/3.5.5/maven-plugin/packaging-oci-image.html)

### Spring Framework

-   [Spring Web (REST
    APIs)](https://docs.spring.io/spring-boot/3.5.5/reference/web/servlet.html)

### Spring AI

-   [Ollama Chat
    Model](https://docs.spring.io/spring-ai/reference/api/chat/ollama-chat.html)
-   [Model Context Protocol (MCP)
    Server](https://docs.spring.io/spring-ai/reference/api/mcp/mcp-server-boot-starter-docs.html)

------------------------------------------------------------------------

# 🧭 Guides

-   [RESTful Web Service](https://spring.io/guides/gs/rest-service/)
-   [Serving Web
    Content](https://spring.io/guides/gs/serving-web-content/)
-   [Building REST APIs](https://spring.io/guides/tutorials/rest/)

------------------------------------------------------------------------

# 🔗 Additional Links

-   [Maven Build Scans](https://maven.apache.org/index.html)
