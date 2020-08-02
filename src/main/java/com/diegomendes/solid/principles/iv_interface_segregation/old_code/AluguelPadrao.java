package com.diegomendes.solid.principles.iv_interface_segregation.old_code;

import com.diegomendes.solid.principles.iv_interface_segregation.old_code.interfaces.Aluguel;

public class AluguelPadrao implements Aluguel {

  public Double calcularAluguel(){
    return 1000.00;
  }

  public Double calcularTaxaAgua() {
    return null;
  }

}
