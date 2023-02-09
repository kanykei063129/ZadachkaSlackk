import java.math.BigDecimal;
import java.time.LocalDate;

public class Texniko {
    private String marca;
    private LocalDate dateOfMade;
    private String color;
    private BigDecimal price;

    public Texniko(String marca, LocalDate dateOfMade, String color, BigDecimal price) {
        this.marca = marca;
        this.dateOfMade = dateOfMade;
        this.color = color;
        this.price = price;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public LocalDate getDateOfMade() {
        return dateOfMade;
    }

    public void setDateOfMade(LocalDate dateOfMade) {
        this.dateOfMade = dateOfMade;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public void start(){
        System.out.println("Started");
    }
    public void stop(){
        System.out.println("Stopping");
    }

    @Override
    public String toString() {
        return
                "marca=" + marca + '\'' +
                ", dateOfMade=" + dateOfMade +
                ", color=" + color + '\'' +
                ", price=" + price;

    }
}
