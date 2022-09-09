package com.atifer.atifer.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.atifer.atifer.model.Orcamento;
import com.atifer.atifer.repository.OrcamentoRepository;

@CrossOrigin
@RestController
public class OrcamentoController {
    @GetMapping("/orcamento")
    public List<Orcamento> listaOrcamentos() {
        return OrcamentoRepository.all();
    }

    @GetMapping("/orcamento/{id}")
    public Orcamento recuperaDoadorPeloId(@PathVariable("id") int id) {
        return OrcamentoRepository.getByID(id);
    }

    @PostMapping("/recebeOrcamento")
    public void addDoador(@RequestBody Orcamento orcamento){
        OrcamentoRepository.add(orcamento);
    }

    @DeleteMapping("/deletaOrcamento/{id}") 
    public boolean deletaOrcamento(@PathVariable("id") int id){
        OrcamentoRepository.deletaPeloId(id);
        return true;
    }
}
