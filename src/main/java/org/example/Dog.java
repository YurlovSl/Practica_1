package org.example;

public class Dog extends Animal {
    public Dog(String name, int age, int weight, String color) {
        super(name, age, weight, color);
    }
    public String say(){
        return "Гав";
    }
}
