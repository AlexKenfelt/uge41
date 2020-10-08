package TaskOne;
// main er her vi kalder alt fra

public class Main {
    public static void main (String []args){
        Driver driver1 = new Driver("Gitte Glad", 36);
        Driver driver2 = new Driver("Benjamin Poke",28);
        Car car1 = new Car ("Mercedes", "A200", 2020, "personbil");
        Car car2 = new Car("Peugeot", "208", 2017,"personbil");

    }
    //Car car1 = driver1.getCar();

   /* @Override
    public String toString() {
        return "Main{" +
                "car1=" + car1 +
                '}';
    }*/


}
