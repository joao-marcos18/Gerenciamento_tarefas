package com.example.exercicio10.repositories;

import com.example.exercicio10.models.TarefasModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TarefasRepository extends JpaRepository<TarefasModel, Long> {

}