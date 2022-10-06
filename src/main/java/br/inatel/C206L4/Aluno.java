package br.inatel.C206L4;

public class Aluno extends Usuario {

    private int matricula;
    private String curso;
    // Adicionei este atributo por minha conta, senão não faria sentido o método publicarNota da classe professor
    private int nota;

    public int getNota() {
        return nota;
    }
    public void setNota(int nota) {
        this.nota = nota;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
