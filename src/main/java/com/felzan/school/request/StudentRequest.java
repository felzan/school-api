package com.felzan.school.request;

import lombok.Data;

@Data // Anotacao do lib (ou biblioteca ou pacote, qlqr nome desses) chamada Lombok
// Essa lib facilita a escrita de classes. Com ela, usando @Data por exemplo,
// nao eh necessario criar na mao os Getters e Setters de atributos privados
// A propria lib cria esses metodos
public class StudentRequest { // Classe usada para criar um novo estudante
    private String name; // informacao do estudante
    private Integer age; // informacao do estudante
}
