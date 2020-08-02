package com.diegomendes.solid.principles.iv_interface_segregation.new_code;

import com.diegomendes.solid.principles.iv_interface_segregation.new_code.interfaces.Aluguel;
import com.diegomendes.solid.principles.iv_interface_segregation.new_code.interfaces.TaxaAgua;

public class AluguelDiferenciado implements Aluguel, TaxaAgua {

  public Double calcularAluguel(){
    return 800.00;
  }

  public Double calcularTaxaAgua() {
    return 50.00;
  }
}
