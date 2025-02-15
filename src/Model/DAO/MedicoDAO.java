/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.DAO;

import Model.Medico;
import java.util.ArrayList;

/**
 *
 * @author tiago
 */
public class MedicoDAO {
    
    /**
     * Insere um medico dentro do banco de dados
     * @param medico exige que seja passado um objeto do tipo medico
     */
    public void insert(Medico medico){
        Banco.medico.add(medico);
    }
    
    /**
     * Atualiza um Objeto no banco de dados
     * @param medico
     * @return 
     */
    public boolean update(Medico medico){
        
        for (int i = 0; i < Banco.medico.size(); i++) {
            if(idSaoIguais(Banco.medico.get(i),medico)){
                Banco.medico.set(i, medico);
                return true;
            }
        }
        return false;      

    }
    
    /**
     * Deleta um objeto do banco de dados pelo id do medico passado
     * @param medico
     * @return 
     */
    public boolean delete(Medico medico){
        for (Medico medicoLista : Banco.medico) {
            if(idSaoIguais(medicoLista,medico)){
                Banco.medico.remove(medicoLista);
                return true;
            }
        }
        return false;
    }
    
    /**
     * Retorna um arraylist com todos os medicos do banco de dados
     * @return uma lista com todos os registros do banco
     */
    public ArrayList<Medico> selectAll(){
        return Banco.medico;
    }
    
    /**
     * Retorna um Objeto do tipo medico se a funcao encontrar o medico passado como parâmetro no banco, para considerar sao usado nome e senha
     * @param medico
     * @return medico encontrado no banco de dados
     */
    public Medico selectPorNomeESenha(Medico medico){
        for (Medico medicoLista : Banco.medico) {
            if(nomeESenhaSaoIguais(medicoLista,medico)){
                return medicoLista;
            }
        }
        return null;
    }

    /**
     * Recebe dois objetos e verifica se são iguais verificando o nome e senha
     * @param medico
     * @param medicoAPesquisar
     * @return verdadeiro caso sejam iguais e falso caso nao forem iguais
     */
    private boolean nomeESenhaSaoIguais(Medico medico, Medico medicoAPesquisar) {
        return medico.getNome().equals(medicoAPesquisar.getNome()) && medico.getSenha().equals(medicoAPesquisar.getSenha());
    }

    /**
     * Compara se dois objetos tem a propriedade id igual
     * @param medico
     * @param medicoAComparar
     * @return verdadeiro caso os id forem iguais e falso se nao forem
     */
    private boolean idSaoIguais(Medico medico, Medico medicoAComparar) {
        return medico.getId() ==  medicoAComparar.getId();
    }
    
    
    
}
