/**
 *
 * @author Stéfanie e Ariana
 */

package main;

import DAO.produtoDAO;
import java.util.Scanner;
import model.produto;


public class main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println(" ..CADASTRANDO PRODUTOS.. ");
        produto p1 = new produto (0,"TesteProduto",15.00, 50 );
        produtoDAO.insert(p1);
        System.out.println("Inserido! Novo id: " + p1.getid());
    }
    
}
