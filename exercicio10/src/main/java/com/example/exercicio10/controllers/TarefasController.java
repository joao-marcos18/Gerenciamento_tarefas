package com.example.exercicio10.controllers;

import java.util.List;
import java.util.Optional;

import com.example.exercicio10.models.TarefasModel;
import com.example.exercicio10.services.TarefasService;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/tarefas")
public class TarefasController {

    private final TarefasService tarefasService;

    public TarefasController(TarefasService tarefasService) {
        this.tarefasService = tarefasService;
    }

    @PostMapping
    public TarefasModel criarTarefa(@RequestBody TarefasModel tarefa) {
        return tarefasService.criarTarefa(tarefa);
    }

    @GetMapping
    public List<TarefasModel> listarTarefas() {
        return tarefasService.listarTarefas();
    }

    @GetMapping("/{id}")
    public Optional<TarefasModel> buscarPorId(@PathVariable Long id) {
        return tarefasService.buscarPorId(id);
    }

    @DeleteMapping("/{id}")
    public void deletarTarefa(@PathVariable Long id) {
        tarefasService.deletarTarefa(id);
    }
}