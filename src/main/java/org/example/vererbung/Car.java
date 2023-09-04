package org.example.vererbung;

public class Car extends Vehicle {

    public static final String DRIVERSLICENCE = "B";

    protected int doorCount;

    public Car() {
        super();
    }

    public Car(int doorCount) {
        super();
        this.doorCount =  doorCount;
    }

    public Car(String brand, String model, int doorCount) {
        super(brand, model);
        this.doorCount = doorCount;
    }

    public int getDoorCount() {
        return doorCount;
    }

    public void setDoorCount(int doorCount) {
        this.doorCount = doorCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car car)) return false;
        if (!super.equals(o)) return false;

        return getDoorCount() == car.getDoorCount();
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + getDoorCount();
        return result;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
