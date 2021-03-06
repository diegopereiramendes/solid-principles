package com.diegomendes.solid.principles.iii_liskov_substitution_principle.old_code;

import com.diegomendes.solid.principles.iii_liskov_substitution_principle.old_code.exceptions.ContaNaoRendeException;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws ContaNaoRendeException {
        List<ContaComum> contasDoBanco = createContasFake();

        for (ContaComum conta : contasDoBanco) {
            conta.rende();
            System.out.println("Novo Saldo:");
            System.out.println(conta.getSaldo());
        }
    }

    private static List<ContaComum> createContasFake(){
        List<ContaComum> contasDoBanco = new ArrayList<ContaComum>();
        ContaComum contaComum1 = new ContaComum();
        ContaComum contaComum2 = new ContaComum();
        ContaEstudante contaEstudante = new ContaEstudante();

        contasDoBanco.add(contaComum1);
        contasDoBanco.add(contaComum2);
        contasDoBanco.add(contaEstudante);
        return contasDoBanco;
    }
}
