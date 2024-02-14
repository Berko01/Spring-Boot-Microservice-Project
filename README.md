
# Spring-Boot-Microservices-Project

In this project, a microservice architecture is utilized, consisting of 16 modules.

At its core, the project encompasses operations such as adding products, viewing products, checking product inventory, and placing product orders within an e-commerce platform. These operations involve asynchronous and synchronous tasks, logging activities, and various other processes.

Feel free to ask if you have any further questions or need additional information!


## UML Diagram

![Uygulama Ekran Görüntüsü](repository-open-graph-template.png)




## Features

- Grafana and Prometheus

  I use Prometheus to monitor the overall performance and traffic of all services and the system. For visualizing the data, I use Grafana.

![Uygulama Ekran Görüntüsü](grafana.png)

- Eureka:
  
  Eureka represents the Discovery Server component. Through Eureka, we perform service discovery and ensure that these independent services operate within a dynamically scalable mechanism. Eureka tracks and provides the locations of all services, facilitating communication between them. Additionally, it enhances security within our system

![Uygulama Ekran Görüntüsü](eurekadetails.png)

- Keycloak:

  Keycloak serves as the security component of our system, directly integrated with the ApiGateway. Through Keycloak, we secure our system, ensuring that every incoming request undergoes security checks.

![Uygulama Ekran Görüntüsü](keycloakdetails.png)

- Zipkin:

  With Zipkin, we can track inter-service interactions in more detail. We can access detailed information such as the passage of a request between different services and its processing time.

![Uygulama Ekran Görüntüsü](zipkindetail.png)

- Api Gateway:
  
  The API Gateway allows us to abstract away the complexity between services and connect them seamlessly. Essentially, it receives HTTP requests, processes them through security filters, and routes them accordingly.

- Inventory Service and MySql Inventory Database:

  When an inventory control request is received, the Inventory Service queries the inventory database to perform the necessary checks.

- Order Service and MySql Order Database:

  When an inventory control request is received, the Inventory Service queries the inventory database to perform the necessary checks.

- Product Service and MongoDB Product Database

  The Product Service handles the process of adding products to the Product Database.

- Order Service and MySql Order Database

The Order Service handles the process of placing product orders.



  
## Distribution

1- Download or clone the project files.

2- Download Docker and setup.

3- Running the Files:

```terminal
  mvn build
```

```terminal
  mvn spring-boot:run
```

Configure New Token:

First navigate to "localhost:KeyCloakPORT" (replace PORT with the Keycloak port number) in your browser. Then, select "spring-boot-microservices" as the Realm. Proceed to the "Client" section and choose "spring-cloud-client" from the list. Navigate to the "Credentials" section and copy the "Client Secret":

![Uygulama Ekran Görüntüsü](clientsecret.png)

Use your client secret:
![Uygulama Ekran Görüntüsü](KeycloakConfigsPostman2.png)

You are ready to go!









## Technologies

**Language:** Bash / Shell Scripting

**Technologies:** - Docker and Kubernetes

**Language:** Spring Boot

**Technologies:** -Lombok -Actuator -Webflux -Crypto -Gateway

<img src="spring.png" alt="Spring Boot" width="100">

**Databases:** -MongoDB -MySql -Circuitbreaker

<img src="mysql.png" alt="MySQL" width="100">
<img src="mongo.png" alt="MongoDB" width="100">

**Cloud computing technologies** Grafana, Prometheus

<img src="Grafana_logo.svg.png" alt="Grafana" width="100">
<img src="prometheus.png" alt="Prometheus" width="100">

**Performance analysis and monitoring technology** Zipkin

<img src="zipkin.png" alt="Zipkin" width="100">

**Service discovery technology** Netflix Eureka

<img src="eureka.png" alt="Eureka" width="100">

**Security technology** Keycloak

<img src="Keycloak_Logo.png" alt="Keycloak" width="100">

**Data streaming technologies**

<img src="kafka.png" alt="Kafka" width="100">
<img src="zookeeper.jpg" alt="Zookeeper" width="100">

## API Usage

!!! For api key usage please read Distribution part.

#### AddProduct

```http
  POST /api/product
```

| Body | Tip     | Açıklama                |
| :-------- | :------- | :------------------------- |
| `name` | `String` | **Required** . |
| `description` | `String` | **Required** . |
| `price` | `Int` | **Required** . |


| Headers | Type     | Description               |
| :-------- | :------- | :------------------------- |
| `Authorization` | `Bearer:{{access_token}}` | **Required** . Your API key. |

#### Order

```http
  POST /api/order
```

| Body | Type     | Description               |
| :-------- | :------- | :------------------------- |
| `skuCode` | `String` | **Required** .  |
| `price` | `BigDecimal` | **Required** . |
| `quantity` | `Int` | **Required** . |


| Headers | Type     | Description                |
| :-------- | :------- | :------------------------- |
| `Authorization` | `Bearer:{{access_token}}` | **Required** . Your API key. |


```http
  GET /api/product
```

| Headers | Tip     | Açıklama                |
| :-------- | :------- | :------------------------- |
| `Authorization` | `Bearer:{{access_token}}` | **Required** . Your API key. |









## Tests

Postman Tests
![Uygulama Ekran Görüntüsü](Postman.png)




  
## Related projects

You can take a look at the Microservices Project:

Java Spring Microservices Project Docker and Kubernetes [Java Spring Microservices Project Docker and Kubernetes]( https://github.com/Berko01/Spring-Boot-Microservices-Project-Docker-and-Kubernetes-Files)





  
## Extracted Lessons

Important knowledge has been gained about the technologies used in microservice development.

Information about using and configuring Kafka technology with containers.

Understanding the usage of Keycloak technology, including obtaining tokens from Keycloak using Postman.

Usage and configuration of Prometheus and Grafana.

Coding and configuration of Discovery Server with Netflix Eureka.

Development of the API Gateway module.

Significant gains in understanding asynchronous and synchronous processes.

Communication between microservices.
## Programmers

- [@Berko01](https://github.com/Berko01) development.

- [@ProgrammingTechie](https://www.youtube.com/watch?v=mPPhcU7oWDU&t=9072s) this is the resource of project. I learned and coded the project from here, and I added my improvements.

