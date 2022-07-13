# OpenWeather Provider Service

Сервис по получению погоды от сервиса https://openweathermap.org/api.

Подключение происходит с помощью Feign Clients к отрытому API. Пользователь отправляет в Get запросе город, язык и метрическую систему. Последняя имеет default значение, т.к. является необязательной переменной. После обработки запроса, пользователь получает JSON с данными о погоде.

### Swagger API Documentation: </br>
http://localhost:8080/swagger-ui.html

### Build:
```
$ git clone https://github.com/Rehtang/openweatherapi.git
$ cd openweatherapi
$ gradlew
```

### Stack:
```
Java 11
Spring Boot 2
Spring Cloud Netflix: Feign Clients
Swagger 3.0
Gradle 7.4
```
