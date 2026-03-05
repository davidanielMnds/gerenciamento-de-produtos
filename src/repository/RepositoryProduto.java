package repository;
import java.util.HashMap;
import java.util.Map;
import model.Produto;

public class RepositoryProduto {
    private int ID;
    private final HashMap<String, Produto> map;

    public RepositoryProduto() {
        this.map = new HashMap<>();
        map.put("ID_1", new Produto("Arroz", 20, 30.44));
        map.put("ID_2", new Produto("Feijão", 10, 10.00));
        ID = map.size();
    }
    public HashMap<String, Produto> getMap() { return new HashMap<>(map);}
    public int getID() { return ID;}

    public boolean produtoExiste(String nome) {
        for (Map.Entry<String, Produto> entrada : map.entrySet()) {
            if(entrada.getValue().getNome().equalsIgnoreCase(nome)) {
                return true;
            }
        }
        return false;
    }
    public boolean pesquisaID(String chave) {
        return map.containsKey(chave);
    }
    public Produto getProdutoNome(String nome) {
        for(Map.Entry<String, Produto> entrada : map.entrySet()) {
            if(entrada.getValue().getNome().equalsIgnoreCase(nome)) {
                return entrada.getValue();
            }
        }
        return null;
    }
    public Produto getProdutoID(String chave) {
        return map.get(chave);
    }
    public String setID(){ ID+=1; return "ID_" + ID;}
    public void addProduto(String chave, Produto m) {
        map.put(chave, m);
    }
    public void removeProduto(String chave) {
        map.remove(chave);
    }
    public void mudarNome(String novoNome, Produto produto) {
        produto.setNome(novoNome);
    }
    public void mudarQuantidade(int novaQuantidade, Produto produto) {
        produto.setQuantidade(novaQuantidade);
    }
    public void mudarValor(double novoValor, Produto produto) {
        produto.setValor(novoValor);
    }
}