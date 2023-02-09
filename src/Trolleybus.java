import java.math.BigDecimal;
import java.time.LocalDate;

public class Trolleybus extends Texniko {
    public Trolleybus(String marca, LocalDate dateOfMade, String color, BigDecimal price) {
        super(marca, dateOfMade, color, price);
    }

    public void startsToTax() {
        System.out.println("Works");
    }

    @Override
    public String toString() {
        return "Trolleybus{" + super.toString() + "}";
    }
}
