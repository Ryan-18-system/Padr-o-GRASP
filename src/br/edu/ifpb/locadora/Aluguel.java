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
        switch(this.getDVD().getCodigoDePreco()) {
            case DVD.NORMAL: // R$ 2.00 por 2 dias. O dia adicional acrescenta R$ 1.50
                preco += 2.0;
                if(this.getDiasAlugado() > 2) {
                    preco += (this.getDiasAlugado() - 2) * 1.5;
                }
                break;

            case DVD.LANÇAMENTO: // R$ 3.00 por dia
                preco += this.getDiasAlugado() * 3.00;
                break;

            case DVD.INFANTIL: // R$ 1.50 por 3 dias. O dia adicional acrescenta R$ 1.50
                preco += 1.5;

                if(this.diasAlugado > 3) {
                    preco += (this.getDiasAlugado() - 3) * 1.5;
                }
                break;
        }
        return preco;

    }
    public int getPontosDeAlugadorFrequente(){
        return this.getDVD().getCodigoDePreco() == DVD.LANÇAMENTO && this.getDiasAlugado() > 1 ? 2 : 1;
    }
}
