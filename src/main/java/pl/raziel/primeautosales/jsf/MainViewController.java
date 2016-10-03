/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.raziel.primeautosales.jsf;

import java.util.ArrayList;
import java.util.List;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import org.primefaces.event.ResizeEvent;
import pl.raziel.primeautosales.models.Car;

/**
 *
 * @author RazieL
 */
@Named(value = "mainViewController")
@RequestScoped
public class MainViewController {

    private String selectionType;
    private List<Car> automobiles = new ArrayList<>();

    /**
     * Creates a new instance of MainViewController
     */
    public MainViewController() {
    }

    public void layoutResizeEvent(ResizeEvent event) {
        System.out.println("To gówno zmienia rozmiar: " + event.getComponent());
    }

    public String navigateToCar() {
        selectionType = "CAR";
        return "automobile";
    }

    public String navigateToPickup() {
        selectionType = "TRUCK";
        return "automobile";
    }

    public String navigateToSuv() {
        selectionType = "SUV";
        return "automobile";
    }

    public String getSelectionType() {
        return selectionType;
    }

    public void setSelectionType(String selectionType) {
        this.selectionType = selectionType;
    }

    public List<Car> getAutomobiles() {
        Car car1 = new Car();
        car1.setMake("Juneau");
        car1.setModel("Turbo");
        Car car2 = new Car();
        car2.setMake("Juneau");
        car2.setModel("Rocket");
        Car car3 = new Car();
        car3.setMake("Acme");
        car3.setModel("Jet");
        automobiles = new ArrayList();
        automobiles.add(car1);
        automobiles.add(car2);
        automobiles.add(car3);
        return automobiles;
    }

    public void setAutomobiles(List<Car> automobiles) {
        this.automobiles = automobiles;
    }
}
