/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.DAO;

import Model.Paciente;
import java.util.ArrayList;

/**
 *
 * @author tiago
 */
public class PacienteDAO {
    
    
    /**
     * Insere um paciente dentro do banco de dados
     * @param paciente exige que seja passado um objeto do tipo paciente
     */
    public void insert(Paciente paciente){
        Banco.paciente.add(paciente);
    }
    
    /**
     * Atualiza um Objeto no banco de dados
     * @param paciente
     * @return 
     */
    public boolean update(Paciente paciente){
        
        for (int i = 0; i < Banco.paciente.size(); i++) {
            if(idSaoIguais(Banco.paciente.get(i),paciente)){
                Banco.paciente.set(i, paciente);
                return true;
            }
        }
        return false;      

    }
    
    /**
     * Deleta um objeto do banco de dados pelo id do paciente passado
     * @param paciente
     * @return 
     */
    public boolean delete(Paciente paciente){
        for (Paciente pacienteLista : Banco.paciente) {
            if(idSaoIguais(pacienteLista,paciente)){
                Banco.paciente.remove(pacienteLista);
                return true;
            }
        }
        return false;
    }
    
    /**
     * Retorna um arraylist com todos os pacientes do banco de dados
     * @return uma lista com todos os registros do banco
     */
    public ArrayList<Paciente> selectAll(){
        return Banco.paciente;
    }
    
    /**
     * Compara se dois objetos tem a propriedade id igual
     * @param paciente
     * @param pacienteAComparar
     * @return verdadeiro caso os id forem iguais e falso se nao forem
     */
    private boolean idSaoIguais(Paciente paciente, Paciente pacienteAComparar) {
        return paciente.getId() ==  pacienteAComparar.getId();
    }
    
    
    
}
