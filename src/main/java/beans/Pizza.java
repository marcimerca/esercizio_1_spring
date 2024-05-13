package beans;

import lombok.Data;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Data
@ToString(callSuper = true)
public class Pizza extends Prodotto {
    private List<Topping> toppings;
    private Formato formato = Formato.NORMALE;

    public Pizza() {
        this.toppings = new ArrayList<>();
        this.toppings.add(new Topping("Mozzarella"));
    }

    public Pizza(List<Topping> toppings) {
        this.toppings = new ArrayList<>(toppings);
        this.toppings.add(new Topping("Mozzarella"));
    }


}
