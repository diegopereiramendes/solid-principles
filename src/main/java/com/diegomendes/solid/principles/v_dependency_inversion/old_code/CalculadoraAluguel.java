package com.diegomendes.solid.principles.v_dependency_inversion.old_code;

public class CalculadoraAluguel {

  public Double calcularAluguelPadrao(){
    AluguelPadrao aluguelPadrao = new AluguelPadrao(); // esse `new` não tá legal, e se existisse outro tipo de aluguel? teriamos que modificar essa classe calculadora para acrescentar outro metodo

    return aluguelPadrao.calcularAluguel();
  }

  public Double calcularAluguelDiferenciado(){
    AluguelDiferenciado aluguelDiferenciado = new AluguelDiferenciado(); // esse `new` não tá legal, e se existisse outro tipo de aluguel? teriamos que modificar essa classe calculadora para acrescentar outro metodo

    return aluguelDiferenciado.calcularAluguel();
  }
}
