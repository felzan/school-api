package com.felzan.school.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Student {
    private Integer id;
    private String name;
    private Integer age;

    // Aqui vao ir as infos q um estudante tem
    // Ex: materias, notas, atestados, etc
    // Ainda n sei exatamente oq colocar kkkk
}
