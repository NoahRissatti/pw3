package com.noahrissatti.projetopw3;

public class User {
    private String usuario;
    private String email;
    private String password;
    private String nomeCompleto;
    private String cpf;
    
    public User() {
    }

    public User(String usuario, String email, String password, String nomeCompleto, String cpf) {
        this.usuario = usuario;
        this.email = email;
        this.password = password;
        this.nomeCompleto = nomeCompleto;
        this.cpf = cpf;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    
}
