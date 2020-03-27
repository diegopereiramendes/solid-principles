package com.diegomendes.solid.principles.ii_open_closed.old_code;

public class AluguelPadrao {

  public Double valorAluguel(final Cliente cliente){

    if(cliente.getIdade() > 60){
      return 600.00;
    }
    else{
      return 1000.00;
    }
  }
}
