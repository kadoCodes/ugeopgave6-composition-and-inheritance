package Del2;

import java.util.Random;

public class Lion extends Animal{

    public Lion(String name, int energy){
        super(name, energy);
    }

    @Override
    public int attack(){
        return 20;
    }

}
