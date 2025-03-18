# Participantes: 
###  Vitor Hugo da Silva - RM558961
###  Brendon de Paula Brasil - RM559196
###  Vínicius Leandro - RM554728
###  João Henrique Murilla Ganança - RM556405

# Sistema de Gestão de Funcionários em Java
Este projeto tem como objetivo desenvolver um sistema em Java para gerenciar informações de funcionários utilizando conceitos de Orientação a Objetos, herança, anotações, reflexão e conexão com banco de dados. O sistema inclui a criação de classes para representar funcionários de diferentes perfis, a integração com Hibernate para persistência de dados e a geração automática de SQL via reflexão.

# Estrutura do Projeto
### Classe Funcionario:

Representa um funcionário básico com atributos como nome, horas trabalhadas e valor pago por hora.
Métodos implementados para calcular o salário final e exibir informações do funcionário.

### Subclasse FuncionarioSenior:

Representa um funcionário sênior com um bônus adicional para cada 15 horas trabalhadas.
Sobrescrita dos métodos calcularSalario e imprimirInformacao para tratar as especificidades do salário e informações.

### Subclasse de FuncionarioCalmo:

Representa um funcionário com um bônus adicional para cada 20 horas trabalhadas.
Sobrescrita dos métodos calcularSalario e imprimirInformacao para tratar as especificidades do salário e informações.

### Subclasse de FuncionarioTranquilo:

Representa um funcionário com um bônus adicional para cada 10 horas trabalhadas.
Sobrescrita dos métodos calcularSalario e imprimirInformacao para tratar as especificidades do salário e informações.
