package practice;

public class Polymorphism {

    public static void main(String[] args) {
        Car c1 = new Car();
        Car c2 = new SportsCar();
        SportsCar c3 = new SportsCar();

        c1.drive();
        c2.drive();
        c3.drive();

        c3.fastDrive();
        System.out.println("c1: " + c1.toString());
        System.out.println("c2: " + c2.toString());
        System.out.println("c3: " + c3.toString());
    }
}

class Car {
    int number;
    String name;

    public void drive() {
        System.out.println("부릉~");
    }
}

class SportsCar extends Car {
    String color;

    public void fastDrive() {
        System.out.println("스포츠카 부릉~");
    }
}