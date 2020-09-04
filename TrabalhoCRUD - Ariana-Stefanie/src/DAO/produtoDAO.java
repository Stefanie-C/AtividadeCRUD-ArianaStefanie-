/**
 *
 * @author Stéfanie e Ariana
 */
package DAO;

import conexao.ConexaoBanco;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import model.produto;

public class produtoDAO {

    public static void insert(produto p1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void cadastrarProduto(produto pVO) throws SQLException {

        Connection con = ConexaoBanco.getConexao();
        Statement stat = con.createStatement();

        try {
            String sql;
            sql = "insert into produto(idproduto,nome,valorcusto,quantidade)"
                    + "values(null, '" + pVO.getNome() + "', " + pVO.getValorCusto() + ", " + pVO.getQuantidade() + ")";
            stat.execute(sql);

        } catch (SQLException e) {
            throw new SQLException("Erro ao inserir produto!");
        } finally {
            con.close();
            stat.close();
        }
    }

    public ArrayList<produto> buscarProdutos() throws SQLException {

        Connection con = ConexaoBanco.getConexao();
        Statement stat = con.createStatement();

        try {
            String sql;          
            sql = "select * from produto";

            ResultSet rs = stat.executeQuery(sql);

            ArrayList<produto> prod = new ArrayList<>();

            while (rs.next()) {
                produto p = new produto();
                p.setidproduto(rs.getLong("idproduto"));
                p.setNome(rs.getString("nome"));
                p.setValorCusto(rs.getDouble("valorcusto"));
                p.setQuantidade(rs.getInt("quantidade"));

                prod.add(p);
            }
            return prod;

        } catch (SQLException e) {
            throw new SQLException("Erro ao buscar produtos! " + e.getMessage());
        } finally {
            con.close();
            stat.close();
        }
    }

    public void deletar(produto produto) throws SQLException {
        Connection con = ConexaoBanco.getConexao();

        PreparedStatement p = con.prepareStatement("delete from produto where idproduto = ?");
        p.setLong(1, produto.getidproduto());
        p.execute();
        p.close();
    }

    public void alterar(produto produto) throws SQLException {

        Connection con = ConexaoBanco.getConexao();
        PreparedStatement p = con.prepareStatement("update produto set nome=?,valorcusto=?,quantidade=? where idproduto=?");

        p.setString(1, produto.getNome());
        p.setDouble(2, produto.getValorCusto());
        p.setInt(3, produto.getQuantidade());
        p.setLong(4, produto.getidproduto());

        p.execute();
        p.close();

    }
}
