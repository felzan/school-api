package com.felzan.school.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity // Essa eh uma classe de "entidade" q eh uma classe q representa uma tabela
@Table(name = "student") // Nome da tabela q sera guardado os dados
public class StudentEntity {
    @Id // A tabela student precisa ter um identificador, essa @Id eh a anotacao q diz qual o atributo vai ser o ID
    @GeneratedValue(strategy = GenerationType.AUTO) // Essa anotacao diz q o id vai ser automatico
    // ou seja, vai ser incremental: 1, 2, 3, 4, 5, 6, ...
    private Integer id;
    private String name;
    private Integer age;

}