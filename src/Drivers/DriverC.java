package Drivers;
import Trans.Truck;

public class DriverC extends Driver<Truck> {
    private static final String LISENSE_TYPE = "C";

    public DriverC(String name, boolean lisense, int period) {
        super(name, lisense, period);
        this.setLisense(lisense);
    }

    @Override
    public void stopMoving() {
        System.out.println("Грузовик остановился");
    }

    @Override
    public void startMoving() {
        System.out.println("Грузовик начал движение");
    }

}
