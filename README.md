# Gerenciamento de Produtos

Sistema de gerenciamento de estoque via terminal desenvolvido em Java. Permite cadastrar, remover, pesquisar, listar e editar produtos em memória.

---

## Funcionalidades

- **Adicionar produto** — cadastra um novo produto com nome, quantidade e preço
- **Remover produto** — remove um produto pelo ID
- **Pesquisar produto** — busca e exibe as informações de um produto pelo ID
- **Listar todos** — exibe todos os produtos cadastrados
- **Editar produto** — permite alterar nome, quantidade ou preço de um produto existente

---

## Estrutura do Projeto
```
src/
├── App.java                      # Ponto de entrada e menus de navegação
├── model/
│   └── Produto.java              # Modelo de dados do produto
├── repository/
│   └── RepositoryProduto.java    # Acesso e manipulação dos dados em memória
├── service/
│   └── ServiceProduto.java       # Regras de negócio
├── ui/
│   ├── Menu.java                 # Textos dos menus
│   └── MenuProdutos.java         # Exibição dos dados dos produtos
└── util/
    └── InputHelper.java          # Validação e leitura de entradas do usuário
```

---

## Pré-requisitos

- Java JDK 11 ou superior

---

## Como executar

1. Clone o repositório:
```bash
git clone https://github.com/davidanielMnds/gerenciamento-de-produtos.git
```

2. Acesse a pasta do projeto:
```bash
cd gerenciamento-de-produtos
```

3. Compile os arquivos:
```bash
javac -d bin src/*.java src/**/*.java
```

4. Execute o programa:
```bash
java -cp bin App
```

---

## Como usar

Ao iniciar, o menu principal será exibido:
```
|1 adicionar |2 remover |3 pesquisar |4 ver todos |5 editar produto |6 sair
```

Para editar um produto, escolha a opção **5**. Um submenu será exibido com os produtos disponíveis:
```
|1 mudar nome |2 mudar quantidade |3 mudar valor |4 voltar
```

---

## Dados iniciais

O sistema é iniciado com dois produtos pré-cadastrados:

| ID   | Nome   | Quantidade | Preço   |
|------|--------|------------|---------|
| ID_1 | Arroz  | 20         | R$30,44 |
| ID_2 | Feijão | 10         | R$10,00 |

---

## Tecnologias

- Java
- Estrutura em camadas: Model / Repository / Service / UI
