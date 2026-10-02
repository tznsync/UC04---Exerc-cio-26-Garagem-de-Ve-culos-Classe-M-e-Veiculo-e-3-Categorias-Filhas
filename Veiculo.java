package com.mycompany.garagem;

public class Veiculo {
    private String marca;
    private String modelo;
    private int anoFabricacao;
    private double valorMercado;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public double getValorMercado() {
        return valorMercado;
    }

    public void setValorMercado(double valorMercado) {
        this.valorMercado = valorMercado;
    }
    
    public void buzinar() {
        System.out.println("O veiculo "+getMarca()+" / "+getModelo()+" / "+getAnoFabricacao()+
                "\n"+"avaliado em R$"+getValorMercado()+" buzinou: Beep Beep!"+
                "\n"+"-----------------------------------------------------");
    }
}
