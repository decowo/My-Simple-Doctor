package com.example.PA4.Service;

import java.util.List;

import javax.transaction.Transactional;

import com.example.PA4.Entidade.Medicamento;
import com.example.PA4.Repository.MedRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MedService {

    @Autowired
    private MedRepository repository;



    public List<Medicamento> getMeds() {
        return repository.findAll();
    }

    public Medicamento getmedbyid(int idmed)
    {
        return repository.findById(idmed).get();
    }

    public void salvar(Medicamento med)
    {
        repository.save(med);
    }

    @Transactional
	public List<Medicamento> buscarPorindicacao(String indicacao) {
		
		return repository.findAllByindicacao(indicacao);
	}
	

}
