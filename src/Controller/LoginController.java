package Controller;


import Controller.Helper.LoginHelper;
import Model.Administrador;
import Model.DAO.AdministradorDAO;
import View.Login;
import View.MenuPrincipal;

public class LoginController {

    private final Login view;
    private final LoginHelper helper;

    public LoginController(Login view) {
        this.view = view;
        this.helper = new LoginHelper(view);
    }
    
    public void fizTarefa(){
        System.out.println("Busque algo no banco de dados");
        this.view.exibeMensagem("Execultei o fiz tarefa");
    }
    
    public void entraNoSistema(){
        Administrador adm = helper.obterModelo();
        
        AdministradorDAO AdministradorDAO = new AdministradorDAO();
        Administrador admAutenticado = AdministradorDAO.selectPorNomeESenha(adm);
        
        if(admAutenticado != null){
            MenuPrincipal menu = new MenuPrincipal();
            menu.setVisible(true);
            this.view.dispose();
        }else{
            view.exibeMensagem("Usuario ou senha está incorreto");
        }
    }
    
}
