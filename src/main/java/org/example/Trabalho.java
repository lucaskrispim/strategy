package org.example;

public class Trabalho implements Grandeza {

    @Override
    public float calcular(float forca, float deslocamento) {
        return forca * deslocamento;
    }
}
