package br.com.tranquilotech.entity;

public class FuncionarioTranquilo extends Funcionario {

    private Integer qtdBonus;

    public FuncionarioTranquilo(String nome, Integer horasTrabalhadas, Double valorPagoHora) {
        super(nome, horasTrabalhadas, valorPagoHora);
        this.qtdBonus = horasTrabalhadas / 10;
    }

    @Override
    public Double calcularSalario(){
        return horasTrabalhadas * valorPagoHora + (qtdBonus * 800);
    }

    @Override
    public void mostrarFuncionario() {
        System.out.println("Funcionario do nome: " + nome + ", trabalhou " + horasTrabalhadas + "horas, recebendo " + valorPagoHora
                + " por hora, tendo o salário de " + calcularSalario() + " com um bônus de: " + qtdBonus * 800);
    }

}

