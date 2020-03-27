package com.diegomendes.solid.principles.v_dependency_inversion.new_code;

import com.diegomendes.solid.principles.v_dependency_inversion.new_code.interfaces.TipoAluguel;

public class AluguelDiferenciado implements TipoAluguel {

  public Double valorAluguel(final Cliente cliente){
    if(cliente.getIdade() > 60){
      return 400.00;
    }
    else{
      return 700.00;
    }
  }
}
