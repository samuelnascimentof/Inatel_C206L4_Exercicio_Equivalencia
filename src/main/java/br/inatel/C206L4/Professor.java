package br.inatel.C206L4;

import java.util.Objects;

public class Professor extends Usuario implements Funcionario{

    public void publicarNota(Aluno aluno){
        System.out.println("Nota do aluno " + aluno.nome + ", matrícula " + aluno.getMatricula()
                + ", do curso de " + aluno.getCurso() + " = " + aluno.getNota());
    }

    @Override
    public boolean autenticar(String senha) {
        return Objects.equals(super.senha, senha);
    }
}
