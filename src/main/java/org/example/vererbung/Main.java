package org.example.vererbung;

public class Main {

    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("A", "A");
        Car c1 = new Car("Polo", "Volkswagen", 14);

        v1.setModel("AB");
        v1.startEngine();


//        c1.setModel("B");
//        c1.setBrand("B");
        c1.startEngine();


        System.out.println(v1);
        System.out.println(c1);
    }
}
