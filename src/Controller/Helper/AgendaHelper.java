/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller.Helper;
import View.Agenda;
import Model.Agendamento;
import Model.Consulta;
import Model.Paciente;
import static java.lang.Integer.parseInt;

import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author iara4
 */
public class AgendaHelper implements IHelper{
    
    private final Agenda view;

    public AgendaHelper(Agenda view) {
        this.view = view;
    }

    public void preencherTabela(ArrayList<Model.Agendamento> agendamentos) {
     DefaultTableModel tableModel = (DefaultTableModel) view.getjTableAgendamentos().getModel(); // aqui tá fazendo um get em agenda view, e pergando a tableAgendamentos pegando o modelo que essa fica, tipo(id,nome,modelo..) e convertentendo com o castin(DefaultTableModel) para o modelo DefaultTableModel, e salvando na variavel tableModel    
     tableModel.setRowCount(0); //setando a tabela com 0 linhas   
    for(Agendamento agendamento: agendamentos){
        
        tableModel.addRow(new Object[]{
            agendamento.getId(),
            agendamento.getMedico().getMedico().getNome(), // getMedico na model agendamento, e mais um get medico na model consulta, e um get nome na model medico
            agendamento.getPaciente().getNome(),
            agendamento.getValor(),
            agendamento.getDataFormatada(),
            agendamento.getHoraFormadata(),
            agendamento.getObservacao(),
        });
        
    }

    }

    public void preencherPacientes(ArrayList<Paciente> pacientes) {
       DefaultComboBoxModel comboBoxModel = (DefaultComboBoxModel) view.getjComboBoxPaciente().getModel();
       
        for (Paciente paciente : pacientes) {
            comboBoxModel.addElement(paciente);
        }
    }

    public void preencherMedicos(ArrayList<Consulta> medicos) {
        DefaultComboBoxModel comboBoxModel = (DefaultComboBoxModel) view.getjComboBoxMedico().getModel();
        for (Consulta medico : medicos) {
            comboBoxModel.addElement(medico);
        }
    }
    
    public Paciente obterPaciente() {
      return (Paciente) view.getjComboBoxPaciente().getSelectedItem();
    }

    public Consulta obterConsulta() {
      return (Consulta) view.getjComboBoxMedico().getSelectedItem();
    }

    public void serValor(float valor) {
        view.getjTextFieldValor().setText(valor+"");
    }

    @Override
    public Agendamento obterModelo() {
        String idString = view.getjTextFieldId().getText();
        int id = Integer.parseInt(idString);
        
        Paciente paciente = obterPaciente();
        Consulta consulta = obterConsulta();
        
        String valorString = view.getjTextFieldValor().getText();
        float valor = Float.parseFloat(valorString);
        
        String data = view.getjTextFieldData().getText();
        String hora = view.getjTextFieldHora().getText();
        String dataHora = data + " " + hora;
        
        String observacao = view.getjTextAreaObservacao().getText();
        
        Agendamento agendamento = new Agendamento(id,paciente, consulta, valor, dataHora, observacao);
        return agendamento;
    }

    @Override
    public void limparTela() {
       view.getjTextFieldId().setText("0");
       view.getjTextFieldData().setText("");
       view.getjTextFieldHora().setText("");
       view.getjTextAreaObservacao().setText("");
    }
    

    
    
    
}
