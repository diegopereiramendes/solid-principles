package com.diegomendes.solid.principles.iii_liskov_substitution_principle.new_code.usando_composicao;

class ContaComum {

    private ManipuladorSaldo manipulador;

    public ContaComum() {
        this.manipulador = new ManipuladorSaldo();
    }

    public void rende() {
        manipulador.rende();
    }

    public double getSaldo() {
        return manipulador.getSaldo();
    }

    public void deposita(double valor) {
        manipulador.deposita(valor);
    }
}
