package com.diegomendes.solid.principles.v_dependency_inversion.new_code;

import com.diegomendes.solid.principles.v_dependency_inversion.new_code.interfaces.Aluguel;

public class Main {

  public static void main(String[] args) {
    Aluguel aluguelNormal = new AluguelPadrao();
    Aluguel aluguelDiferenciado = new AluguelDiferenciado();

//    // observe que estou usando a mesma calculadora sem ter alterado nada dentro dela, ela está aberta para extensao e fechada para alteração
    CalculadoraAluguel calculadoraAluguelNormal = new CalculadoraAluguel(aluguelNormal);
    CalculadoraAluguel calculadoraAluguelDiferenciado = new CalculadoraAluguel(aluguelDiferenciado);
//
    Double calculoDiego = calculadoraAluguelNormal.calcularAluguel();
    Double calculoTiago = calculadoraAluguelDiferenciado.calcularAluguel();
//
    System.out.println("Aluguel Diego:" + calculoDiego);
    System.out.println("Aluguel Tiago:" + calculoTiago);
  }
}
