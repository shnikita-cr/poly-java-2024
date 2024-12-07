package ch_03.sect_17;

import java.util.ArrayList;
import java.util.List;

class Animal {
    void makeSound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Woof");
    }
}

class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Meow");
    }
}

public class task_03_17_02 {
    class mainExtends {
        //метод для работы с классом Animal или подклассом Animal, происходит проверка типов
        //тк в методе используются методы Animal
        public void makeAllSounds(List<? extends Animal> animals) {
            for (Animal animal : animals) {
                animal.makeSound();
            }
        }

        public void mainE() {
            List<Dog> dogs = new ArrayList<>();
            dogs.add(new Dog());

            List<Cat> cats = new ArrayList<>();
            cats.add(new Cat());

            makeAllSounds(dogs);  // Список Dog передается как <? extends Animal>
            makeAllSounds(cats);  // Список Cat передается как <? extends Animal>
        }
    }

    //---------------------------------------------------------------

    class mainSuper {
        //метод для работы с классом Dog или его суперклассом, проверка типов
        public void addDogs(List<? super Dog> animals) {
            animals.add(new Dog());
            Object obj = animals.get(0);
        }

        public void mainS() {
            List<Animal> animals = new ArrayList<>();
            addDogs(animals);  // Список Animal подходит как <? super Dog>
        }
    }
}

