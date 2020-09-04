/**
 *
 * @author Stéfanie e Ariana
 */
package services;

import DAO.dao;
import DAO.produtoDAO;
import java.sql.SQLException;
import java.util.ArrayList;
import model.produto;

public class Produtos {
     public void cadastrarProduto(produto pVO) throws SQLException {
        produtoDAO pDAO = dao.getProduto();
        pDAO.cadastrarProduto(pVO);
    }
    public ArrayList<produto> buscarProdutos() throws SQLException {
        produtoDAO pDAO = dao.getProduto();
        return pDAO.buscarProdutos();
    }
}
