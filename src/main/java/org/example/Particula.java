package org.example;

public class Particula {

    private float resultado;

    public float getResultado() {
        return resultado;
    }

    public void calcularVelocidade(float deslocamento, float tempo) {
        ContextoFisico contexto = new ContextoFisico(deslocamento, tempo);
        this.resultado = contexto.executarOperacao(new Velocidade());
    }

    public void calcularAceleracao(float variacaoVelocidade, float tempo) {
        ContextoFisico contexto = new ContextoFisico(variacaoVelocidade, tempo);
        this.resultado = contexto.executarOperacao(new Aceleracao());
    }

    public void calcularForca(float massa, float aceleracao) {
        ContextoFisico contexto = new ContextoFisico(massa, aceleracao);
        this.resultado = contexto.executarOperacao(new Forca());
    }

    public void calcularEnergiaCinetica(float massa, float velocidade) {
        ContextoFisico contexto = new ContextoFisico(massa, velocidade);
        this.resultado = contexto.executarOperacao(new EnergiaCinetica());
    }

    public void calcularTrabalho(float forca, float deslocamento) {
        ContextoFisico contexto = new ContextoFisico(forca, deslocamento);
        this.resultado = contexto.executarOperacao(new Trabalho());
    }
}
