package com.diegomendes.solid.principles.v_dependency_inversion.new_code;

import com.diegomendes.solid.principles.v_dependency_inversion.new_code.interfaces.TipoAluguel;

public class MainFake {

  public static void main(String[] args) {
    TipoAluguel tipoAluguelNormal = new AluguelPadrao();
    TipoAluguel tipoAluguelDiferenciado = new AluguelDiferenciado();

    // observe que estou usando a mesma calculadora sem ter alterado nada dentro dela, ela está aberta para extensao e fechada para alteração
    CalculadoraAluguel calculadoraAluguelNormal = new CalculadoraAluguel(tipoAluguelNormal);
    CalculadoraAluguel calculadoraAluguelDiferenciado = new CalculadoraAluguel(tipoAluguelDiferenciado);

    calculadoraAluguelNormal.calcula(new Cliente());
    calculadoraAluguelDiferenciado.calcula(new Cliente());
  }
}
