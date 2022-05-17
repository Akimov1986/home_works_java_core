package ru.gb.jc;

import java.util.Arrays;

public class Team {
    
    
    public String titleTeam = " ";

    public Team(Animal[] animals) {
    }

    public void setTitleTeam(String titleTeam) {
        this.titleTeam = titleTeam;
    }

    static Animal[] animals = {new Cat("Барсик",100,25),
            new Cat("Борис", 95,27),
            new Dog("Боб", 125,20),
            new Dog("Граф", 115, 30)};
    

    public static void infoParticipants() {
        for (Animal animal : animals) {
            System.out.println(animal);
        }
    }
        public static void main(String[] args) {
        Course c = new Course("Min");
        Team team = new Team(animals);


    }


}
