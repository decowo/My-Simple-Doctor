package com.example.PA4.Repository;


import java.util.Optional;

import com.example.PA4.Entidade.Usuario;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository <Usuario, Integer> {

    Optional<Usuario> findByUsername(String username);
}
