package com.diegomendes.solid.principles.v_dependency_inversion.new_code;

import com.diegomendes.solid.principles.v_dependency_inversion.new_code.interfaces.Aluguel;

public class CalculadoraAluguel {

  private Aluguel aluguel; //UTILIZAÇÃO DIP, estamos dependendo da abstração e não de uma implementação

  public CalculadoraAluguel(Aluguel aluguel) {
    this.aluguel = aluguel;
  }

  public Double calcularAluguel(){
    return aluguel.calcularAluguel();
  }
}
