package com.diegomendes.solid.principles.i_single_responsibility.new_code;

import com.diegomendes.solid.principles.i_single_responsibility.new_code.interfaces.RegraPrecoFinal;

// sempre que for criado um novo TipoCarro ele será adicionado aqui, e vai obrigar você é criar uma RegraPrecoFinal
public enum TipoCarro {
  BMW(new PrecoFinalBMW()),
  FERRARI(new PrecoFinalFerrari()),
  FUSCA(new PrecoFinalFusca());

  private RegraPrecoFinal regraPrecoFinal;

  TipoCarro(RegraPrecoFinal regraPrecoFinal) {
    this.regraPrecoFinal = regraPrecoFinal;
  }

  public RegraPrecoFinal getRegraPrecoFinal() {
    return regraPrecoFinal;
  }
}
