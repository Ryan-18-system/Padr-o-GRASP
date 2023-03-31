package br.edu.ifpb.locadora.model;

import java.util.ArrayList;
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

    public List<Aluguel> getDvdsAlugados() {
        return dvdsAlugados;
    }

    public void adicionaAluguel(Aluguel aluguel) {
        dvdsAlugados.add(aluguel);
    }

    public double getValorTotal(){
        double valorTotal = 0;
        for (Aluguel aluguel : dvdsAlugados) {
            valorTotal += aluguel.getValorDoAluguel();
        }
        return valorTotal;
    }
    public int getPontosDeAlugadorFrequente(){
        int pontosDeAlugadorFrequente = 0;
        for (Aluguel aluguel : dvdsAlugados) {
            pontosDeAlugadorFrequente += aluguel.getPontosDeAlugadorFrequente();
        }
        return pontosDeAlugadorFrequente;
    }
}
