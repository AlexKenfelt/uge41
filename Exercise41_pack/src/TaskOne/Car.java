package TaskOne;

public class Car {
    private String brand;
    private String model;
    private int year;
    private String type;
    private String driver;


    public Car (String brand, String model, int year, String type){
        this.brand = brand;
        this.model = model;
        this.year = year;
        this. type = type;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", type='" + type + '\'' +
                '}';
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getType() {
        return type;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }
}
