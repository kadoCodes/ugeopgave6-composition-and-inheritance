package Del2;

import java.util.Random;

public abstract class Animal {
    private String name;
    private int energy;

    Animal(String name, int energy){
        this.name = name;
        this.energy = energy;
    }

    String getName(){
        return name;
    }

    int getEnergy(){
        return energy;
    }

    void setEnergy(int energy){
        this.energy = energy;
    }

    boolean isActive(){
        return energy > 0;
    }

    public abstract int attack();

    String ToString(){
        return name+" (energy: "+energy+")";
    }
}
