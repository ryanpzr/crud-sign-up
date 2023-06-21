
package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.Aluno;
import model.Funcionario;

public class FuncionarioDAO {
    
    private Connection connection;

    public FuncionarioDAO(Connection conexao) {
        this.connection = conexao;
    }

    public FuncionarioDAO() {
    }
    
    public Connection getConexao() {        // Chama o método getConexao
        return new ConexaoBD().getConexao();
    }
    
    public void insertFuncionarioBD(Funcionario funcionario) throws SQLException {

        String sql = "INSERT INTO tabelafuncionario (nome, funcao, matricula, salario) VALUES "
                + "('" + funcionario.getNome() + "', '" + funcionario.getFuncao()+ "', '" + funcionario.getMatricula()+ "', '" + funcionario.getSalario()+ "'); ";
        //String sql = "INSERT INTO tabelaal (nome, curso) VALUES ('"+aluno1.getNome() +"', '"+aluno1.getCurso()+"'); ";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.execute();
        connection.close();

    }
    
}
