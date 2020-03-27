package com.diegomendes.solid.principles.ii_open_closed.new_code;

import com.diegomendes.solid.principles.ii_open_closed.new_code.interfaces.Aluguel;

public class AluguelDiferenciado implements Aluguel {

  public Double valorAluguel(final Cliente cliente){
    if(cliente.getIdade() > 60){
      return 400.00;
    }
    else{
      return 700.00;
    }
  }
}
