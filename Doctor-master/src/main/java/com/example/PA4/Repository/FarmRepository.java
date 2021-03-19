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
}