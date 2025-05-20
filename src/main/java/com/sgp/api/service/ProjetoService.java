package com.sgp.api.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sgp.api.model.Projeto;
import com.sgp.api.repository.ProjetoRepository;

@Service
public class ProjetoService {
    
        @Autowired
        private ProjetoRepository projetoRespository;

        public List<Projeto> carregarProjetos() {
            return projetoRespository.findAll();
            } 
            public Optional<Projeto> carregarDadosProjetoPeloId (Long id) {
                return projetoRespository.findById(id);
            } 

            public void deletarProjeto (Long id)
            {
                projetoRespository.deleteById(id);
            }
        
}
