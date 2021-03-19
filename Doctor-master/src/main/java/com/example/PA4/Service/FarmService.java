package com.example.PA4.Service;

import java.util.List;

import javax.transaction.Transactional;

import com.example.PA4.Entidade.Farmacia;

import com.example.PA4.Repository.FarmRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FarmService {
    

    @Autowired
    private FarmRepository repository;

    public List<Farmacia> getFarm() {
        return repository.findAll();
    }
    @Transactional
	public List<Farmacia> buscarPorEstado(String estado) {
	
		return repository.findAllByEstado(estado);
	}
}
