package com.diegomendes.solid.principles.v_dependency_inversion.new_code;

import com.diegomendes.solid.principles.v_dependency_inversion.new_code.interfaces.Aluguel;

public class AluguelDiferenciado implements Aluguel {

  public Double calcularAluguel(){
    return 800.00;
  }
}
