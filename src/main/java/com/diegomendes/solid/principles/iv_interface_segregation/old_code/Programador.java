package com.diegomendes.solid.principles.iv_interface_segregation.old_code;

public class Programador implements Funcionario {

  public Double salario() {
    return 4000.00;
  }

  public void registrarPonto() {
    System.out.println("REGISTRANDO PONTO  - em banco de dados");
  }
}
