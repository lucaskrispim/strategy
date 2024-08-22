package org.example;

public class ContextoFisico {

    private float parametro1;
    private float parametro2;

    public ContextoFisico(float parametro1, float parametro2) {
        this.parametro1 = parametro1;
        this.parametro2 = parametro2;
    }

    public float executarOperacao(Grandeza operacao) {
        return operacao.calcular(parametro1, parametro2);
    }
}
