package Controller.Helper;

import Model.Administrador;
import View.Login;




public class LoginHelper implements IHelper {
    private final Login view;

    public LoginHelper(Login view) {
        this.view = view;
    }
// Nesse pacote pelo que eu entendi: Administrador se tranforma em uma composição adm ->(nome,idade,acesso...) para verificar entrada no sistema    
    public Administrador obterModelo(){
        String nome = view.getTextUsuario().getText();
        String senha = view.getTextSenha().getText();
        Administrador modelo =  new Administrador(0, senha, nome);
        return modelo;
    }
// e também vamos codastrar dados, vamos pegar da view com get tranforma em composição e jogar em algum (banco de dados mais não sei qual ainda)    
    public void setModelo(Administrador modelo){
        String nome = modelo.getNome();
        String senha = modelo.getSenha();
        
        view.getTextUsuario().setText(nome);
        view.getTextSenha().setText(senha);
    }
//  nesse vamos só limpar a view, todos esses metodos, trabalham para por ondem, para o controller e e controller manda também na view
    public void limparTela(){
        view.getTextUsuario().setText("");
        view.getTextSenha().setText("");
    }
    
}
