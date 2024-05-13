package beans;

import lombok.Data;
import org.springframework.context.annotation.Bean;

@Data
public abstract class Prodotto {
    private String nome;
    private int calorie;
    private double prezzo;

    @Override
    public String toString() {
        return nome + '\'' +
                ", calorie=" + calorie +
                ", prezzo=" + prezzo;
    }
}
