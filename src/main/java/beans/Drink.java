package beans;

import lombok.Data;
import lombok.ToString;

@Data
@ToString(callSuper = true)
public class Drink extends Prodotto {
    private int ml;
    private int gradAlcol;

}
