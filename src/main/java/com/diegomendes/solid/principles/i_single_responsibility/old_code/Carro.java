package com.diegomendes.solid.principles.i_single_responsibility.old_code;

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
}
