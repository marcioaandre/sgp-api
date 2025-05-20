package com.sgp.api.model;


import java.time.LocalDate;

import org.hibernate.annotations.ManyToAny;

import com.sgp.api.constants.Prioridade;
import com.sgp.api.constants.StatusTarefa;

import jakarta.persistence.Column;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

   @Data
   @AllArgsConstructor
   @NoArgsConstructor
   
public class Tarefa {
   
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(nullable = false)
    private String Titulo;

    @Column(columnDefinition = "TEXT")
    private String descricao;
    
    @Column(nullable = false)
    private LocalDate dataCriacao;
    
    private LocalDate dataConclusao;
    
     @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private Prioridade prioridade;
    
     @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private StatusTarefa status;

    @ManyToAny
    @JoinColumn(nullable = false)
    private Projeto projeto;

    @ManyToAny
    private Usuario usuario;
}
