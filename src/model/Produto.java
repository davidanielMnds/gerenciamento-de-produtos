package model;
public class Produto {
    private String nome;
    private int quantidade;
    private double valor;
    public Produto(String nome, int quantidade, double valor) {
        this.nome=nome;
        this.quantidade=quantidade;
        this.valor=valor;
    }
    //gets
    public String getNome() { return nome;}
    public int getQuantidade() { return quantidade;}
    public double getValor() { return valor;}
    //sets
    public void setNome(String setNome) {nome=setNome;}
    public void setQuantidade(int setQuantidade) {quantidade=setQuantidade;}
    public void setValor(double setValor) {valor=setValor;}

}
