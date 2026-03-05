# Gerenciamento de Produtos

Sistema de gerenciamento de estoque via terminal desenvolvido em Java. A aplicação permite cadastrar, remover, pesquisar, listar e editar produtos armazenados em memória, utilizando uma arquitetura simples em camadas para separar responsabilidades.

Este projeto foi desenvolvido com o objetivo de praticar programação orientada a objetos, organização de código e estrutura de aplicações Java em camadas.

---

## Funcionalidades

- **Adicionar produto** — cadastra um novo produto informando nome, quantidade e preço
- **Remover produto** — remove um produto do sistema utilizando seu ID
- **Pesquisar produto** — busca um produto pelo ID e exibe suas informações
- **Listar todos os produtos** — mostra todos os produtos cadastrados no sistema
- **Editar produto** — permite alterar:
  - nome
  - quantidade
  - preço

---

## Estrutura do Projeto
```
src/
├── App.java                      # Ponto de entrada da aplicação e controle dos menus
├── model/
│   └── Produto.java              # Classe que representa a entidade Produto
├── repository/
│   └── RepositoryProduto.java    # Responsável pelo armazenamento e manipulação dos dados
├── service/
│   └── ServiceProduto.java       # Contém as regras de negócio do sistema
├── ui/
│   ├── Menu.java                 # Mensagens e menus exibidos no terminal
│   └── MenuProdutos.java         # Exibição das informações dos produtos
└── util/
    └── InputHelper.java          # Leitura e validação das entradas do usuário
```

---

## Arquitetura

O projeto segue uma separação simples de responsabilidades:

- **Model** — representa as entidades do sistema
- **Repository** — responsável por armazenar e acessar os dados
- **Service** — contém as regras de negócio e operações sobre os produtos
- **UI** — responsável pela interação com o usuário via terminal
- **Util** — classes auxiliares para validação e leitura de dados

---

## Tecnologias Utilizadas

- Java
- Programação Orientada a Objetos (POO)
- Coleções Java (HashMap)
- Arquitetura em camadas (Model / Repository / Service / UI)

---

## Pré-requisitos

- Java JDK 11 ou superior

Verifique a instalação com:
```bash
java -version
```

---

## Como executar o projeto

**1. Clonar o repositório**
```bash
git clone https://github.com/davidanielMnds/gerenciamento-de-produtos.git
```

**2. Acessar a pasta do projeto**
```bash
cd gerenciamento-de-produtos
```

**3. Compilar o projeto**
```bash
javac -d bin src/*.java src/**/*.java
```

**4. Executar a aplicação**
```bash
java -cp bin App
```

---

## Como utilizar

Ao iniciar o programa, o seguinte menu será exibido:
```
|1 adicionar |2 remover |3 pesquisar |4 ver todos |5 editar produto |6 sair
```

Digite o número da operação desejada e siga as instruções exibidas no terminal.

### Menu de edição

Ao escolher a opção **editar produto**, será exibido um submenu:
```
|1 mudar nome |2 mudar quantidade |3 mudar valor |4 voltar
```

---

## Dados iniciais

O sistema inicia com dois produtos cadastrados para demonstração:

| ID   | Nome   | Quantidade | Preço   |
|------|--------|------------|---------|
| ID_1 | Arroz  | 20         | R$30,44 |
| ID_2 | Feijão | 10         | R$10,00 |

---

## Objetivo do projeto

Este projeto foi desenvolvido com fins educacionais para praticar:

- organização de projetos Java
- programação orientada a objetos
- separação de responsabilidades
- manipulação de coleções
- desenvolvimento de aplicações em terminal
