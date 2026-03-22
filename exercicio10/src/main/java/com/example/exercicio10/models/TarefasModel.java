package com.example.exercicio10.models;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity(name = "Tarefa")
@Table(name = "tb_tarefa")
public class TarefasModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "descricao_tarefa")
    private String descricao;

    @Column(name = "data_vencimento_tarefa")
    private LocalDate dataVencimento;

    private Boolean concluida;

    public TarefasModel() {
    }

    public TarefasModel(Long id, String descricao, LocalDate dataVencimento, Boolean concluida) {
        this.id = id;
        this.descricao = descricao;
        this.dataVencimento = dataVencimento;
        this.concluida = concluida;
    }

    public Long getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public LocalDate getDataVencimento() {
        return dataVencimento;
    }

    public Boolean getConcluida() {
        return concluida;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setDataVencimento(LocalDate dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public void setConcluida(Boolean concluida) {
        this.concluida = concluida;
    }
}