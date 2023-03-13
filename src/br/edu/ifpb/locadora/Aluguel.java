package br.edu.ifpb.locadora;


public class Aluguel {
    private Alugavel alugavel;
    private  int diasAlugado;
    private double preco;


    public Aluguel(Alugavel alugavel, int diasAlugado) {
        this.alugavel = alugavel;
        this.diasAlugado = diasAlugado;
        this.preco = 0;
    }



    public Alugavel getDVD() {
        return alugavel;
    }

    public int getDiasAlugado() {
        return diasAlugado;
    }

    public double getValorDoAluguel(){
        this.preco = this.getDVD().getValorDoAluguel(this.getDiasAlugado());
        return this.preco;

    }
    public int getPontosDeAlugadorFrequente(){
        return this.getDVD().getPontosDeAlugadorFrequente(this.getDiasAlugado());
    }
}
