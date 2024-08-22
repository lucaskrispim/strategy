package org.example;

public class Aceleracao implements Grandeza {

    @Override
    public float calcular(float variacaoVelocidade, float tempo) {
        if (tempo == 0) {
            throw new IllegalArgumentException("Tempo não pode ser zero");
        }
        return variacaoVelocidade / tempo;
    }
}
