package Drivers;
import Trans.Bus;
import Trans.Truck;

public class DriverD extends Driver<Bus> {
    private static final String LISENSE_TYPE = "D";

    public DriverD(String name, boolean lisense, int period) {
        super(name, lisense, period);
        this.setLisense(lisense);
    }

    @Override
    public void stopMoving() {
        System.out.println("Автобус остановился");
    }

    @Override
    public void startMoving() {
        System.out.println("Автобус начал движение");
    }

}
