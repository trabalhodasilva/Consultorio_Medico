package Controller;

import Controller.Helper.AgendaHelper;
import Model.Agendamento;
import Model.Consulta;
import Model.DAO.AgendaDAO;
import Model.DAO.ConsultaDAO;
import Model.DAO.PacienteDAO;
import Model.Medico;
import Model.Paciente;
import java.util.ArrayList;
import View.Agenda;

public class AgendaController {
   
    private final Agenda view; 
    private final AgendaHelper helper;

    //construtor de agendacontoller
    public AgendaController(Agenda view) {
        this.view = view;
        this.helper = new AgendaHelper(view);
    }
    
    public void atualizaTabela(){
        AgendaDAO agendaDAO = new AgendaDAO(); //criando variavel para retornar para usar os metodos de agendaDAO
        ArrayList<Model.Agendamento> agendamentos = agendaDAO.selectAll(); //usando o metodo selectAll para pegar todos os dados do banco e jogar na variavel arraylist agendamentos
    
        helper.preencherTabela(agendamentos);
    }

    
    public void atualizaPaciente(){
        PacienteDAO pacienteDAO = new PacienteDAO();
        ArrayList<Paciente> pacientes = pacienteDAO.selectAll();
        
        helper.preencherPacientes(pacientes);
    }
    
    public void atualizaMedico(){
        ConsultaDAO consultaDAO = new ConsultaDAO();
        ArrayList<Consulta> medicos = consultaDAO.selectAll();
        
        helper.preencherMedicos(medicos);
    }
    
    
    public void atualizaValor(){
        Consulta consulta = helper.obterConsulta();
        helper.serValor(consulta.getValor());
    }
    
    public void agendar(){
        //Buscar Objeto Agendamento da tela
        Agendamento agendamento = helper.obterModelo();
        System.out.println("Agendamento: " + agendamento);
        
        //salvar objeto no banco de dados
        try {
            new AgendaDAO().insert(agendamento);
        } catch (Exception e) {
            e.printStackTrace(); // Mostra erro no console
        }
        
        //inserir elemento na tabela
        atualizaTabela();
        helper.limparTela();
        
        
    }
    
}
