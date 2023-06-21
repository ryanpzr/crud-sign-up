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
import view.ConfirmacaoSeguranca;
import view.RegistrarAlunos;
import view.TelaPrincipal;

public class ControllerRegistrosFuncionarios {

    ConfirmacaoSeguranca confirmacao = ConfirmacaoSeguranca.getConfirmacaoseguranca();

    public ControllerRegistrosFuncionarios(ConfirmacaoSeguranca view) {
    }
    
    
    public void registrarFuncionario(TelaPrincipal view) {

        try {

            String senha = "1234";

            if (senha.equals(confirmacao.getSenhaSistema().getText())) {
                
                String nome = view.getF_nome().getText();
                String funcao = view.getF_funcao().getText();
                int matricula = Integer.parseInt(view.getF_matricula().getText());
                int salario = Integer.parseInt(view.getF_salario().getText());

                Funcionario funcionario = new Funcionario(nome, funcao, matricula, salario);

                Connection conexao = new FuncionarioDAO().getConexao();
                FuncionarioDAO funcionariodao = new FuncionarioDAO(conexao);
                funcionariodao.insertFuncionarioBD(funcionario);
                JOptionPane.showMessageDialog(null, "FUNCIONÁRIO CADASTRADO COM SUCESSO!");
                view.limparCamps();
                confirmacao.setVisible(false);

            } else {
                

            }
            
        } catch (SQLException ex) {
            Logger.getLogger(RegistrarAlunos.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar o usuario" + ex);
        }
    }
    
    
}
