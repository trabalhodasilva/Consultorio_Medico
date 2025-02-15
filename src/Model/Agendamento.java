package Model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Agendamento {
    
    private int id;
    private Paciente paciente;
    private Consulta medico;
    private float valor;
    private Date data;
    private String observacao;

    public Agendamento(int id, Paciente paciente, Consulta medico, float valor, String data) {
        this.id = id;
        this.paciente = paciente;
        this.medico = medico;
        this.valor = valor;
        try {
            this.data = new SimpleDateFormat("dd/MM/yyyy HH:mm").parse(data);
        } catch (ParseException ex) {
            Logger.getLogger(Agendamento.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public Agendamento(int id, Paciente paciente, Consulta medico, float valor, String data, String observacao) {
        this(id,paciente,medico,valor,data);
        this.observacao = observacao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Consulta getMedico() {
        return medico;
    }

    public void setMedico(Consulta medico) {
        this.medico = medico;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public Date getData() {
        return data;
    }
    
    public String getDataFormatada(){
        return new SimpleDateFormat("dd/MM/yyyy").format(data);
    }

    public String getHoraFormadata(){
        return new SimpleDateFormat("HH:mm").format(data);
    }
    public void setData(Date data) {
        this.data = data;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }
    
    
    
    
}
