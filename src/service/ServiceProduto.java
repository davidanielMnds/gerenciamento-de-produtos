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
    

}
