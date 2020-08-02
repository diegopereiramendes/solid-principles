package com.diegomendes.solid.principles.iv_interface_segregation.old_code;

import com.diegomendes.solid.principles.iv_interface_segregation.old_code.interfaces.Aluguel;

public class AluguelDiferenciado implements Aluguel {

  public Double calcularAluguel(){
    return 800.00;
  }

  public Double calcularTaxaAgua() {
    return 50.00;
  }

}
