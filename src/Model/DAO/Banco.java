/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.DAO;

import Model.Agendamento;
import Model.Medico;
import Model.Paciente;
import Model.Consulta;
import Model.Administrador;
import java.text.ParseException;
import java.util.ArrayList;

/**
 *
 * @author tiago
 */
public class Banco {
    
    public static ArrayList<Administrador> administrador;
    public static ArrayList<Medico> medico;
    public static ArrayList<Paciente> paciente;
    public static ArrayList<Consulta> consulta;
    public static ArrayList<Agendamento> agendamento;
    
    
    public static void inicia() throws ParseException{
    
        //Instancia os Objetos
        medico = new ArrayList<>();
        administrador = new ArrayList<>();
        paciente = new ArrayList<>();
        consulta = new ArrayList<>();
        agendamento = new ArrayList<>();
        
        //criando elementos
        
        Administrador adm1 = new Administrador(1, "adm01", 'M', "18/07/1990", "30212121", "assistente01.novo@fmpsc.edu.br", "521454121","rua dos alfeneiros n1", 31, "adm01", "administrador");
        Administrador adm2 = new Administrador(2, "assistente02", 'M', "18/07/1990", "30212122", "assistente02.novo@fmpsc.edu.br", "521454122","rua dos alfeneiros n2", 32, "adm02", "administrador");
        Administrador adm3 = new Administrador(3, "assistente03", 'F', "18/07/1990", "30212123", "assistente03.novo@fmpsc.edu.br", "521454123","rua dos alfeneiros n3", 33, "adm03", "administrador");
        Administrador adm4 = new Administrador(4, "assistente04", 'F', "18/07/1990", "30212124", "assistente04.novo@fmpsc.edu.br", "521454124","rua dos alfeneiros n4", 34, "adm04", "administrador");
  
           
        Medico medico1 = new Medico(1, "Alan Figueiredo", 'M', "30/01/1995", "30212126", "rafael.novo@fmpsc.edu.br", "5142487", "Rua jaboti 35 Canudos NH", 45, "233011241", "Segunda há sexta das 10:30 até as 17h30", "Cirurgião geral", "rafael123", "medico");
        Medico medico2 = new Medico(2, "Judite Oliveira", 'F', "30/08/1994", "30212127", "jefferson.silva@aluno.fmpsc.edu.br", "5142487745", "Rua campo bom 78 Centro NH", 62, "233011242", "Segunda-sexta das 10:30 as 17h30", "Clinico", "judite123", "medico");
        Medico medico3 = new Medico(3, "Paulo Ricado", 'M', "24/04/1997", "30212128", "pauloricardopet@gmail.com", "78451458", "Rua Tres Irmaos 30 Vila Nova - NH",  32, "933007496", "Segunda-sexta das 10:30 as 17h30", "Clinico", "paulo123", "medico");
        Medico medico4 = new Medico(4, "Neymar Santos", 'M', "20/08/1995", "30212130", "neymarsantospet@gmail.com", "2745487", "Rua Lombardi 40 Canudos NH",   34, "933007491", "Segunda-sexta das 10:30 as 17h30", "Clinico", "neymar123","medico");
        
        
        Paciente paciente1 = new Paciente(5, "Debruine Pipoqueiro", 'M', "13/09/1992", "30212131", "debruinepet@gmail.com", "4742487", "Rua pedro quaresma 784 Canudos Belgica", 24);
        Paciente paciente2 = new Paciente(6, "Matuidi Pareira", 'M', "17/08/1994", "302122324", "matuidipet@gmail.com", "78512457", "Rua champions 10 Kephas Franca", 37);
        Paciente paciente3 = new Paciente(7, "Marta de Souza", 'F', "25/03/1993", "302121292", "martasouzapet@gmail.com", "4658237314", "Rua tesla 215 Canudos NH", 17);
        Paciente paciente4 = new Paciente(8, "Aline Ferrari", 'F', "04/03/1990", "302121451", "alineferraripet@gmail.com", "8475123687", "Rua hyrule 32 Canudos NH", 41);
       
        
        Consulta consulta1 = new Consulta(1, medico1, "Cardiologista", 180);
        Consulta consulta2 = new Consulta(2, medico2, "Cardiologista", 120);
        Consulta consulta3 = new Consulta(3, medico3, "Ortopedista", 70);
        Consulta consulta4 = new Consulta(4, medico4, "Dermatologista", 90);

        Agendamento agendamento1 = new Agendamento(0, paciente1, consulta1, 125.0f, "28/11/2023 14:10", "cliente vai atrasar");
        Agendamento agendamento2 = new Agendamento(1, paciente2, consulta2, 50.0f, "28/11/2023 15:30", "cliente vai atrasar");
        Agendamento agendamento3 = new Agendamento(2, paciente3, consulta3, 3.20f, "28/11/2023 16:20", "cliente vai atrasar");

     
        //Adiciona Elementos na lista
        administrador.add(adm1);
        administrador.add(adm2);
        administrador.add(adm3);
        administrador.add(adm4);
        
        medico.add(medico1);
        medico.add(medico2);
        medico.add(medico3);
        medico.add(medico4);
        
        paciente.add(paciente1);
        paciente.add(paciente2);
        paciente.add(paciente3);
        paciente.add(paciente4);

        
        consulta.add(consulta1);
        consulta.add(consulta2);
        consulta.add(consulta3);
        consulta.add(consulta4);

        
        agendamento.add(agendamento1);
        agendamento.add(agendamento2);
        agendamento.add(agendamento3);
        
    }
    
    
}
