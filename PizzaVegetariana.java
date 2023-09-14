package edu.pizza.especialidades;

import edu.pizza.base.Pizza;
import edu.pizza.base.Topping;
public class PizzaVegetariana extends Pizza{

    public PizzaVegetariana(String name, Topping... toppings) {
        super(name, toppings);
    }
    private void toppings(String pimientos, String aceitunas, String cebolla, String champiñones, String queso) {
    }
    public void PizzaVegetariana() {
        toppings("Pimientos verdes y rojos", "Aceitunas negras", "Cebolla", "Champiñones", "Queso");
    }

    @Override public String toString(){
        return "Pizza Vegetariana";
    }
}
