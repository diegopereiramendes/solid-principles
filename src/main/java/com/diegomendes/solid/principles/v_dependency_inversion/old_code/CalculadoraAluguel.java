package com.diegomendes.solid.principles.v_dependency_inversion.old_code;

public class CalculadoraAluguel {

  public Double calcularAluguelPadrao(final Cliente cliente){
    AluguelPadrao aluguelPadrao = new AluguelPadrao(); // esse `new` não tá legal, e se existisse outro tipo de alugel? teriamos que modificar essa classe calculadora para acrescentar outro metodo

    return aluguelPadrao.calcularAluguel(cliente);
  }
}
