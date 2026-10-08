package Del1;

public class Window {
    int widthCm;
    int heightCm;

    Window(int widthCm, int heightCm){
        this.widthCm = widthCm;
        this.heightCm = heightCm;
    }

    int getAreaCm2(){
        return widthCm*heightCm;
    }

    String ToString(){
        return widthCm+"x"+heightCm+"cm";
    }
}
