package com.diegomendes.solid.principles.iii_liskov_substitution_principle.new_code.usando_heranca;

public class ContaEstudante extends ContaComum {

    @Override
    public void rende() {
        this.saldo *= 0.5;
    }
}
