# [projects](http://ivans-innovation-lab.github.io/projects)/my-company-project-materialized-view-microservice [![CircleCI](https://circleci.com/gh/ivans-innovation-lab/my-company-project-materialized-view-microservice.svg?style=svg)](https://circleci.com/gh/ivans-innovation-lab/my-company-project-materialized-view-microservice)

## Running instructions

Run RabbitMQ
```
$ brew services start rabbitmq
```

Make sure that services are running:

 - [my-company-configuration-backingservice](https://github.com/ivans-innovation-lab/my-company-configuration-backingservice)
 - [my-company-registry-backingservice](https://github.com/ivans-innovation-lab/my-company-registry-backingservice)
 
Make sure that you have this libraries installed in your local maven repsoitory:

 - [my-company-common (transient dependency)](https://github.com/ivans-innovation-lab/my-company-common)
 - [my-company-project-materialized-view](https://github.com/ivans-innovation-lab/my-company-project-materialized-view)

```bash
$ cd my-company-project-materialized-view-microservice
$ ./mvnw spring-boot:run
```

Application will be available on port 8083 (http://localhost:8083)

## Explore

### curl

```
$ curl http://localhost:8083/projects 
```

### rambittmq

Open RabbitMQ management web console at http://localhost:15672/ and explore exchanges, queues and messages.

### registry backing service

Open Registry (Eureka) web console at http://localhost:8761/ and find 'my-company-project-materialized-view-microservice' registered.


