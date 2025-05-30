# Participantes: 
###  Vitor Hugo da Silva - RM558961
###  Brendon de Paula Brasil - RM559196
###  Vínicius Leandro - RM554728
###  João Henrique Murilla Ganança - RM556405

# Sistema de Gestão de Funcionários em Java
Este projeto tem como objetivo desenvolver um sistema em Java para gerenciar informações de funcionários utilizando conceitos de Orientação a Objetos, herança, anotações, reflexão e conexão com banco de dados.

O sistema inclui a criação de classes para representar funcionários de diferentes perfis, a integração com Hibernate para persistência de dados e a geração automática de SQL via reflexão.

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

@Tabela: Define o nome da tabela no banco de dados.

@Coluna: Configura atributos referente as colunas do banco de dados.

# Anotações JPA:

@Table: Configura a tabela no banco de dados JPA.

@Entity: Declara a classe como entitidade no JPA.

@Column: Configura atributos referente as colunas do JPA.

@Id: Define a chave primária da tabela.

@GeneratedValue: Define a estratégia de geração automática de valores para a chave primária.

@SequenceGenerator: Define um gerador de sequência para a chave primária.

@PostPersist: Método anotado será executado após a persistência de uma entidade.

# Funcionalidades:

- Cálculo de salários baseado nas horas trabalhadas e no valor por hora.
- Exibição de informações dos funcionários.
- Implementação de perfis diferentes de funcionários.
- Geração automática de comandos SQL via API Reflection.
- Integração com Hibernate para manipulação de dados no banco Oracle.
- Exibição dos comandos SQL gerados durante as operações CRUD.

# Configuração e Execução:

### Configuração do Banco de Dados

Certifique-se de que você possui um banco de dados Oracle SQL Developer configurado corretamente.

No arquivo persistence.xml, configure as credenciais do banco de dados.

### Execução do Projeto

Clone este repositório.

Configure as dependências do Hibernate no pom.xml.

Compile e execute o programa principal.

# Exemplo de Saída:

Ao cadastrar um novo funcionário, o sistema exibirá a consulta SQL gerada,
e também será possível visualizar as informações do funcionário.

# pom.xml do projeto:

![WhatsApp Image 2025-04-22 at 23 15 57](https://github.com/user-attachments/assets/0ea98ec9-445b-4bc4-bcf2-5b33a321705e)

# persistence.xml:

![Capture](https://github.com/user-attachments/assets/39f09e0c-72c4-4158-8075-a4c3d0453dce)

# SLQ Generator:

![Capturre](https://github.com/user-attachments/assets/ee34cb48-a3f0-4ad3-a38d-409d4793ff66)
