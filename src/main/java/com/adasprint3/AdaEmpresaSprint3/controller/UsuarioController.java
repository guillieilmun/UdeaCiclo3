package com.adasprint3.AdaEmpresaSprint3.controller;

import com.adasprint3.AdaEmpresaSprint3.model.Usuario;
import com.adasprint3.AdaEmpresaSprint3.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UsuarioController {
    @Autowired
    UsuarioService usuarioService;

    @GetMapping("/usuario")
    private List<Usuario> verUsuario(){
        return usuarioService.verUsuario();
    }

    @PostMapping("/usuario")
    private void crearEntrenador(@RequestBody Usuario usuario){
        usuarioService.crearYActualizarUsuario(usuario);
    }

    @DeleteMapping("usuario/{id}")
    private void eliminarEntrenador(@PathVariable("id") Long id){
        usuarioService.eliminarUsuario(id);
    }

    @GetMapping("/usuario/{id}")
    private Usuario verUsuarioPorId(@PathVariable("id") Long id){
        return usuarioService.verUsuarioPorId(id);
    }

    @PutMapping("/usuario")
    private void editarUsuario(@RequestBody Usuario usuario){
        usuarioService.crearYActualizarUsuario(usuario);
    }

}
