package com.diegomendes.solid.principles.v_dependency_inversion.old_code;

public class Main {

  public static void main(String[] args) {
    CalculadoraAluguel calculadoraAluguel = new CalculadoraAluguel() ;

    Double calculoDiego = calculadoraAluguel.calcularAluguelPadrao();
    Double calculoTiago = calculadoraAluguel.calcularAluguelDiferenciado();

    System.out.println("Aluguel Diego:" + calculoDiego);
    System.out.println("Aluguel Tiago:" + calculoTiago);
  }
}
