package com.diegomendes.solid.principles.iv_interface_segregation.new_code;

import com.diegomendes.solid.principles.iv_interface_segregation.new_code.interfaces.Aluguel;

public class AluguelDiferenciado implements Aluguel {

  public Double calcularAluguel(){
    return 800.00;
  }

}
