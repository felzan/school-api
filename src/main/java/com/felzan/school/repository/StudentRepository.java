package com.felzan.school.repository;

import com.felzan.school.entity.StudentEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository // Diz pro Spring que essa classe eh um repository
// Uma classe repository eh uma classe q vai manipular os dados de um "datasource" (um banco de dados por exemplo)
public interface StudentRepository extends CrudRepository<StudentEntity, Integer> {
    // CrudRepository<Integer, StudentEntity>
    // essa parte diz q o repository vai fazer operacoes basicas
    // ex: salvar, buscar, deletar, etc.
}
