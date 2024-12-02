# Soft Pet - Sistema de Gestão de Petshop 🐶🐱

## Descrição
O *Soft Pet* é um sistema desenvolvido para gerenciar o cadastro de clientes, animais, funcionários e serviços em um petshop. Ele permite organizar o fluxo de informações de forma eficiente e segura, utilizando conceitos da programação orientada a objetos.

## Funcionalidades
- Cadastro de clientes e seus animais.
- Gerenciamento de funcionários por cargos.
- Listagem de serviços.
- Consulta de informações cadastradas.

## Requisitos Técnicos
- Encapsulamento e métodos de acesso.
- Herança, polimorfismo e abstração.
- Utilização de enums.
- Estrutura modular e listas.

## Estrutura de Diretórios

SoftPet/
├── README.md
├── .gitignore
├── desktop.ini
├── softPet.iml
└── src/
    ├── main/
    │   └── Main.java
    ├── model/
    │   ├── Animal.java
    │   ├── Cliente.java
    │   ├── Funcionario.java
    │   ├── Pessoa.java
    │   └── Remuneravel.java
    ├── service/
    │   └── AnimalService.java
    └── enums/
        ├── Cargo.java
        └── Servico.java

## Conceitos Implementados
- Encapsulamento: Os atributos das classes estão protegidos e acessíveis por meio de métodos getters e setters.
- Herança: A classe Pessoa é a superclasse para Cliente e Funcionario.
- Polimorfismo: Métodos são sobrescritos para cada tipo de pessoa (Cliente e Funcionario).
- Enums: Utilizados para definir cargos (CARGO) e serviços (SERVICO).
- Abstração: A classe Pessoa define atributos e métodos comuns.
- Listas Dinâmicas: Uso de ArrayList para armazenar clientes e animais de forma flexível.


## Funcionalidades Disponíveis
Ao executar a aplicação, o menu principal será exibido com as seguintes opções:

1. Cadastrar Cliente
2. Cadastrar Animal
3. Cadastrar Funcionário
4. Atualizar Dados de um Animal
5. Deletar um Animal
6. Escolher Serviço para um Animal
7. ⁠Adicionar bônus a funcionário
7. Sair

## Exemplos de Uso
- Cadastrar Cliente:
- Insira o nome, CPF, e-mail, telefone e endereço.
- Cadastrar Animal:
- ⁠Associe o animal a um cliente pelo CPF e preencha informações como espécie, raça, idade e peso.

## Autores:
- Érika Veloso
- ⁠Júlia Matos
- ⁠Manuela Aimê
- ⁠Richelle Monteiro

👾 O SoftPet é um software desenvolvido como projeto final da disciplina Linguagem de Programação I.

*Soft Pet* - Facilitando a gestão do seu pet shop! 🐶🐱
