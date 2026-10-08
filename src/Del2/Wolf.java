package Del2;

import java.util.Random;

public class Wolf extends Animal {
    Wolf(String name, int energy){
        super(name, energy);
    }

    @Override
    public int attack(){
        Random r = new Random();
        int min = 1;
        int max = 25;

        return r.nextInt(min, max);
    }
}
