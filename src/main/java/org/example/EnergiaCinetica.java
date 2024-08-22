package org.example;

public class EnergiaCinetica implements Grandeza {

    @Override
    public float calcular(float massa, float velocidade) {
        return 0.5f * massa * velocidade * velocidade;
    }
}
