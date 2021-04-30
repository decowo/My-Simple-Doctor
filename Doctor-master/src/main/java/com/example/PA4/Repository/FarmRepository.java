package com.example.PA4.Repository;
import java.util.List;

import com.example.PA4.Entidade.Farmacia;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
@Repository

public interface FarmRepository extends JpaRepository <Farmacia, Integer> {


    @Query("select estado from Farmacia estado where estado.estado like :local")
	public List<Farmacia> findAllByEstado(@Param("local") String local);

   // @Query("select estado, localizacao from Farmacia estado where estado.estado like :estado and estado.localizacao like :cidade")
    @Query("SELECT f FROM Farmacia f WHERE f.estado = :estado and f.localizacao = :cidade")
	public List<Farmacia> findAllByEstadoCidade(@Param ("estado") String estado, @Param ("cidade") String cidade);
}