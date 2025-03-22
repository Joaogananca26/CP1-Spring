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

# Anotações Personalizadas:

@Tabela(nome="TAB_FUNCIONARIO"): Define o nome da tabela no banco de dados.

@Coluna(nome="NOME_FUNCIONARIO"): Define o nome das colunas no banco de dados.

@Id: Define a chave primária da tabela.

@GeneratedValue: Define a estratégia de geração automática de valores para a chave primária.

@SequenceGenerator: Define um gerador de sequência para a chave primária.

@PostPersist: Método anotado será executado após a persistência de uma entidade.

# Funcionalidades:

Cálculo de salários baseado nas horas trabalhadas e no valor por hora.

Exibição de informações dos funcionários.

Implementação de perfis diferentes de funcionários.

Geração automática de comandos SQL via API Reflection.

Integração com Hibernate para manipulação de dados no banco Oracle.

Exibição dos comandos SQL gerados durante as operações CRUD.

# Configuração e Execução:

### Configuração do Banco de Dados

Certifique-se de que você possui um banco de dados Oracle SQL Developer configurado corretamente.

### Configuração do Hibernate

No arquivo persistence.xml, configure as credenciais do banco de dados:

### Execução do Projeto

Clone este repositório.

Configure as dependências do Hibernate no pom.xml (se estiver usando Maven).

Compile e execute o programa principal (Main.java).

# Exemplo de Saída:

Ao cadastrar um novo funcionário, o sistema exibirá a consulta SQL gerada,
e também será possível visualizar as informações do funcionário.
