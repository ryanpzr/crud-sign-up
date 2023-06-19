
package controller;

import DAO.AlunoDAO;
import DAO.FuncionarioDAO;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Aluno;
import model.Funcionario;
import view.RegistrarAlunos;
import view.TelaPrincipal;

public class ControllerRegistrosFuncionarios {
    
    TelaPrincipal view;

    public ControllerRegistrosFuncionarios(TelaPrincipal view) {
        this.view = view;
    }
    
    public void registrarFuncionario() {
        
        String nome = view.getF_nome().getText();
        String funcao = view.getF_funcao().getText();
        int matricula = Integer.parseInt(view.getF_matricula().getText());
        int salario = Integer.parseInt(view.getF_salario().getText());

        Funcionario funcionario = new Funcionario(nome, funcao, matricula, salario);

        try {
            Connection conexao = new FuncionarioDAO().getConexao();
            FuncionarioDAO funcionariodao = new FuncionarioDAO(conexao);
            funcionariodao.insertFuncionarioBD(funcionario);
            JOptionPane.showMessageDialog(null, "FUNCIONÁRIO CADASTRADO COM SUCESSO!");
            view.limparCamps();

        } catch (SQLException ex) {
            Logger.getLogger(RegistrarAlunos.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar o usuario" + ex);
        }
    }
    
    
}
