package com.diegomendes.solid.principles.v_dependency_inversion.old_code;

public class Main {

  public static void main(String[] args) {
    CalculadoraAluguel calculadoraAluguel = new CalculadoraAluguel() ;

    calculadoraAluguel.calcularAluguelPadrao(new Cliente());
  }
}
