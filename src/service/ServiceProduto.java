package service;
import java.util.HashMap;
import model.Produto;
import repository.RepositoryProduto;
import ui.Menu;

public class ServiceProduto {
    private RepositoryProduto repository;
    public ServiceProduto() {
        this.repository = new RepositoryProduto();
    }
    public HashMap<String, Produto> listarProdutos() {return repository.getMap();}
    public boolean produtoExiste(String nome) {
        return repository.produtoExiste(nome);
    }
    public boolean servicePesquisaID(String chave) {
        return repository.pesquisaID(chave);
    }
    public void novoProduto(String nome, int quantidade, double valor) {
        repository.addProduto(repository.setID(), new Produto(nome, quantidade, valor));
    }
    public boolean removeProduto(String chave) {
        if(repository.pesquisaID(chave)) {
            repository.removeProduto(chave);
            return true;
        }
        return false;
    }
    public boolean mudarNome(String nome, String novoNome, Produto produto) {
        if(produtoExiste(nome)) {
            try {
                repository.mudarNome(novoNome, produto);
                return true;
            } catch (Exception e) {
                Menu.msgln("Erro inesperado: " + e.getMessage());
            }
        }
        return false;
    }
    public boolean mudarQuantidade(int novaQuantidade, Produto produto) {
        try {
            repository.mudarQuantidade(novaQuantidade, produto);
            return true;    
        } catch (Exception e) {
            Menu.msgln("\nErro inesperado: " + e.getMessage());
        }
        return false;
    }
    public boolean mudarValor(double novoValor, Produto produto) {
        try{
            repository.mudarValor(novoValor, produto);
            return true;
        } catch (Exception e) {
            Menu.msgln("\nErro inesperado: " + e.getMessage());
        }
        return false;
    }
    public Produto getProduto(String nome) {
        if(repository.produtoExiste(nome)) {
            return repository.getProdutoNome(nome);
        }
        return null;
    }
}