package oop;

public class Main {

    public static void main(String[] args) {

        Dog lab = new Dog();
        lab.setName("Charley");
        lab.setBreed("Lab");
        lab.setSize(Size.AVERAGE);
        lab.bite();

        Dog sheppard = new Dog();
        sheppard.setName("Mike");
        sheppard.setBreed("Sheppard");
        sheppard.setSize(Size.BIG);
        sheppard.bite();

        Dog doberman = new Dog();
        doberman.setName("Jack");
        doberman.setBreed("Doberman");
        doberman.setSize(Size.BIG);
        doberman.bite();

    }
}
