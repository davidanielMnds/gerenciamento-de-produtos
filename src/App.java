import java.util.Scanner;
import service.ServiceProduto;
import ui.Menu;
import ui.MenuProdutos;
import util.InputHelper;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in).useLocale(java.util.Locale.US);
        ServiceProduto service = new ServiceProduto();

        int escolha = 0;
        while (escolha != 6) {
            try {
                escolha = InputHelper.setInt(sc, Menu.getMenu());
                switch(escolha) {

                    case 1:
                        String nome = InputHelper.setString(sc, "Digite o nome: ");
                        if (service.produtoExiste(nome)) {
                            Menu.msgln("Um produto com o mesmo nome já existe, tente outro.");
                            continue;
                        }
                        int quantidade = InputHelper.setInt(sc, "Digite a quantidade disponível do item: ");
                        double valor = InputHelper.setDouble(sc, "Digite o preço do produto: ");
                        service.novoProduto(nome, quantidade, valor);
                        MenuProdutos.getDados(service.listarProdutos());
                    break;

                    case 2:
                        String chave = InputHelper.setChave(sc, "Digite o ID do produto: ");
                        if (service.removeProduto(chave)) {
                            Menu.msgln("Produto removido com sucesso");
                            continue;
                        }
                        Menu.msgln("O produto não foi encontrado.");
                    break;

                    case 3:
                        String pesquisa = InputHelper.setChave(sc, "Digite o ID a ser procurado: ");    
                        if (service.servicePesquisaID(pesquisa)) {
                            MenuProdutos.getInfo(service.listarProdutos(), pesquisa);
                            continue;
                        }
                        Menu.msgln("Não foi possível encontrar este produto.");
                    break;

                    case 4:
                        MenuProdutos.getDados(service.listarProdutos());
                    break;

                    case 6:
                        Menu.msgln("Saindo...");
                    break;

                    default: Menu.msgln("Digite uma escolha válida");

                }
            }
            catch(Exception e) {
                Menu.msgln("Erro inesperado: " + e.getMessage());
            }
        }
        sc.close();
    }
}
