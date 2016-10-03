/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.raziel.primeautosales.jsf;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import org.primefaces.event.ResizeEvent;

/**
 *
 * @author RazieL
 */
@Named(value = "mainViewController")
@RequestScoped
public class MainViewController {

    /**
     * Creates a new instance of MainViewController
     */
    public MainViewController() {
    }
    
    public void layoutResizeEvent(ResizeEvent event){
        System.out.println("To gówno zmienia rozmiar: " + event.getComponent());
    }
}
