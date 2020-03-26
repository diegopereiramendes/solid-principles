package com.diegomendes.solid.principles.i_single_responsibility.new_code;

public class CalculadoraPrecoFinal {

  private Double calculaPreco(final Carro carro){
    return carro.calculaPrecoFinal(); //código encapsulado... sei o que faz, mas nem sei como ele faz XD
  }
}
