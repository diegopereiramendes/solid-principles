package com.diegomendes.solid.principles.i_single_responsibility.old_code;

public class CalculadoraPrecoFinal {

  //para cada tipo novo teríamos que adicionar uma nova regra aqui, e em um código maior, poderíamos
  //nos perder em todos os lugares que deveriam ser alterados, Segregação de Mudança
  private Double calculaPreco(final Carro carro){

    if(carro.getTipoCarro().equals(TipoCarro.BMW)){
      return calculaPrecoFinalBMW(carro);
    }

    if(carro.getTipoCarro().equals(TipoCarro.FERRARI)){
      return calculaPrecoFinalFerrari(carro);
    }

    if(carro.getTipoCarro().equals(TipoCarro.FUSCA)){
      return calculaPrecoFinalFusca(carro);
    }

    return 0.0;
  }

  private Double calculaPrecoFinalBMW(final Carro carro) {
    return carro.getPreco() + 2000;
  }

  private Double calculaPrecoFinalFerrari(final Carro carro) {
    return carro.getPreco() + 4000;
  }

  private Double calculaPrecoFinalFusca(final Carro carro) {
    return carro.getPreco() + 1000;
  }
}
