package br.com.tranquilotech.entity;

public class Funcionario {
    private String nome;
    private Integer horasTrabalhadas;
    private Double valorPagoHora;

    public Funcionario() {
    }

    public Funcionario(String nome, Integer horasTrabalhadas, Double valorPagoHora) {
        this.nome = nome;
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorPagoHora = valorPagoHora;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(Integer horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public Double getValorPagoHora() {
        return valorPagoHora;
    }

    public void setValorPagoHora(Double valorPagoHora) {
        this.valorPagoHora = valorPagoHora;
    }

    public Double calcularSalario(){
        return horasTrabalhadas * valorPagoHora;
    }

    public void mostrarFuncionario() {
        System.out.println("Funcionario do nome: " + nome + ", trabalhou " + horasTrabalhadas + "horas, recebendo " + valorPagoHora
                + " por hora, tendo o salário de " + calcularSalario());
    }
}
