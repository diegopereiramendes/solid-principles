package com.diegomendes.solid.principles.ii_open_closed.new_code;

import com.diegomendes.solid.principles.ii_open_closed.new_code.interfaces.Aluguel;

//observer que essa classe se torna fechada para alteracoes, nao importa o tipo de aluguel passado, ela vai funcionar sem alteracao
public class CalculadoraAluguel {

  private Aluguel aluguel;

  public CalculadoraAluguel(Aluguel aluguel) {
    this.aluguel = aluguel;
  }

  public Double calcula(final Cliente cliente){
    return aluguel.valorAluguel(cliente);
  }
}
