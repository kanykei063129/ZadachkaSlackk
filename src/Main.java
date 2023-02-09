import java.math.BigDecimal;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Harvester harvester = new Harvester("FENDT", LocalDate.of(2000,1,1),"Red",new BigDecimal(200000));
        System.out.println(harvester);
        harvester.start();
        harvester.StartedWork();
        harvester.stop();

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        Tractor tractor = new Tractor("JINMA",LocalDate.of(1990,3,5),"Black", new BigDecimal(50000));
        System.out.println(tractor);
        tractor.start();
        tractor.startsToDig();
        tractor.stop();

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        Bus bus = new Bus("MERCEDES",LocalDate.of(1900,1,8),"black",new BigDecimal(150000));
        System.out.println(bus);
        bus.start();
        bus.startsToTax();
        bus.stop();

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        Trolleybus trolleybus = new Trolleybus("MERCEDES",LocalDate.of(2005,1,1),"Red",new BigDecimal(2000000));
        System.out.println(trolleybus);
        trolleybus.start();
        trolleybus.startsToTax();
        trolleybus.stop();

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        Train train = new Train("Electric train",LocalDate.of(2020,1,1),"white",new BigDecimal(50000000));
        System.out.println(train);
        train.start();
        train.StartedWork();
        train.stop();
    }
}