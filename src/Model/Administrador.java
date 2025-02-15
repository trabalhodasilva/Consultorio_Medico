/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.Date;

public class Administrador extends Pessoa{
    
    private String acesso;
    private String senha;
    
    public Administrador(int id, String nome, char sexo, String dataNascimento, String telefone, String email, String RG, String endereco, int idade, String senha, String acesso) {
        super(id, nome, sexo, dataNascimento, telefone, email, RG, endereco, idade);
        this.senha = senha;
        this.acesso = acesso;
    }

    public Administrador(int id, String nome, char sexo, String telefone, String endereco, String acesso) {
        super(id, nome, sexo, telefone, endereco);
        this.acesso = acesso;
    }

    public Administrador(int id, String senha, String nome) {
        super(id, nome);
        this.senha = senha;
    }
    public String getNivelAcesso() {
        return acesso;
    }

    public void setNivelAcesso(String nivelAcesso) {
        this.acesso = nivelAcesso;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    
}
