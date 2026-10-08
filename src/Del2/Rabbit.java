package Del2;

import java.util.Random;

public class Rabbit extends Animal{
    Rabbit(String name, int energy){
        super(name, energy);
    }

    @Override
    public int attack(){
        Random r = new Random();
        int min = 1;
        int max = 10;
        return r.nextInt(min, max);
    }
}
