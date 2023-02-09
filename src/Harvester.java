import java.math.BigDecimal;
import java.time.LocalDate;

public class Harvester extends Texniko {

    public Harvester(String marca, LocalDate dateOfMade, String color, BigDecimal price) {
        super(marca, dateOfMade, color, price);
    }

    public void StartedWork() {
        System.out.println("Works");
    }

    @Override
    public String toString() {
        return "Harvester{ "+super.toString() +" }";
    }
}



