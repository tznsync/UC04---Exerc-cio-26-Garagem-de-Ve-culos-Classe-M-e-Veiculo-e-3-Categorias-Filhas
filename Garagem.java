package com.mycompany.garagem;

public class Garagem {

    public static void main(String[] args) {
        Carro c1 = new Carro();
        c1.setMarca("Toyota");
        c1.setModelo("Corolla ");
        c1.setAnoFabricacao(2024);
        c1.setValorMercado(145000.0);
        c1.setQuantidadePortas(4);
        c1.buzinar();
        c1.abrirPortaMalas();
        
        Moto m1 = new Moto();
        m1.setMarca("Honda");
        m1.setModelo("CB 600 ");
        m1.setAnoFabricacao(2024);
        m1.setValorMercado(42000.0);
        m1.setCilindradas(600);
        m1.buzinar();
        m1.empinar();
        
        Caminhao ca1 =  new Caminhao();
        ca1.setMarca("Volvo");
        ca1.setModelo("FH 540 ");
        ca1.setAnoFabricacao(2022);
        ca1.setValorMercado(680000.0);
        ca1.setCapacidadeCargaToneladas(45.0);
        ca1.buzinar();
        ca1.descarregar();
    }
}
