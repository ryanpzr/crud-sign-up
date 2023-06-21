
package DAO;

import java.sql.*;
import java.util.ArrayList;
import model.Aluno;
import DAO.AlunoDAO;


public class ConexaoBD {

    public Connection getConexao() {
        Connection connection = null;
        
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_alunos", "root", "1234");
            System.out.println("Conexão bem sucedida");
            
        } catch(SQLException ex) {
            System.out.println("NÃO CONECTADO" + ex.getMessage());
        }
        return connection;
        
    }  
}
