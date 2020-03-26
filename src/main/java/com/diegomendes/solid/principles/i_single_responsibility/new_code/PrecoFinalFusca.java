package com.diegomendes.solid.principles.i_single_responsibility.new_code;

import com.diegomendes.solid.principles.i_single_responsibility.new_code.interfaces.RegraPrecoFinal;
import com.diegomendes.solid.principles.i_single_responsibility.old_code.Carro;

public class PrecoFinalFusca implements RegraPrecoFinal {

  public Double calculaPrecoFinal(final Carro carro) {
    return carro.getPreco() + 1000;
  }
}
