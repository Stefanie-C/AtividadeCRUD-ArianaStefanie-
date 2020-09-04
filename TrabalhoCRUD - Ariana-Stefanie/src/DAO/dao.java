/**
 *
 * @author Stéfanie e Ariana
 */

package DAO;

public class dao {
    private static produtoDAO produto = new produtoDAO ();

    public static produtoDAO getProduto() {
        return produto;
    }
     
}
