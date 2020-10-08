package TaskOne;

public class Driver {
    private String name;
    private int age;

    // nu laver jeg min konstruktør
    public Driver (String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }


}

