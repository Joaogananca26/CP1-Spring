package br.com.tranquilotech.entity;

public class FuncionarioSenior extends Funcionario {

    private Integer qtdBonus;

    public FuncionarioSenior(String nome, Integer horasTrabalhadas, Double valorPagoHora) {
        super(nome, horasTrabalhadas, valorPagoHora);
        this.qtdBonus = horasTrabalhadas / 15;
    }

    @Override
    public Double calcularSalario(){
        return horasTrabalhadas * valorPagoHora + (qtdBonus * 400);
    }

    @Override
    public void mostrarFuncionario() {
        System.out.println("Funcionario do nome: " + nome + ", trabalhou " + horasTrabalhadas + "horas, recebendo " + valorPagoHora
                + " por hora, tendo o salário de " + calcularSalario() + " com um bônus de: " + qtdBonus * 400);
    }

}
