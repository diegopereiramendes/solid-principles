package com.diegomendes.solid.principles.v_dependency_inversion.new_code;

import com.diegomendes.solid.principles.v_dependency_inversion.new_code.interfaces.TipoAluguel;

public class CalculadoraAluguel {

  private TipoAluguel tipoAluguel; //UTILIZAÇÃO DIP, estamos dependendo da abstração e não de uma implementação

  public CalculadoraAluguel(TipoAluguel tipoAluguel) {
    this.tipoAluguel = tipoAluguel;
  }

  public Double calcula(final Cliente cliente){
    return tipoAluguel.valorAluguel(cliente);
  }
}
