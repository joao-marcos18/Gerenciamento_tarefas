package com.example.exercicio10.services;

import java.util.List;
import java.util.Optional;

import com.example.exercicio10.models.TarefasModel;
import com.example.exercicio10.repositories.TarefasRepository;
import org.springframework.stereotype.Service;


@Service
public class TarefasService {

    private final TarefasRepository tarefasRepository;

    public TarefasService(TarefasRepository tarefasRepository) {
        this.tarefasRepository = tarefasRepository;
    }

    public TarefasModel criarTarefa(TarefasModel tarefa) {
        return tarefasRepository.save(tarefa);
    }

    public List<TarefasModel> listarTarefas() {
        return tarefasRepository.findAll();
    }

    public Optional<TarefasModel> buscarPorId(Long id) {
        return tarefasRepository.findById(id);
    }

    public void deletarTarefa(Long id) {
        tarefasRepository.deleteById(id);
    }
}