package util;
import java.util.InputMismatchException;
import java.util.Scanner;
import ui.Menu;

public class InputHelper {
    public static int setInt(Scanner sc, String txt) {
        while(true) {
            try {
                Menu.msg(txt);    
                int numero = sc.nextInt();
                if (numero<0) {
                    Menu.msgln("Digite apenas números positivos.");
                    sc.nextLine();
                    continue;
                }
                sc.nextLine();
                return numero;
            } catch (InputMismatchException e) {
                Menu.msgln("Digite apenas números.");
                sc.nextLine();
                
            }
            catch(Exception p) {
                Menu.msgln("Erro inesperado: " + p.getMessage());
                sc.nextLine();
            }
        }
    }

    public static double setDouble(Scanner sc, String txt) {
        while(true) {
            try {
            Menu.msg(txt);
            double valor = sc.nextDouble();
            if (valor<0) { Menu.msgln("Digite um valor positivo."); continue;}
            sc.nextLine();
            return valor;    
            } 
            catch (InputMismatchException e) {
                Menu.msgln("Digite apenas números.");
                sc.nextLine();
            }
            catch (Exception p) {
                Menu.msgln("Erro inesperado: " + p.getMessage());
            }
        }
    }

    public static String setString(Scanner sc, String txt) {
        while (true) { 
            try {
                Menu.msg(txt);
                String linha = sc.nextLine();
                if (linha.isBlank()) {
                    Menu.msgln("Digite algo.");
                    continue;
                }
                else if(!linha.matches("^[a-zA-ZÀ-ÿ ]+$")) {
                    Menu.msgln("Digite apenas letras.");
                    continue;
                }
                return linha;
            } catch (Exception e) {
                Menu.msgln("Erro inesperado: " + e.getMessage());
            }
        }
    }

    public static String setChave(Scanner sc, String txt) {
        while(true) {
            try {
            Menu.msg(txt);
            String chave = sc.nextLine();
            if (chave.isBlank()) {
                Menu.msgln("Digite algo.");
                continue;
            }
            return chave;
            } catch (Exception e) {
                Menu.msgln("Erro inesperado: " + e.getMessage());
            }
        }
    }
}
