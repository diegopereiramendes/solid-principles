package com.diegomendes.solid.principles.i_single_responsibility.new_code;

import com.diegomendes.solid.principles.i_single_responsibility.new_code.interfaces.RegraPrecoFinal;

public class Carro {
  private Double preco;
  private TipoCarro tipoCarro;

  //GETTER AND SETTER
  public Double getPreco() {
    return preco;
  }

  public void setPreco(Double precoTotal) {
    this.preco = preco;
  }

  public TipoCarro getTipoCarro() {
    return tipoCarro;
  }

  public void setTipoCarro(TipoCarro tipoCarro) {
    this.tipoCarro = tipoCarro;
  }

  public RegraPrecoFinal getRegraPrecoFinal(){
    return this.getTipoCarro().getRegraPrecoFinal();
  }
  public Double calculaPrecoFinal(){
    return this.getRegraPrecoFinal().calculaPrecoFinal(this);
  }
}
