package com.example.PA4.Service;

import java.util.List;

import com.example.PA4.Entidade.Usuario;
import com.example.PA4.Repository.UsuarioRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {
    
    @Autowired
    private UsuarioRepository repository;

    public List<Usuario> getUsuarios()
    {
        return repository.findAll();
    }

    public void salvar(Usuario usuario)
    {
        repository.save(usuario);
    }
    
    public List<Usuario> getUsers() {
        return repository.findAll();
    }

    public Usuario getuserbyid(int Id)
    {
        return repository.findById(Id).get();
    }

}
