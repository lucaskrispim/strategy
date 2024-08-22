package org.example;

public class Forca implements Grandeza {

    @Override
    public float calcular(float massa, float aceleracao) {
        return massa * aceleracao;
    }
}
