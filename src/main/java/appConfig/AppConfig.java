package appConfig;

import beans.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class AppConfig {

    @Bean
    @Scope("prototype")
    public Pizza getPizza1(){
        Pizza pizza = new Pizza(List.of(getTopping1()));
        pizza.setNome("Diavola");
        pizza.setFormato(Formato.MAXI);
        pizza.setCalorie(400);
        pizza.setPrezzo(10);
        return pizza;
    }
    @Bean
    public Topping getTopping1(){
        Topping topping = new Topping();
        topping.setNome("Salamino");
        topping.setQuantita(2);
        topping.setPrezzo(3);
        topping.setCalorie(20);
        return topping;

    }
    @Bean
    public Drink getDrink1(){
        Drink drink = new Drink();
        drink.setCalorie(12);
        drink.setPrezzo(4);
        drink.setMl(500);
        drink.setNome("Birra");
        return drink;

    }
    @Bean
    public Drink getDrink2(){
        Drink drink = new Drink();
        drink.setCalorie(9);
        drink.setPrezzo(3.5);
        drink.setMl(330);
        drink.setNome("Coca Cola");
        return drink;

    }


    @Bean
    @Scope("prototype")
    public Pizza getPizza2(){
        Pizza pizza = new Pizza();
        pizza.setNome("Prosciutto");
        pizza.setCalorie(200);
        pizza.setPrezzo(8);
        pizza.setToppings(List.of(getTopping1()));
        return pizza;
    }
    @Bean
    public Topping getTopping2(){
        Topping topping = new Topping();
        topping.setNome("Prosciutto");
        topping.setQuantita(1);
        topping.setPrezzo(1);
        topping.setCalorie(10);
        return topping;

    }
    @Bean
    public Menu getMenu(){
        Menu menu = new Menu();
        menu.setPizze(List.of(getPizza1(),getPizza2()));
        menu.setToppings(List.of(getTopping1(),getTopping2()));
        menu.setDrinks(List.of(getDrink1(),getDrink2()));
        return menu;
    }
}
