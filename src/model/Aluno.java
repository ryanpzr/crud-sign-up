/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package model;

import DAO.AlunoDAO;
import java.sql.SQLException;
import java.util.ArrayList;

public class Aluno {

    private int id;
    private String nome;
    private String curso;
    private int fase;
    private int idade;
    private final AlunoDAO dao;

    
    public Aluno() {
        this.dao = new AlunoDAO(); // Inicializando não importa em qual construtor
    }

    public Aluno(String nome, String curso) {
        this.nome = nome;
        this.curso = curso;
        this.dao = new AlunoDAO(); // Inicializando não importa em qual construtor
    }

    public Aluno(int id, String nome, String curso, int fase, int idade) {
        this.id = id;
        this.nome = nome;
        this.curso = curso;
        this.fase = fase;
        this.idade = idade;
        this.dao = new AlunoDAO(); // Inicializando não importa em qual construtor
    }

    public Aluno(String nome, String curso, int fase, int idade) {
        this.nome = nome;
        this.curso = curso;
        this.fase = fase;
        this.idade = idade;
        this.dao = new AlunoDAO(); // Inicializando não importa em qual construtor
    }

    public Aluno(String curso, int fase, int id, String nome, int idade) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.curso = curso;
        this.fase = fase;
        this.dao = new AlunoDAO(); // Inicializando não importa em qual construtor

    }
    
    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getFase() {
        return fase;
    }

    public void setFase(int fase) {
        this.fase = fase;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
     @Override
    public String toString() {
        return "\n ID: " + this.getId()
                + "\n Nome: " + this.getNome()
                + "\n Curso: " + this.getCurso()
                + "\n Fase: " + this.getFase()
                + "\n Idade:" + this.getIdade()
                + "\n -----------";
    }

    public ArrayList getMinhaLista() {
        return AlunoDAO.MinhaLista;
    }

    private int procuraIndice(int id) {
        int indice = -1;
        for (int i = 0; i < AlunoDAO.MinhaLista.size(); i++) {
            if (AlunoDAO.MinhaLista.get(i).getId() == id) {
                indice = i;
            }
        }
        return indice;
    }
    
    public int maiorID() throws SQLException {
        //public int maior ID() {
        //return AlunoDAO.maiorID():
        
        return dao.maiorID(); // Versão para BD
    }

    
    
}
