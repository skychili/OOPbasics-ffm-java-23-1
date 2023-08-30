package org.example.vererbung;

public class Vehicle {
    protected String brand;
    protected String model;

    public Vehicle() {
        super();
    }

    public Vehicle(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void startEngine() {
        System.out.println("Engine stared!");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Vehicle vehicle)) return false;

        if (getBrand() != null ? !getBrand().equals(vehicle.getBrand()) : vehicle.getBrand() != null) return false;
        return getModel() != null ? getModel().equals(vehicle.getModel()) : vehicle.getModel() == null;
    }

    @Override
    public int hashCode() {
        int result = getBrand() != null ? getBrand().hashCode() : 0;
        result = 31 * result + (getModel() != null ? getModel().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
