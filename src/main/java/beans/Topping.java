package beans;

import lombok.Data;
import lombok.ToString;

@Data
@ToString(callSuper = true)
public class Topping extends Prodotto {
    private int quantita;

    public Topping() {
    }

    public Topping(String name) {
        this.setNome(name);
    }


}
