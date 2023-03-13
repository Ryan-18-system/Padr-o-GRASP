package br.edu.ifpb.locadora;

public class DVD implements Alugavel {
    public static final int NORMAL = 0;
    public static final int LANÇAMENTO = 1;
    public static final int INFANTIL = 2;

    private final String titulo;
    private final int codigoDePreco;

    public DVD(String titulo, int codigoDePreco) {
        this.titulo = titulo;
        this.codigoDePreco = codigoDePreco;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getCodigoDePreco() {
        return codigoDePreco;
    }

    public double getValorDoAluguel(int diasAlugados){
        double preco = 0.0;
        switch(this.getCodigoDePreco()) {
            case DVD.NORMAL: // R$ 2.00 por 2 dias. O dia adicional acrescenta R$ 1.50
                preco += 2.0;
                if(diasAlugados > 2) {
                    preco += (diasAlugados - 2) * 1.5;
                }
                break;

            case DVD.LANÇAMENTO: // R$ 3.00 por dia
                preco += diasAlugados * 3.00;
                break;

            case DVD.INFANTIL: // R$ 1.50 por 3 dias. O dia adicional acrescenta R$ 1.50
                preco += 1.5;

                if(diasAlugados > 3) {
                    preco += (diasAlugados - 3) * 1.5;
                }
                break;
        }
        return preco;

    }
    public int getPontosDeAlugadorFrequente(int diasAlugados){
        return this.getCodigoDePreco() == DVD.LANÇAMENTO && diasAlugados > 1 ? 2 : 1;
    }
}
