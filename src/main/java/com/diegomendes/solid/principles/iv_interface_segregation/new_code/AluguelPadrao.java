package com.diegomendes.solid.principles.iv_interface_segregation.new_code;

import com.diegomendes.solid.principles.iv_interface_segregation.new_code.interfaces.Aluguel;
import com.diegomendes.solid.principles.iv_interface_segregation.new_code.interfaces.GeradorNotaFiscal;

public class AluguelPadrao implements Aluguel, GeradorNotaFiscal {

  public Double calcularAluguel(){
    return 1000.00;
  }

  public String gerarNotaFiscal() {
    return "Nota Fiscal gerada com Sucesso.";
  }
}
