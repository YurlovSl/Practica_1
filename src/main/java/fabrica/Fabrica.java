package fabrica;

import helper.TypeAnimalsData;
import org.example.Animal;
import org.example.Cat;
import org.example.Dog;
import org.example.Duck;

public class Fabrica {
    private String name;
    private int age;
    private int weight;
    private String color;

    public Fabrica(String name, int age, int weight, String color) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = color;
    }

    public Animal create(TypeAnimalsData type){
        Animal animal = null;
        switch (type){
            case CAT:
                 animal = new Cat(name,age,weight,color);
                 break;
            case DOG:
                 animal = new Dog(name,age,weight,color);
                 break;
            case DUCK:
                 animal = new Duck(name,age,weight,color);
                 break;

        }
        return animal;
    }
}
