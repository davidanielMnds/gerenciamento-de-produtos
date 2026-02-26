package service;
import java.util.HashMap;
import model.Produto;
import repository.RepositoryProduto;

public class ServiceProduto {
    private RepositoryProduto repository;
    public ServiceProduto() {
        this.repository = new RepositoryProduto();
    }
//get
    public HashMap<String, Produto> listarProdutos() {return repository.getMap();}
    
//Produto Existe
    public boolean produtoExiste(String nome) {
        return repository.produtoExiste(nome);
    }
//pesquisa por id
    public boolean servicePesquisaID(String chave) {
        return repository.pesquisaID(chave);
    }

//Novo produto
    public void novoProduto(String nome, int quantidade, double valor) {
        repository.addProduto(repository.setID(), new Produto(nome, quantidade, valor));
    }
//Excluir produto
    public boolean removeProduto(String chave) {
        if(repository.pesquisaID(chave)) {
            repository.removeProduto(chave);
            return true;
        }
        return false;
    }
//Mudar nome do produto
    public boolean mudarNome(String novoNome, Produto produto) {
        if(produtoExiste(novoNome)) {
            try {
                repository.mudarNome(novoNome, produto);
                return true;
            } catch (Exception e) {
                System.out.println("Erro inesperado: " + e.getMessage());
            }
        }
        return false;
    }
//Mudar quantidade do produto
    public boolean mudarQuantidade(int novaQuantidade, Produto produto) {
        try {
            repository.mudarQuantidade(novaQuantidade, produto);
            return true;    
        } catch (Exception e) {
            System.out.println("\nErro inesperado: " + e.getMessage());
        }
        return false;
        
    }
//Mudar valor do produto
    public boolean mudarValor(double novoValor, Produto produto) {
        try{
            repository.mudarValor(novoValor, produto);
            return true;
        } catch (Exception e) {
            System.out.println("\nErro inesperado: " + e.getMessage());
        }
        return false;
    }
}
