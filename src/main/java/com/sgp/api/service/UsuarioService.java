package com.sgp.api.service;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.sgp.api.dto.UsuarioDTo;
import com.sgp.api.model.Usuario;

@Service
public class UsuarioService {
    
   public List<UsuarioDTo> carregarUsuariosCadastrados(){  
    List<Usuario> usuarios = usuarioRepository.findAll()
    
    List<UsuarioDTo> dtos = new ArrayList<>();

    for(Usuario usuario : usuarios) {
       dtos.add(usuario.converterParaDto()); }
    
       return dtos;

    }          
    public List<Usuario> carregarUsuarioPeloId(Long id){   
        return usuarioRepository.findAll();
    }
    
    public UsuarioDTo obterDadosUsuarioPeloId(Long id){
     Optional<Usuario> usuarioOpt = usuarioRepository.findBy (id);

     if (usuarioOpt.isPresent()) {
        Usuario usuario = usuarioOpt.get();
        
        return usuario.converterParaDto();
  }  
  
  return null; 
  }

}
