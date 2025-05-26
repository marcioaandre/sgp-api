package com.sgp.api.controller;

import java.util.List;
import java.util.Objects;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sgp.api.dto.UsuarioDTo;
import com.sgp.api.model.Usuario;
import com.sgp.api.service.UsuarioService;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
    



@GetMapping
public ResponseEntity<List<Usuario>> listarUsuarios() { 
    return ResponseEntity.ok().body(UsuarioService.carregarUsuarioCadastrados());
}

@GetMapping("/{id}")
public ResponseEntity<UsuarioDTo> buscarUsuarioPeloId(@PathVariable("id") Long id){
     UsuarioDTo usuario = UsuarioService.obterDadosUsuarioPeloId(id);

        if (Objects.isNull(usuario)) {
            return ResponseEntity.notFound().build();

        } 
        return ResponseEntity.status(HttpStatus.OK).body(usuario);
    }   

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarUsuario(@PathVariable("id") Long id) {
            UsuarioDTo usuario = UsuarioService.obterDadosUsuarioPeloId(id);
    }





}
