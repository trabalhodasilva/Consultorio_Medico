package Model;

public class Consulta {
   
    //valores padrão do video referencia 
    protected int id;
    protected String descricao;
    protected float valor;
    private Medico medico;
    
    //valores padrao do meu projeto
    
//    private String medico; //não sei se muda o tipo para medico ou fazar um array, não sei ainda
//    private String paciente;

    public Consulta(int id, Medico medico, String descricao, float valor) {
        this.id = id;
        this.medico = medico;
        this.descricao = descricao;
        this.valor = valor;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }


    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return this.medico.nome;
    }
    
    
}
