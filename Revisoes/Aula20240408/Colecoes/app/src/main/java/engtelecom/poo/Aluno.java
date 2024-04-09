package engtelecom.poo;

import org.w3c.dom.ls.LSOutput;

import javax.swing.*;
import java.time.LocalDate;

public class Aluno {


    // Atributos
    private String nome;
    private String matricula;
    private String curso;
    // Ativo, cencelado, trancado
    private String situacao;
    private String email;
    private LocalDate dataNsscimento;
    private String cpf;

    public Aluno(String nome, String matricula, String curso, String email, LocalDate dataNsscimento, String cpf) {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
        this.situacao = "Ativo";
        this.email = email;
        this.dataNsscimento = dataNsscimento;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDataNsscimento() {
        return dataNsscimento;
    }

    public void setDataNsscimento(LocalDate dataNsscimento) {
        this.dataNsscimento = dataNsscimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", matricula='" + matricula + '\'' +
                ", curso='" + curso + '\'' +
                ", situacao='" + situacao + '\'' +
                ", email='" + email + '\'' +
                ", dataNsscimento=" + dataNsscimento +
                ", cpf='" + cpf + '\'' +
                '}';
    }
}
