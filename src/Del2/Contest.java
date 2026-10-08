package Del2;

public class Contest {
    Animal animal1;
    Animal animal2;
    int roundCount;

    Contest(Animal animal1, Animal animal2){
        this.animal1 = animal1;
        this.animal2 = animal2;
        this.roundCount = 0;
    }

    void playRound(){
        roundCount++;
        System.out.println();
        System.out.println("-- Round "+roundCount+" --");


        int animal1Dmg = animal1.attack();
        animal2.setEnergy(animal2.getEnergy() - animal1Dmg);
        System.out.println(animal1.getName()+" attacks "+animal2.getName()+" for "+animal1Dmg+"! ("+ animal2.getName()+" has "+animal2.getEnergy()+" energy left)");
        if (!animal2.isActive()){
            return;
        }

        int animal2Dmg = animal2.attack();
        animal1.setEnergy(animal1.getEnergy() - animal2Dmg);
        System.out.println(animal2.getName()+" attacks "+animal1.getName()+" for "+animal2Dmg+"! ("+ animal1.getName()+" has "+animal1.getEnergy()+" energy left)");



    }

    Animal getWinner(){
        if (animal1.isActive() && !animal2.isActive()){
            return animal1;
        }
        else if (animal2.isActive() && !animal1.isActive()){
            return animal2;
        }

        return null;
    }
}
