package controller;

import DAO.AlunoDAO;
import DAO.ConexaoBD;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Aluno;
import view.RegistrarAlunos;
import view.TelaPrincipal;

public class ControllerRegistrosAmigos {

    private TelaPrincipal view;

    public ControllerRegistrosAmigos(TelaPrincipal view) {
        this.view = view;
    }

    public void registrarAluno() {
        String nome = view.getC_nome().getText();
        String curso = view.getC_curso().getText();
        int fase = Integer.parseInt(view.getC_fase().getText());
        int idade = Integer.parseInt(view.getC_idade().getText());

        Aluno amigos = new Aluno(nome, curso, fase, idade);

        try {
            Connection conexao = new AlunoDAO().getConexao();
            AlunoDAO amigosdao = new AlunoDAO(conexao);
            amigosdao.insertBD(amigos);
            JOptionPane.showMessageDialog(null, "USUARIO CADASTRADO COM SUCESSO!");
            view.limparCamps();

        } catch (SQLException ex) {
            Logger.getLogger(RegistrarAlunos.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar o usuario" + ex);
        }
    }
}
