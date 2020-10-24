package com.diegomendes.solid.principles.iii_liskov_substitution_principle.new_code.usando_composicao;

public class ManipuladorSaldo {

    private double saldo = 100;

    public void deposita(double valor) {
        saldo += valor;
    }

    public void rende() {
        saldo *= 1.1;
    }

    public double getSaldo() {
        return saldo;
    }
}
