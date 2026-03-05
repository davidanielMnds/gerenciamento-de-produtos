import java.util.HashMap;
import java.util.Scanner;
import model.Produto;
import service.ServiceProduto;
import ui.Menu;
import ui.MenuProdutos;
import util.InputHelper;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in, "UTF-8").useLocale(java.util.Locale.US);
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

                    case 5:
                        menuEditar(sc, service);
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

    public static void menuEditar(Scanner sc, ServiceProduto service) {
        String nome=null;
        int escolhaEdit = 0;
        while (escolhaEdit !=4) {
            try {
                MenuProdutos.getDados(service.listarProdutos());
                escolhaEdit = InputHelper.setInt(sc, Menu.getEditarMenu());

                switch (escolhaEdit) {
    //MUDAR NOME
                    case 1:
                        nome = InputHelper.setString(sc, "Digite o nome do produto: ");
                        if (service.produtoExiste(nome)) {
                            String mudarNome = InputHelper.setString(sc, "Digite o novo nome: ");
                            Produto produtoNome = service.getProduto(nome);
                            if(produtoNome!=null) {
                                if(service.mudarNome(nome, mudarNome,  produtoNome)) {
                                    Menu.msgln("Nome de produto mudado para: " + produtoNome.getNome());
                                    continue;
                                }
                            }
                        }
                        Menu.msgln("O produto não foi encontrado");
                    break;
    //MUDAR QUANTIDADE
                    case 2:
                        nome = InputHelper.setString(sc, "Digite o nome do produto: ");
                        Produto produtoQuantidade = service.getProduto(nome);
                        if (produtoQuantidade!=null) {
                            int novaQuantidade = InputHelper.setInt(sc, "Digite a nova quantidade: ");
                            if(service.mudarQuantidade(novaQuantidade, produtoQuantidade)) {
                                Menu.msgln("A quantidade do produto foi atualizada para: " + produtoQuantidade.getQuantidade());
                                continue;
                            }
                            
                        }
                        Menu.msgln("Produto não encontrado.");
                    break;
    //MUDAR VALOR   
                    case 3:
                        nome = InputHelper.setString(sc, "Digite o nome do produto: ");
                        Produto produtoValor = service.getProduto(nome);
                        if (produtoValor!=null) {
                            double novoValor = InputHelper.setDouble(sc, "Digite o novo valor: ");
                            if(service.mudarValor(novoValor, produtoValor)) {
                                Menu.msgln("O valor do produto foi atualizada para: " + produtoValor.getValor());
                                continue;
                            }
                        }
                        Menu.msgln("Produto não encontrado.");
                    break;
                }
            } catch (Exception e) {
                Menu.msgln("Erro inesperado: " + e.getMessage());
            }
        }
    }
}
