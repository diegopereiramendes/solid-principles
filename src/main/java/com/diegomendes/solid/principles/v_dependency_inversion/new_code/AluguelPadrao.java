package com.diegomendes.solid.principles.v_dependency_inversion.new_code;

import com.diegomendes.solid.principles.v_dependency_inversion.new_code.interfaces.TipoAluguel;

public class AluguelPadrao implements TipoAluguel {

  public Double valorAluguel(final Cliente cliente){
    if(cliente.getIdade() > 60){
      return 600.00;
    }
    else{
      return 1000.00;
    }
  }
}
