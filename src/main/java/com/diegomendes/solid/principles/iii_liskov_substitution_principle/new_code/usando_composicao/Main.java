package com.diegomendes.solid.principles.iii_liskov_substitution_principle.new_code.usando_composicao;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<ContaComum> contasDoBanco = createContasFake();

        for (ContaComum conta : contasDoBanco) {
            conta.rende();
            System.out.println("Novo Saldo:");
            System.out.println(conta.getSaldo());
        }
    }

    private static List<ContaComum> createContasFake() {
        List<ContaComum> contasFakes = new ArrayList<ContaComum>();

        ContaComum contaComum1 = new ContaComum();
        ContaComum contaComum2 = new ContaComum();
        contasFakes.add(contaComum1);
        contasFakes.add(contaComum2);

        return contasFakes;
    }

}
