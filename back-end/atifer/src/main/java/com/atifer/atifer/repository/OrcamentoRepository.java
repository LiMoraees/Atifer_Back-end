package com.atifer.atifer.repository;

import java.util.ArrayList;

import com.atifer.atifer.model.Orcamento;

public class OrcamentoRepository {
    private static OrcamentoRepository repo;
    private ArrayList<Orcamento> orcamentos;

    private OrcamentoRepository() {
        this.orcamentos = new ArrayList<>();
    }

    public static void init() {
        if (OrcamentoRepository.repo == null) {
            OrcamentoRepository.repo = new OrcamentoRepository();
            OrcamentoRepository.add(new Orcamento("Lívia Maria Moraes", "12/02/2020", "19/02/2020", 5));
        }
    }

    public static void add(Orcamento orcamento) {
        OrcamentoRepository.repo.orcamentos.add(orcamento);
    }

    public static ArrayList<Orcamento> all() {
        return OrcamentoRepository.repo.orcamentos;
    }

    public static Orcamento getByID(int id) {
        return OrcamentoRepository.repo.orcamentos.stream().filter((orcamento) -> orcamento.getId() == id).toList().get(0);
    }

    public static boolean deletaPeloId(int id) {
        Orcamento orcamentoExcluido = getByID(id);
        OrcamentoRepository.repo.orcamentos.remove(orcamentoExcluido);
        return true;
    }
}


