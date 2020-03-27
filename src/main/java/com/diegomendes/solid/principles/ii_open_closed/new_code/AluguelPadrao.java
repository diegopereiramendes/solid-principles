package com.diegomendes.solid.principles.ii_open_closed.new_code;

import com.diegomendes.solid.principles.ii_open_closed.new_code.interfaces.Aluguel;

public class AluguelPadrao implements Aluguel {

  public Double valorAluguel(final Cliente cliente){
    if(cliente.getIdade() > 60){
      return 600.00;
    }
    else{
      return 1000.00;
    }
  }
}
