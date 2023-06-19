package DAO;

import model.Aluno;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import DAO.ConexaoBD;
import java.sql.DriverManager;
import static java.sql.DriverManager.getConnection;
import view.GerenciarAlunos;

public class AlunoDAO {

    private Connection connection;

    public AlunoDAO(Connection conexao) {
        this.connection = conexao;
    }

    public AlunoDAO() {

    }

    public Connection getConexao() {        // Chama o método getConexao
        return new ConexaoBD().getConexao();
    }

    public int maiorID() throws SQLException {

        int maiorID = 0;
        try {
            Statement stmt = this.getConexao().createStatement();
            ResultSet res = stmt.executeQuery("SELECT MAX(id) id FROM tabelaaluno");
            res.next();
            maiorID = res.getInt("id");

            stmt.close();

        } catch (SQLException ex) {
        }

        return maiorID;
    }

    
    public static ArrayList<Aluno> MinhaLista = new ArrayList<Aluno>();

    public ArrayList getMinhaLista() {
        MinhaLista.clear();

        try {
            Statement stmt = this.getConexao().createStatement();
            ResultSet res = stmt.executeQuery("SELECT * FROM tabelaaluno");
            while (res.next()) {
                int id = res.getInt("id");
                String nome = res.getString("nome");
                String curso = res.getString("curso");
                int fase = res.getInt("fase");
                int idade = res.getInt("idade");

                Aluno objeto = new Aluno(id, nome, curso, fase, idade);
                MinhaLista.add(objeto);
            }

            stmt.close();

        } catch (SQLException erro) {
            // Trate a exceção apropriadamente
            erro.printStackTrace();
        }

        return MinhaLista;
    }
    

    public void insertBD(Aluno aluno) throws SQLException {

        String sql = "INSERT INTO tabelaaluno (nome, curso, fase, idade) VALUES ('" + aluno.getNome() + "', '" + aluno.getCurso() + "', '" + aluno.getFase() + "', '" + aluno.getIdade() + "'); ";
        //String sql = "INSERT INTO tabelaal (nome, curso) VALUES ('"+aluno1.getNome() +"', '"+aluno1.getCurso()+"'); ";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.execute();
        connection.close();

    }

    public boolean DeleteAlunoBD(int id) {

        try {
            Statement stmt = this.getConexao().createStatement();
            stmt.executeUpdate("DELETE FROM tabelaaluno WHERE id = " + id);
            stmt.close();

        } catch (SQLException erro) {
        }
        return false;
    }

    public boolean UpdateAlunoBD(Aluno objeto) {
        
        String sql = "UPDATE tabelaaluno SET nome = ?, idade = ?, curso = ?, fase = ? WHERE id = ?";

        try {
            PreparedStatement stmt = this.getConexao().prepareStatement(sql);

            stmt.setString(1, objeto.getNome());
            stmt.setInt(2, objeto.getIdade());
            stmt.setString(3, objeto.getCurso());
            stmt.setInt(4, objeto.getFase());
            stmt.setInt(5, objeto.getId());

            stmt.executeUpdate();
            stmt.close();

            return true;

        } catch (SQLException erro) {
            throw new RuntimeException(erro);
        }
    }
}
