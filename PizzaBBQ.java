package edu.pizza.especialidades;

import edu.pizza.base.Pizza;
import edu.pizza.base.Topping;
public class PizzaBBQ extends Pizza {

    public PizzaBBQ(String name, Topping... toppings) {
        super(name, toppings);
    }
    private void toppings(String carne, String bacon, String aceite, String queso) {
    }
    public void PizzaBBQ() {
        toppings("Carne", "Bacon", "Aceite de Oliva", "Queso");
    }

    @Override public String toString(){
        return "Pizza BBQ";
    }
}
