package Del1;

import java.util.ArrayList;

public class Building {
    String name;
    ArrayList<Room> rooms;

    Building(String name){
        this.name = name;
        this.rooms = new ArrayList<>();
    }

    void addRoom(Room room){
        rooms.add(room);
    }

    int getTotalLampCount(){
        int lampsSum = 0;

        for (int i = 0; i < rooms.size(); i++){
            lampsSum += rooms.get(i).getLampCount();
        }

        return lampsSum;
    }

    int getTotalWatt(){
        int wattSum = 0;

        for (int i = 0; i < rooms.size(); i++){
            wattSum += rooms.get(i).getTotalWatt();
        }

        return wattSum;
    }

    void printBuilding(){
        int totalWindows = 0;
        int totalWindowsAreal = 0;

        System.out.println("--|"+name+"|--");

        for (int i = 0; i < rooms.size(); i++){
            rooms.get(i).printRoom();
            totalWindows += rooms.get(i).windows.size();
            totalWindowsAreal += rooms.get(i).getTotalWindowArea();
        }


        System.out.println("Total: "+getTotalLampCount()+" lamps, "+getTotalWatt()+"W");
        System.out.println("Total: "+totalWindows+" windows, "+totalWindowsAreal+"cm");

    }
}
