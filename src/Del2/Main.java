package Del2;

import java.util.ArrayList;

public class Main {
    void main(){
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Lion ("Simba", 80));
        animals.add(new Lion ("Scar", 80));
        animals.add(new Wolf ("Fenrir", 90));
        animals.add(new Rabbit("Squeky", 120));

        Contest con1 = new Contest(animals.get(0), animals.get(2));
        Contest con2 = new Contest(animals.get(1), animals.get(3));


        while (con1.getWinner() == null){
            con1.playRound();
        }
        System.out.println("Winner is "+con1.getWinner().getName()+"!");

        while (con2.getWinner() == null){
            con2.playRound();
        }
        System.out.println("Winner is "+con2.getWinner().getName()+"!");



    }
}
