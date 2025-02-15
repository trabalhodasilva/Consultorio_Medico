/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.DAO;

import Model.Consulta;
import java.util.ArrayList;

/**
 *
 * @author tiago
 */
public class ConsultaDAO {
    
    
    /**
     * Insere um consulta dentro do banco de dados
     * @param consulta exige que seja passado um objeto do tipo consulta
     */
    public void insert(Consulta consulta){
        Banco.consulta.add(consulta);
    }
    
    /**
     * Atualiza um Objeto no banco de dados
     * @param consulta
     * @return 
     */
    public boolean update(Consulta consulta){
        
        for (int i = 0; i < Banco.consulta.size(); i++) {
            if(idSaoIguais(Banco.consulta.get(i),consulta)){
                Banco.consulta.set(i, consulta);
                return true;
            }
        }
        return false;      

    }
    
    /**
     * Deleta um objeto do banco de dados pelo id do consulta passado
     * @param consulta
     * @return 
     */
    public boolean delete(Consulta consulta){
        for (Consulta consultaLista : Banco.consulta) {
            if(idSaoIguais(consultaLista,consulta)){
                Banco.consulta.remove(consultaLista);
                return true;
            }
        }
        return false;
    }
    
    /**
     * Retorna um arraylist com todos os consultas do banco de dados
     * @return uma lista com todos os registros do banco
     */
    public ArrayList<Consulta> selectAll(){
        return Banco.consulta;
    }
    
    /**
     * Compara se dois objetos tem a propriedade id igual
     * @param consulta
     * @param consultaAComparar
     * @return verdadeiro caso os id forem iguais e falso se nao forem
     */
    private boolean idSaoIguais(Consulta consulta, Consulta consultaAComparar) {
        return consulta.getId() ==  consultaAComparar.getId();
    }
    
}
