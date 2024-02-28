package org.example;

public class Duck extends Animal implements IFlying {
    public Duck (String name, int age, int weigth, String color){
        super(name,age,weigth,color);
    }
    public String say(){
        return "Кря";
    }
    public void Fly(){
        System.out.println("Я лечу");
    }

}
