
package Model;

import java.util.Date;

public class Medico extends Pessoa{
   
    protected String CRM;
    protected String disponibilidadeHorario;
    protected String especialidade; // (TEM QUE SER UMA LISTA) ESPECIALIDADE DEVE SER COMPOSIÇÃO? , O MEDICO VAI TER MAIS DE UMA ESPECIALIDADE?
    protected String senha;
    protected String acesso;
    
    public Medico(int id, String nome, char sexo, String dataNascimento, String telefone, String email, String RG, String endereco, int idade, String crm, String disponibilidade, String especialidade, String senha, String acesso) {
        super(id, nome, sexo, dataNascimento, telefone, email, RG, endereco, idade);
        this.CRM = crm;
        this.disponibilidadeHorario = disponibilidade;
        this.especialidade = especialidade;
        this.senha = senha;
        this.acesso = acesso;
    }

    public Medico(int id, String nome, char sexo, String telefone, String endereco, String CRM, String disponibilidadeHorario, String especialidade) {
        super(id, nome, sexo, telefone, endereco);
        this.CRM = CRM;
        this.disponibilidadeHorario = disponibilidadeHorario;
        this.especialidade = especialidade;
    }

    public String getCRM() {
        return CRM;
    }

    public void setCRM(String CRM) {
        this.CRM = CRM;
    }

    public String getDisponibilidadeHorario() {
        return disponibilidadeHorario;
    }

    public void setDisponibilidadeHorario(String disponibilidadeHorario) {
        this.disponibilidadeHorario = disponibilidadeHorario;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getAcesso() {
        return acesso;
    }

    public void setAcesso(String acesso) {
        this.acesso = acesso;
    }
        
    @Override
    public String toString() {
        return this.nome;
    }
    
}
