package ui;
import java.util.HashMap;
import java.util.Map;
import model.Produto;

public class MenuProdutos {

    public static void getDados(HashMap<String, Produto> map) {
        for(Map.Entry<String, Produto> entrada : map.entrySet()) {
            Menu.msgln("____________________");
            Menu.msgln("Chave: " + entrada.getKey());
            Menu.msgln("Nome: " + entrada.getValue().getNome());
            Menu.msgln("Quantidade: " + entrada.getValue().getQuantidade());
            Menu.msgf("Preço: %.2f%n", entrada.getValue().getValor());

        }
    }
    public static void getInfo(HashMap<String, Produto> map, String chave) {
        Menu.msgln("____________________");
        Menu.msgln("Chave: " + chave);
        Menu.msgln("Nome: " + map.get(chave).getNome());
        Menu.msgln("Quantidade: " + map.get(chave).getQuantidade());
        Menu.msgf("Preço: %.2f%n", map.get(chave).getValor());
    }
}
