package ch_04.sect_03;

class Animal {

    protected String name;

    Animal(String name) {
        this.name = name;
    }

    void sound() {
        System.out.println("Some generic animal sound");
    }
}

class Dog extends Animal {

    String breed;

    Dog(String name, String breed) {
        super(name);
        this.breed = breed;
    }

    @Override
    void sound() {
        super.sound();
        System.out.println("Bark! Bark!");
    }

    void displayInfo() {
        System.out.println("Name: " + super.name);
        System.out.println("Breed: " + this.breed);
    }
}


public class task_04_03_01 {
    public static void main(String[] args) {
        Dog myDog = new Dog("Buddy", "Golden Retriever");
        myDog.sound(); // Some generic animal sound а затем Bark! Bark!
        myDog.displayInfo(); // Name: Buddy  затем  Breed: Golden Retriever
    }
}
