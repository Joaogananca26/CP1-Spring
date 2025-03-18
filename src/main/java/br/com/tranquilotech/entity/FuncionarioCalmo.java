package br.com.tranquilotech.entity;

public class FuncionarioCalmo extends Funcionario{

    private Integer qtdBonus;

    public FuncionarioCalmo(String nome, Integer horasTrabalhadas, Double valorPagoHora) {
        super(nome, horasTrabalhadas, valorPagoHora);
        this.qtdBonus = horasTrabalhadas / 20;
    }

    @Override
    public Double calcularSalario(){
        return horasTrabalhadas * valorPagoHora + (qtdBonus * 1200);
    }

    @Override
    public void mostrarFuncionario() {
        System.out.println("Funcionario do nome: " + nome + ", trabalhou " + horasTrabalhadas + "horas, recebendo " + valorPagoHora
                + " por hora, tendo o salário de " + calcularSalario() + " com um bônus de: " + qtdBonus * 1200);
    }

}

