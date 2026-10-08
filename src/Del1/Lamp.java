package Del1;

public class Lamp {
    int watt;
    boolean isOn;

    Lamp(int watt){
        this.watt = watt;
        this.isOn = false;
    }

    void turnOn(){
        isOn = true;
    }

    void turnOff(){
        isOn = false;
    }

    String ToString(){
        String status;
        if(isOn){
            status = "on";
        }
        else{
            status = "off";
        }
        return watt+"W ("+status+")";
    }
}
