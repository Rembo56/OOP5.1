package Drivers;
import Trans.PassCar;
import Trans.Truck;

public class DriverB extends Driver<PassCar> {
    private static final String LISENSE_TYPE = "B";

    public DriverB(String name, boolean lisense, int period) {
        super(name, lisense, period);
        this.setLisense(lisense);
    }

    @Override
    public void stopMoving() {
        System.out.println("Машина остановилась");
    }

    @Override
    public void startMoving() {
        System.out.println("Машина начала движение");
    }

}
