package br.com.tranquilotech.entity;

import br.com.tranquilotech.annotations.Coluna;
import br.com.tranquilotech.annotations.Tabela;

import javax.persistence.*;

@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Entity
@Table(name ="TB_FUNCIONARIO")
@Tabela(nome = "TB_FUNCIONARIO")
@SequenceGenerator(name="funcionario",sequenceName = "tb_funcionario_id_funcionario_seq",allocationSize = 1)
public class Funcionario {
    @Id
    @Column(name="id_funcionario")
    @Coluna(nome="id_funcionario")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "funcionario")
    protected Integer id;

    @Column(name="nome_funcionario",length = 255,nullable = false)
    @Coluna(nome="nome_funcionario",tamanho = 255,obrigatorio = false)
    protected String nome;

    @Column(name = "horas_trabalhadas",nullable = false)
    @Coluna(nome = "horas_trabalhadas",obrigatorio = false)
    protected Integer horasTrabalhadas;

    @Column(name = "valor_pago_hora",nullable = false)
    @Coluna(nome = "valor_pago_hora",obrigatorio = false)
    protected Double valorPagoHora;

    public Funcionario() {
    }

    public Funcionario(String nome, Integer horasTrabalhadas, Double valorPagoHora) {
        this.nome = nome;
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorPagoHora = valorPagoHora;
    }

    @PostPersist
    private void executar(){
        System.out.println("Executando método... ");
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getId(){
        return id;
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
