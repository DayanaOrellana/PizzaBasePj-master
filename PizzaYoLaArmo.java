package edu.pizza.especialidades;

import edu.pizza.base.Pizza;
import edu.pizza.base.Topping;
public class PizzaYoLaArmo extends Pizza {
    public PizzaYoLaArmo(String name, Topping... toppings) {
        super(name, toppings);
    }
    private void toppings(String jamón, String peperoni, String queso, String pimientos, String bacon, String cebolla, String champiñones, String aceitunas) {
    }
    public void PizzaYoLaArmo() {
        toppings("Jamón", "Peperoni", "Queso", "Pimientos verdes y rojos", "Bacon", "Cebolla", "Champiñones", "Aceitunas negras");
    }

    @Override public String toString(){
        return "Pizza Yo La Armo";
    }
}
