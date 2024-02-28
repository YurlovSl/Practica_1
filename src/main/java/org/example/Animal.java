package org.example;

import fabrica.Fabrica;

public  class Animal {
    private String name;
    private int age;
    private int weight;
    private String color;

    public Animal(String name, int age, int weight, String color) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = color;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {this.name = name;}

    public int getAge() {
        return age;
    }

    public void setAge(int age) {this.age = age; }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) { this.weight = weight; }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String say() { return "Я говорю";}

    public void Go() { System.out.println("Я иду"); }

    public void Drink() {
        System.out.println("Я пью");
    }

    public void Eat() { System.out.println("Я ем");  }

    public void Parent_func (){};

    @Override
    public String toString() {
        return String.format("Привет, меня зовут %s, мне %d лет, я вешу %d кг, мой цвет %s", name, age, weight, color);


    }


}
