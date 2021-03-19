package com.example.PA4.Repository;

import java.util.List;

import com.example.PA4.Entidade.Medicamento;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface MedRepository extends JpaRepository <Medicamento, Integer> {

    @Query("select indicacao from Medicamento indicacao where indicacao.indicacao like :alergia")
	public List<Medicamento> findAllByindicacao(@Param("alergia") String alergia);
}
