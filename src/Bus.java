import java.math.BigDecimal;
import java.time.LocalDate;

public class Bus extends Texniko {
    public Bus(String marca, LocalDate dateOfMade, String color, BigDecimal price) {
        super(marca, dateOfMade, color, price);
    }

    public void startsToTax() {
        System.out.println("Works");
    }

    @Override
    public String toString() {
        return "Bus{" + super.toString() +"}";
    }
}
