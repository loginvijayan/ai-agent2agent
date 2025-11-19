# 🚀 Seller Service --- Spring Boot + Spring AI + Ollama

This project is part of the **AI Agent-to-Agent (A2A)** ecosystem.\
The Seller service is a Spring Boot application built using **Maven**,
integrating:

-   Spring AI (Ollama model)
-   A2A Java SDK\
-   RESTful APIs
-   Jackson (JSON/YAML)
-   Java 21

------------------------------------------------------------------------

# 📦 Getting Started

## ✔️ Prerequisites

Ensure you have installed:

-   **Java 21**
-   **Maven 3.9+**
-   **Eclipse IDE with Maven support (Eclipse IDE for Enterprise Java
    Developers)**\
-   **Ollama** (optional, if using local models)

------------------------------------------------------------------------

# ▶️ Running the Application

## **1. Using Maven CLI**

### Run the application:

``` bash
mvn spring-boot:run
```

### Package the application:

``` bash
mvn clean package
```

### Run the JAR file:

``` bash
java -jar target/seller-0.0.1-SNAPSHOT.jar
```

------------------------------------------------------------------------

## **2. Running the Project in Eclipse**

### **Step 1 --- Import the Maven project**

1.  Open **Eclipse**
2.  Go to:\
    **File → Import → Maven → Existing Maven Projects → Next**
3.  Select the root folder:\
    `ai-agent2agent/seller`
4.  Eclipse will detect the `pom.xml`
5.  Click **Finish**

------------------------------------------------------------------------

### **Step 2 --- Ensure Java 21 is configured**

1.  Open **Preferences**
2.  Navigate to:\
    **Java → Installed JREs**
3.  Ensure **JDK 21** is added and selected\
4.  Go to:\
    **Java → Compiler**\
    Set **Compiler compliance level: 21**

------------------------------------------------------------------------

### **Step 3 --- Update Maven dependencies**

Right-click the project → **Maven → Update Project... (Alt+F5)**\
Select: **Force Update of Snapshots/Releases → OK**

------------------------------------------------------------------------

### **Step 4 --- Run the Spring Boot application**

#### **Option A --- Using Spring Boot Dashboard**

1.  Open **Spring Boot Dashboard**\
2.  Locate this application\
3.  Click **Run**

#### **Option B --- Using Run As**

1.  Right-click the main class:\
    `SellerApplication.java`
2.  Select:\
    **Run As → Spring Boot App**

------------------------------------------------------------------------

# 📚 Reference Documentation

### Maven & Spring Boot

-   [Official Maven Documentation](https://maven.apache.org/guides/)
-   [Spring Boot Maven
    Plugin](https://docs.spring.io/spring-boot/3.5.5/maven-plugin)
-   [Build an OCI Image with
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

# 🧭 Guides & Tutorials

-   [RESTful Web Service](https://spring.io/guides/gs/rest-service/)
-   [Serving Web
    Content](https://spring.io/guides/gs/serving-web-content/)
-   [REST Services Tutorial](https://spring.io/guides/tutorials/rest/)

------------------------------------------------------------------------

# 🔗 Additional Links

-   [Maven Build Scans](https://maven.apache.org/index.html)
