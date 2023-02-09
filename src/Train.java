import java.math.BigDecimal;
import java.time.LocalDate;

public class Train extends Texniko {
    public Train(String marca, LocalDate dateOfMade, String color, BigDecimal price) {
        super(marca, dateOfMade, color, price);
    }

    public void StartedWork() {
        System.out.println("Сarries cargo");
    }

    @Override
    public String toString() {
        return "Train{" + super.toString() + "}";
    }
}
