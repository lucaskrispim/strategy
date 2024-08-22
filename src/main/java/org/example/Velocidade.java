package org.example;

public class Velocidade implements Grandeza {

    @Override
    public float calcular(float deslocamento, float tempo) {
        if (tempo == 0) {
            throw new IllegalArgumentException("Tempo não pode ser zero");
        }
        return deslocamento / tempo;
    }
}
