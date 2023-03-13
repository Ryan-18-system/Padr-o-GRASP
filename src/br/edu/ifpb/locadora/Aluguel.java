package br.edu.ifpb.locadora;


public class Aluguel {
    private  DVD dvd;
    private  int diasAlugado;
    private double preco;


    public Aluguel(DVD dvd, int diasAlugado) {
        this.dvd = dvd;
        this.diasAlugado = diasAlugado;
        this.preco = 0;
    }



    public DVD getDVD() {
        return dvd;
    }

    public int getDiasAlugado() {
        return diasAlugado;
    }

    public double valorDoAluguel(){
        this.preco = this.getDVD().valorDoAluguel(this.getDiasAlugado());
        return this.preco;

    }
    public int getPontosDeAlugadorFrequente(){
        return this.getDVD().getPontosDeAlugadorFrequente(this.getDiasAlugado());
    }
}
