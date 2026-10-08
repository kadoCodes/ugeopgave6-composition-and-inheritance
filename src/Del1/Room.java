package Del1;

import java.util.ArrayList;

public class Room {
    String name;
    ArrayList<Lamp> lamps;
    ArrayList<Window> windows;

    Room(String name){
        this.name = name;
        this.lamps = new ArrayList<>();
        this.windows = new ArrayList<>();
    }

    void addLamp(Lamp lamp){
        lamps.add(lamp);
    }

    void addWindow(Window window){
        windows.add(window);
    }

    int getLampCount(){
        return lamps.size();
    }

    int getTotalWatt(){
        int wattSum = 0;

        for (int i = 0; i < lamps.size(); i++){
            wattSum += lamps.get(i).watt;
        }

        return wattSum;
    }

    int getTotalWindowArea(){
        int areaSum = 0;

        for (int i = 0; i < windows.size(); i++){
            areaSum += windows.get(i).getAreaCm2();
        }

        return areaSum;
    }

    void printRoom(){
        System.out.println();
        System.out.println(name+": ("+getLampCount()+" lamps, "+windows.size()+" windows)");
        String[] lamplist = new String[lamps.size()];
        String[] windowlist = new String[windows.size()];

        for (int i = 0; i < lamps.size(); i++){
            lamplist[i] = lamps.get(i).ToString();
        }
        for (int i = 0; i < windows.size(); i++){
            windowlist[i] = windows.get(i).ToString();
        }

        String commaLamps = String.join(", ", lamplist);
        String commaWindows = String.join(", ", windowlist);

        System.out.println("Lamps: "+commaLamps+" total: ("+getTotalWatt()+"W)");

        System.out.println("Windows: "+commaWindows+" total: ("+getTotalWindowArea()+"cm)");

        System.out.println();

    }
}
