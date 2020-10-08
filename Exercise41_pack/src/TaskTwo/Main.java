package TaskTwo;

import java.util.ArrayList;

public class Main {


    public static void main(String[] args) {
        Room room1 = new Room(4, 2, 6, 8);
        Room room2 = new Room(8, 2, 6, 10);
        Room room3 = new Room(8, 2, 6, 6);

        ArrayList <Room> rooms = new ArrayList();
        rooms.add(room1);
        rooms.add(room2);
        rooms.add(room3);
        System.out.println(rooms);


        Building building = new Building(rooms, 5, 5, false);


        int lamps = 0;
        for (Room r: building.getRooms()){
             lamps += r.getNumberOfLamps();

        }
        System.out.println(lamps);
    }
}

