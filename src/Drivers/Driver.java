package Drivers;

import Trans.Transport;

public abstract class Driver <T extends Transport> {

    private String name;
    private boolean lisense;
    private int period;
    private T transport;

    public String getName() {
        return name;
    }

    public boolean isLisense() {
        return lisense;
    }

    public int getPeriod() {
        return period;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLisense(boolean lisense) {
        this.lisense = lisense;
    }

    public void setPeriod(int period) {
        this.period = period;
    }

    public Driver(String name, boolean lisense, int period) {
        this.name=name;
        this.lisense=lisense;
        this.period=period;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "name='" + name + '\'' +
                ", lisense=" + lisense +
                ", period=" + period +
                '}';
    }

    public void addOil(){
        System.out.println("Необходимо заправить авто");
    }

    public void drive(T transport){
        if(lisense==true) {
            System.out.println("Водитель "+name+" управляет автомобилем "+ transport +" и будет участвавать в заезде");
        }
        else{
            System.out.println("Водитель "+name+" имеет просроченные права");
        }
    }

    abstract public void stopMoving();

    abstract public void startMoving();
}
