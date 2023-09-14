package edu.pizza;


import edu.pizza.base.Pizza;
import edu.pizza.base.Topping;
import edu.pizza.especialidades.PizzaItaliana;
import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;

import edu.formularios.frmPizza;
import javax.swing.JInternalFrame;
import javax.swing.JFrame;



public class Main {
    private static JInternalFrame frase;

    public static void main(String[] args) {

        JFrame frame= new JFrame( "frmPizza");
        frame.setContentPane(new frmPizza().getjPanelPrincipal());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frase.pack();
        frame.setVisible(true);


        //ejercicio 1
        //Pizza pizza = new Pizza("Pizza Margherita", 200);
        //pizza.addTopping(new Topping("Champiñones"));
        //pizza.addTopping(new Topping("Mozzarella"));
        //pizza.addTopping(new Topping("Cebolla"));
        //pizza.addTopping(new Topping("Tomate"));
        //pizza.prepare();

        //quiten la mozarella
        //vuelvan a preparar
        //pizza.removeTopping(1);
        //pizza.prepare();










//        Ejercicio 2 heredar
//        Creamos una instancia de la clase PizzaItaliana y agregamos varios toppings
//        a ella utilizando
//        el método "agregar" de la clase Topping.
        //PizzaItaliana pizzaItaliana =
              //  new PizzaItaliana("Pizza Italiana", "Salsa de tomate", new Topping("Tomato"), new Topping("Mozzarella"), new Topping("Basil"));
        // pizzaItaliana.prepare();


//        Ejercicio 3
//        Topping pepperoni = new Topping("Pepperoni");
//        pepperoni.agregarIngrediente("queso");
//      pepperoni.agregarIngrediente("champiñones");
//        System.out.println(pepperoni); // Salida: Topping{nombre='Pepperoni', ingredientes=['queso']}


    }

}
