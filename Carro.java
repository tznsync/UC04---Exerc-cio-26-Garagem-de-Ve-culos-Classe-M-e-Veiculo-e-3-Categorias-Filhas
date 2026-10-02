package com.mycompany.garagem;

public class Carro extends Veiculo {
    private int quantidadePortas;

    public int getQuantidadePortas() {
        return quantidadePortas;
    }

    public void setQuantidadePortas(int quantidadePortas) {
        this.quantidadePortas = quantidadePortas;
    }
    public void abrirPortaMalas() {
        System.out.println(getModelo()+" abriu o porta-malas com sucesso!");
    }
}
