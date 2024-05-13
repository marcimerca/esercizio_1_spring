package beans;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Data
public class Menu {
    private List<Pizza> pizze;
    private List<Topping> toppings;
    private List<Drink> drinks;

    public void stampaMenu(){
        System.out.println("------MENU------");
        System.out.println("---Pizze---");
        for(Pizza pizza: pizze){
            System.out.println(pizza.getNome() + " ("+pizza.getToppings().stream().map(topping -> topping.getNome()).collect(Collectors.joining(",")) + "), "+"calorie: " + pizza.getCalorie() +", prezzo: "+ pizza.getPrezzo());
        }
        System.out.println("---Toppings---");
        for(Topping topping: toppings){
            System.out.println(topping.getNome() + ", calorie: " + topping.getCalorie() +", prezzo: " + topping.getPrezzo());
        }
        System.out.println("---Drinks---");
        for(Drink drink: drinks){
            System.out.println(drink.getNome()+", calorie: "+ drink.getCalorie() +",prezzo: " + drink.getPrezzo());
        }
    }


}
