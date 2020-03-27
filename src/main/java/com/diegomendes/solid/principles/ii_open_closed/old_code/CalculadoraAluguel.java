package com.diegomendes.solid.principles.ii_open_closed.old_code;

public class CalculadoraAluguel {

  public Double calcula(final Cliente cliente){
    AluguelPadrao aluguelPadrao = new AluguelPadrao();

    return aluguelPadrao.valorAluguel(cliente);
  }
}
