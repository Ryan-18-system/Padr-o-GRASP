package br.edu.ifpb.locadora;

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

    public String extrato() {
        final String fimDeLinha = System.getProperty("line.separator");
        Iterator<Aluguel> alugueis = dvdsAlugados.iterator();
        StringBuilder resultado = new StringBuilder("Registro de Alugueis de " + getNome() + fimDeLinha);
        while(alugueis.hasNext()){
            Aluguel aluguel = alugueis.next();
            resultado.append(aluguel.getDVD().getTitulo()).append(" ").append(aluguel.valorDoAluguel()).append(fimDeLinha);

        }
        resultado.append("Valor total pago: R$ ").append(this.getValorTotal()).append(fimDeLinha);
        resultado.append("Voce acumulou ").append(this.getPontosDeAlugadorFrequente()).append(" pontos de alugador frequente");
        return resultado.toString();
    }
    private double getValorTotal(){
        double valorTotal = 0;
        for (Aluguel aluguel : dvdsAlugados) {
            valorTotal += aluguel.valorDoAluguel();
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
