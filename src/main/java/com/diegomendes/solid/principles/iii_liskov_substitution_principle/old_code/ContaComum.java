package com.diegomendes.solid.principles.iii_liskov_substitution_principle.old_code;

import com.diegomendes.solid.principles.iii_liskov_substitution_principle.old_code.exceptions.ContaNaoRendeException;
import com.diegomendes.solid.principles.iii_liskov_substitution_principle.old_code.exceptions.ValorInvalidoException;

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

    public void rende() throws ContaNaoRendeException {
        this.saldo *= 1.1;
    }
}
