package com.adasprint3.AdaEmpresaSprint3.service;

import com.adasprint3.AdaEmpresaSprint3.model.Usuario;
import com.adasprint3.AdaEmpresaSprint3.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UsuarioService {

    @Autowired
    UsuarioRepository usuarioRepository;

    public void crearYActualizarUsuario(Usuario usuario){
        usuarioRepository.save(usuario);
    }

    public List<Usuario> verUsuario(){
        return usuarioRepository.findAll();
    }

    public Usuario verUsuarioPorId(Long id) {
        return usuarioRepository.findById(id).get();
    }

    public void eliminarUsuario(Long id){
        usuarioRepository.deleteById(id);
    }

}
