
package model;

public class Funcionario {
    
    private String nome; 
    private int matricula;
    private String funcao;
    private int salario;

    public Funcionario(String nome, String funcao, int matricula, int salario) {
        this.nome = nome;
        this.salario = salario;
        this.matricula = matricula;
        this.funcao = funcao;
    }
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }
    
    
    
}
