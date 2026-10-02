package com.mycompany.garagem;

public class Caminhao extends Veiculo {
    private double capacidadeCargaToneladas;

    public double getCapacidadeCargaToneladas() {
        return capacidadeCargaToneladas;
    }

    public void setCapacidadeCargaToneladas(double capacidadeCargaToneladas) {
        this.capacidadeCargaToneladas = capacidadeCargaToneladas;
    }
    public void descarregar() {
        System.out.println("Descarregando"+getCapacidadeCargaToneladas()+" toneladas da caçamba do "+getModelo());
    }
}
