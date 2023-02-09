import java.math.BigDecimal;
import java.time.LocalDate;

public class Tractor extends Texniko{
    public Tractor(String marca, LocalDate dateOfMade, String color, BigDecimal price) {
        super(marca, dateOfMade, color, price);
    }
    public void startsToDig(){
        System.out.println("Works");
    }

    @Override
    public String toString() {
        return "Tractor{"+super.toString() +" }";
    }
}
