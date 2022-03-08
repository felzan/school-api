##API dividida em camadas

####1 - Camada de entrada
Controller é onde se entra na API,as rotas que vão direcionar para a camada inferior

####2 - Camada de serviço
Service é onde ficam as regras de negócio, geralmente a maior parte do codigo

####3 - Camada de persistencia
Repository é onde vamos guardar as informacoes


##HTTP Request
Salva estudante
```http request
###
POST http://localhost:8080/v1/students
Content-Type: application/json

{
  "name": "Fulano",
  "age": 20
}
```

Busca estudantes
```http request
###
GET http://localhost:8080/v1/students
```