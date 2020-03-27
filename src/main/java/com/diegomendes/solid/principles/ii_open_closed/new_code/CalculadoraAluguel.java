package com.diegomendes.solid.principles.ii_open_closed.new_code;

import com.diegomendes.solid.principles.ii_open_closed.new_code.interfaces.TipoAluguel;

//observer que essa classe se torna fechada para alteracoes, nao importa o tipo de aluguel passado, ela vai funcionar sem alteracao
public class CalculadoraAluguel {

  private TipoAluguel tipoAluguel;

  public CalculadoraAluguel(TipoAluguel tipoAluguel) {
    this.tipoAluguel = tipoAluguel;
  }

  public Double calcula(final Cliente cliente){
    return tipoAluguel.valorAluguel(cliente);
  }
}
