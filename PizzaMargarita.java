package edu.pizza.especialidades;

import edu.pizza.base.Pizza;
import edu.pizza.base.Topping;
public class PizzaMargarita extends Pizza {

    public PizzaMargarita(String name, Topping... topings){
        super(name, topings);
    }
    private void toppings(String albahaca, String aceitedeoliva, String queso) {
    }
    public void PizzaMargarita(){
        toppings("Albahaca", "Aceite de Oliva", "Queso");
    }

    @Override public String toString(){
        return "Pizza Margarita";
    }

}
