public class MyOwnAutoShop {
    public static void main(String[] args) {
        Sedan sedan = new Sedan();
        sedan.speed = 160;
        sedan.regularPrice = 22000;
        sedan.color = "Black";
        sedan.length = 22;

        Ford ford1 = new Ford();
        ford1.speed = 220;
        ford1.regularPrice = 28000;
        ford1.color = "Red";
        ford1.year = 2022;
        ford1.manufacturerDiscount = 1500;

        Ford ford2 = new Ford();
        ford2.speed = 180;
        ford2.regularPrice = 32000;
        ford2.color = "Black";
        ford2.year = 2023;
        ford2.manufacturerDiscount = 2000;

        Car car = new Car();
        car.speed = 150;
        car.regularPrice = 15000;
        car.color = "Silver";

        Truck truck = new Truck(); 
        truck.speed=300; 
        truck.regularPrice=33000; 
        car.color= "navy"; 

        System.out.println("Sedan Sale Price: " + sedan.getSalePrice());
        System.out.println("Ford 1 Sale Price: " + ford1.getSalePrice());
        System.out.println("Ford 2 Sale Price: " + ford2.getSalePrice());
        System.out.println("Car Sale Price: " + car.getSalePrice());
        System.out.println("Truck sale price: " + truck.getSalePrice());
    }
}