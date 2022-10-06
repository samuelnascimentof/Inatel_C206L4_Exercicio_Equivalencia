package br.inatel.C206L4;

import java.util.Objects;

public abstract class Usuario {

    protected String nome;
    protected String login;
    protected String senha;

    public void fazerLogin(String login, String senha){
        if(Objects.equals(this.login, login) && Objects.equals(this.senha, senha)){
            System.out.println("Login realizado com sucesso!");
        } else {
            System.out.println("Login ou senha inválidos!");
        }
    }

}
