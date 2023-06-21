package controller;

import DAO.AlunoDAO;
import DAO.ConexaoBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Aluno;
import view.GerenciarAlunos;
import view.RegistrarAlunos;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import view.Mensagens;
import view.TelaPrincipal;

public class ControllerGerenciarAlunos {

    private TelaPrincipal view;
    private AlunoDAO objaluno;
    private Aluno osalunos;

    public ControllerGerenciarAlunos(TelaPrincipal view) {
        this.view = view;
        this.objaluno = new AlunoDAO(); // carrega objaluno de aluno
        this.osalunos = new Aluno();
        this.carregaTabela();

    }

    public void apagarAluno() {

        try {
            // validando dados da interface gráfica.
            int id = 0;
            if (this.view.getG_tabela().getSelectedRow() == -1) {
                throw new MensagensController("Primeiro Selecione um Aluno para APAGAR");
            } else {
                id = Integer.parseInt(this.view.getG_tabela().getValueAt(this.view.getG_tabela().getSelectedRow(), 0).toString());
            }

            // retorna 0 -> primeiro botão | 1 -> segundo botão | 2 -> terceiro botão
            int resposta_usuario = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja APAGAR este Aluno ?");

            if (resposta_usuario == 0) {// clicou em SIM

                // envia os dados para o Aluno processar
                if (this.objaluno.DeleteAlunoBD(id)) {

                    // limpa os campos
                    this.view.getG_nome().setText("");
                    this.view.getG_idade().setText("");
                    this.view.getG_curso().setText("");
                    this.view.getG_fase().setText("");
                    JOptionPane.showMessageDialog(null, "Aluno Apagado com Sucesso!");

                }

            }

            System.out.println(this.objaluno.getMinhaLista().toString());

        } catch (MensagensController erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
        } finally {
            // atualiza a tabela.
            carregaTabela();
        }        // TODO add your handling code here:

    }

    public void alterarAluno() {

        String nome = view.getG_nome().getText();
        String curso = view.getG_curso().getText();
        int fase = Integer.parseInt(view.getG_fase().getText());
        int idade = Integer.parseInt(view.getG_idade().getText());

        Aluno amigos = new Aluno(nome, curso, fase, idade);

        try {
            int id = 0;

            if (view.getG_nome().getText().length() < 2) {
                throw new MensagensController("Nome deve ter no mínimo 2 caracteres");
            } else {
                nome = view.getG_nome().getText();
            }

            if (view.getG_idade().getText().isEmpty()) {
                throw new MensagensController("Idade deve ser um número e maior que zero.");
            } else {
                idade = Integer.parseInt(view.getG_idade().getText());
            }

            if (view.getG_curso().getText().length() < 2) {
                throw new MensagensController("Curso deve conter ao menos 2 caracteres.");
            } else {
                curso = view.getG_curso().getText();
            }

            if (view.getG_fase().getText().isEmpty()) {
                throw new MensagensController("Fase deve ser um número e maior que zero.");
            } else {
                fase = Integer.parseInt(view.getG_fase().getText());
            }

            if (view.getG_tabela().getSelectedRow() == -1) {
                throw new MensagensController("Primeiro selecione um aluno para alterar.");
            } else {
                id = Integer.parseInt(view.getG_tabela().getValueAt(view.getG_tabela().getSelectedRow(), 0).toString());
            }

            // Envie os dados para o Aluno processar
            Aluno objetos = new Aluno(curso, fase, id, nome, idade);

            if (objaluno.UpdateAlunoBD(objetos)) {
                // Limpa os campos
                view.getG_nome().setText("");
                view.getG_idade().setText("");
                view.getG_curso().setText("");
                view.getG_fase().setText("");
                JOptionPane.showMessageDialog(null, "Aluno Alterado com Sucesso!");
            } else {
                JOptionPane.showMessageDialog(null, "Falha ao atualizar o aluno.");
            }

            System.out.println(objaluno.getMinhaLista().toString());
        } catch (MensagensController erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
        } catch (NumberFormatException erro2) {
            JOptionPane.showMessageDialog(null, "Informe um número válido.");
        } finally {
            carregaTabela(); // Atualiza a tabela.
        }

    }

    public void carregaTabela() {

        DefaultTableModel modelo = (DefaultTableModel) this.view.getG_tabela().getModel();
        modelo.setNumRows(0);

        ArrayList<Aluno> Minhalista = new ArrayList<>();
        Minhalista = objaluno.getMinhaLista();

        for (Aluno a : Minhalista) {
            modelo.addRow(new Object[]{
                a.getId(),
                a.getNome(),
                a.getCurso(),
                a.getFase(),
                a.getIdade()
            });
        }
    }

}
