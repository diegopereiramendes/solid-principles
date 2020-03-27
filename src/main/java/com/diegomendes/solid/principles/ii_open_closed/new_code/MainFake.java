package com.diegomendes.solid.principles.ii_open_closed.new_code;

import com.diegomendes.solid.principles.ii_open_closed.new_code.interfaces.Aluguel;

public class MainFake {

  public static void main(String[] args) {
    Aluguel aluguelNormal = new AluguelPadrao();
    Aluguel aluguelDiferenciado = new AluguelDiferenciado();

    // observe que estou usando a mesma calculadora sem ter alterado nada dentro dela, ela está aberta para extensao e fechada para alteração
    CalculadoraAluguel calculadoraAluguelNormal = new CalculadoraAluguel(aluguelNormal);
    CalculadoraAluguel calculadoraAluguelDiferenciado = new CalculadoraAluguel(aluguelDiferenciado);

    calculadoraAluguelNormal.calcula(new Cliente());
    calculadoraAluguelDiferenciado.calcula(new Cliente());
  }
}
