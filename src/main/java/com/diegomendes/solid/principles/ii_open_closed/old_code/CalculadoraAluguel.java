package com.diegomendes.solid.principles.ii_open_closed.old_code;

public class CalculadoraAluguel {

  public Double calcula(final Cliente cliente){
    AluguelPadrao aluguelPadrao = new AluguelPadrao(); // esse `new` não tá legal, e se existisse outro tipo de alugel? teriamos que modificar essa classe calculadora para acrescentar outro metodo

    return aluguelPadrao.valorAluguel(cliente);
  }
}
