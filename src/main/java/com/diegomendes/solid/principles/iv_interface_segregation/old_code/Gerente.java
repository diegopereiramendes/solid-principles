package com.diegomendes.solid.principles.iv_interface_segregation.old_code;

public class Gerente implements Funcionario {

  public Double salario() {
    return 40000.00;
  }

  public void registrarPonto() {
    throw new RuntimeException("NAO REGISTRA PONTO - ELE TEM MORAL kkkkk");
  }
}
