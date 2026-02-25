Sistema de Gerenciamento de Produtos
Sistema de gerenciamento de estoque via terminal desenvolvido em Java.

Funcionalidades:

Adicionar produtos com nome, quantidade e preço
Remover produtos por ID
Pesquisar produto por ID
Listar todos os produtos cadastrados
Validação de entradas do usuário (nomes duplicados, valores negativos, tipos inválidos)

Arquitetura:
O projeto segue uma arquitetura em camadas, separando responsabilidades:
src/
├── model/
│   └── Produto.java          # Entidade de dados
├── repository/
│   └── RepositoryProduto.java # Armazenamento e acesso aos dados
├── service/
│   └── ServiceProduto.java   # Regras de negócio
├── ui/
│   ├── Menu.java             # Utilitários de exibição
│   └── MenuProdutos.java     # Exibição dos produtos
├── util/
│   └── InputHelper.java      # Leitura e validação de entradas
└── App.java                  # Ponto de entrada

🚀 Como rodar
Pré-requisitos

Java 11 ou superior instalado

Compilar:
  cd src
  javac model/*.java repository/*.java service/*.java ui/*.java util/*.java App.java

Executar:
  java App
  
Como usar:

  Ao iniciar o programa, um menu será exibido:
  |1 adicionar |2 remover |3 pesquisar |4 ver todos |5 sair
  Digite:
Navegue pelas opções digitando o número correspondente.

Tecnologias:

Java (sem frameworks externos)
Estrutura de dados: HashMap
