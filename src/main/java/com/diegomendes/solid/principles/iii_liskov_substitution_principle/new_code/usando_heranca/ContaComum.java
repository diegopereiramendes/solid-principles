package com.diegomendes.solid.principles.iii_liskov_substitution_principle.new_code.usando_heranca;

import com.diegomendes.solid.principles.iii_liskov_substitution_principle.new_code.usando_heranca.exceptions.ValorInvalidoException;

public class ContaComum {

    protected double saldo;

    public ContaComum() {
        this.saldo = 100;
    }

    public void deposita(double valor) throws ValorInvalidoException {
        if(valor <= 0)
            throw new ValorInvalidoException();
        this.saldo += valor;
    }

    public double getSaldo() {
        return saldo;
    }

    public void rende() {
        this.saldo *= 1.1;
    }
}
