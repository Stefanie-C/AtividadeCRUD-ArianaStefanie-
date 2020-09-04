/**
 *
 * @author Stéfanie e Ariana
 */

package model;

public class produto {
    
    private long idproduto;
    private String nome;
    private double valorCusto;
    private int quantidade;

    public produto() {
    }

    public produto(int i, String testeProduto, double d, int i0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public long getidproduto() {
        return idproduto;
    }

    public void setidproduto(long idProduto) {
        this.idproduto = idProduto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValorCusto() {
        return valorCusto;
    }

    public void setValorCusto(double valorCusto) {
        this.valorCusto = valorCusto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "Produto{" + "idProduto=" + idproduto + ", nome=" + nome + ", valorCusto=" + valorCusto + ", quantidade=" + quantidade + '}';
    }

    public String getid() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
