package ui;

public class Menu {
    public static void msg(String msg) {System.out.print(msg);}
    public static void msgln(String msg) { System.out.println(msg);}
    public static void msgf(String msg, Object args) { System.out.printf(msg, args);}

    public static String getMenu() {
        return("\n|1 adicionar |2 remover |3 pesquisar |4 ver todos |5 editar produto|6 sair" + "\nDigite: ");
    }
    public static String getEditarMenu() {
        return("\n|1 mudar nome |2 mudar quantidade |3 mudar valor |4 voltar");
    }
}
