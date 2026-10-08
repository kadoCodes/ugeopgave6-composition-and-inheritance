package Del1;

public class Main {
    void main(){
        Building building = new Building("Call Center");

        //Room1
            Room room1 = new Room("Main Office");
            Lamp lamp1 = new Lamp(70);
            Lamp lamp2 = new Lamp(50);
            Window window1 = new Window(120, 60);

        //Room2
            Room room2 = new Room("Support Office");
            Lamp lamp3 = new Lamp(35);
            Lamp lamp4 = new Lamp(40);
            Window window2 = new Window(130, 55);

        //Room3
            Room room3 = new Room("Ticket Support");
            Lamp lamp5 = new Lamp(45);
            Lamp lamp6 = new Lamp(60);
            Window window3 = new Window(140, 110);



        building.addRoom(room1);
        building.addRoom(room2);
        building.addRoom(room3);

        room1.addLamp(lamp1);
        room1.addLamp(lamp2);
        room1.addWindow(window1);

        room2.addLamp(lamp3);
        room2.addLamp(lamp4);
        room2.addWindow(window2);

        room3.addLamp(lamp5);
        room3.addLamp(lamp6);
        room3.addWindow(window3);

        building.printBuilding();

    }

}
