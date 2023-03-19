package br.edu.ifpb.locadora.model;

import br.edu.ifpb.locadora.impl.ExtratoService;
import br.edu.ifpb.locadora.model.Aluguel;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Cliente {
    private String nome;
    private List<Aluguel> dvdsAlugados = new ArrayList<Aluguel>();

    public Cliente(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void adicionaAluguel(Aluguel aluguel) {
        dvdsAlugados.add(aluguel);
    }

    public String extrato(ExtratoService extratoService) {
        return extratoService.extrato(this.dvdsAlugados,this.getNome(),this.getPontosDeAlugadorFrequente(), this.getValorTotal());
    }
    public String extratoHTML(ExtratoService extratoService) {
        return extratoService.extrato(this.dvdsAlugados,this.getNome(),this.getPontosDeAlugadorFrequente(), this.getValorTotal());
    }
    private double getValorTotal(){
        double valorTotal = 0;
        for (Aluguel aluguel : dvdsAlugados) {
            valorTotal += aluguel.getValorDoAluguel();
        }
        return valorTotal;
    }
    private int getPontosDeAlugadorFrequente(){
        int pontosDeAlugadorFrequente = 0;
        for (Aluguel aluguel : dvdsAlugados) {
            pontosDeAlugadorFrequente += aluguel.getPontosDeAlugadorFrequente();
        }
        return pontosDeAlugadorFrequente;
    }
}
