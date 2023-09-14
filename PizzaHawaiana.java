package edu.pizza.especialidades;

import edu.pizza.base.Pizza;
import edu.pizza.base.Topping;

public class PizzaHawaiana extends Pizza{
    public PizzaHawaiana(String name, Topping... toppings) {
        super(name, toppings);
    }
    private void toppings(String jamón, String piña, String queso) {
    }
    public void PizzaHawaiana() {
        toppings("Jamón", "Piña", "Queso");
    }

    @Override public String toString(){
        return "Pizza Hawaiana";
    }

}

