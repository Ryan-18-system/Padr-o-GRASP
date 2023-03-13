package br.edu.ifpb.locadora;


public class Aluguel {
    private DVD dvd;
    private int diasAlugado;
    private double preco;

    public double getPreco() {
        return preco;
    }





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
        return this.getDVD().valorDoAluguel(this.preco,diasAlugado);

    }
    public int getPontosDeAlugadorFrequente(){
        return this.getDVD().getPontosDeAlugadorFrequente(this.getDiasAlugado());
    }
}
