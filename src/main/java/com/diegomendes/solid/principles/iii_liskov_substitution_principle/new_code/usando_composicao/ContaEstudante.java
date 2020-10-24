package com.diegomendes.solid.principles.iii_liskov_substitution_principle.new_code.usando_composicao;

public class ContaEstudante {

    private ManipuladorSaldo manipulador;

    public ContaEstudante() {
        this.manipulador = new ManipuladorSaldo();
    }

    public void deposita(double valor) {
        manipulador.deposita(valor);
    }

    // nao tem o metodo rende
}
