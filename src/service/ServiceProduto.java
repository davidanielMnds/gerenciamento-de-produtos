package service;
import java.util.HashMap;
import model.Produto;
import ui.Menu;
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
        if (repository.produtoExiste(nome)) {
            Menu.msgln("Um produto com o mesmo nome já existe, tente outro.");
            return true;
        }
        return false;
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
    public void removeProduto(String chave) {
        if(repository.getMap().containsKey(chave)) {
            repository.removeProduto(chave);
            Menu.msgln("Produto removido com sucesso");
            return;
        }
        Menu.msgln("Não existe um produto com esta chave");
    }
    

}
