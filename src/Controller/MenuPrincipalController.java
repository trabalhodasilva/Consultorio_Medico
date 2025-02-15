/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;


import View.Agenda;
import View.MenuPrincipal;
import java.text.ParseException;

/**
 *
 * @author iara4
 */
public class MenuPrincipalController {
    
    private final MenuPrincipal view;

    public MenuPrincipalController(MenuPrincipal view) {
        this.view = view;
    }
    
    
    public void navagarParaAgenda() throws ParseException{
        Agenda agenda = new Agenda();
        agenda.setVisible(true);
        this.view.dispose();
    }
}
