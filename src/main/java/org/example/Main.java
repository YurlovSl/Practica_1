package org.example;

import fabrica.Fabrica;
import helper.ChooseData;
import helper.TypeAnimalsData;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();
        String line = null;
        String name = null;
        int age;
        int weight;
        String color = null;
        ChooseData chooseData;


        while (true) {
            System.out.println("Введите одну из команд add/list/exit");
            Scanner scanner = new Scanner(System.in);
            line = scanner.nextLine().toUpperCase().trim();
            System.out.println(line);
            try {
                chooseData = ChooseData.valueOf(line);
            } catch (Exception ex) {
                System.out.println("Такой команды нет, попробуй еще раз");
                continue;
            }
            switch (chooseData) {
                case ADD:
                    System.out.println("Введите название животного");
                    String typeAnimal = scanner.nextLine().toUpperCase().trim();
                    System.out.println(typeAnimal);

                    if (!typeAnimal.equals("CAT") && !typeAnimal.equals("DOG") && !typeAnimal.equals("DUCK")) {

                        System.out.println("Такого животного нет, повторите попытку еще раз");
                        break;
                    } else {
                        System.out.println("Введите имя");
                        while (!scanner.hasNext("[a-zA-Z]*$")) {
                            System.out.println("Ввод только символов, введите повторно");
                            scanner.next();
                        }
                        name = scanner.next();

                        System.out.println("Введите возраст");
                        while (!scanner.hasNext("[0-9]*$")) {
                            System.out.println("Ввод только цифр, введите повторно");
                            scanner.next();
                        }
                        age = scanner.nextInt();

                        System.out.println("Введите вес");
                        while (!scanner.hasNext("[0-9]*$")) {
                            System.out.println("Ввод только цифр, введите повторно");
                            scanner.next();
                        }
                        weight = scanner.nextInt();

                        System.out.println("Введите цвет");
                        while (!scanner.hasNext("[a-zA-Z]*$")) {
                            System.out.println("Ввод только символов, введите повторно");
                            scanner.next();
                        }
                        color = scanner.next();

//                        switch (typeAnimal) {
//                            case "CAT":
//                                animals.add(new Cat(name, age, weight, color));
//                                System.out.println(new Cat(name, age, weight, color).say());
//
//                                continue;
//                        }

                    Animal animal = new Fabrica(name,age,weight,color).create(TypeAnimalsData.valueOf(typeAnimal));
                    animals.add(animal);
                        System.out.println(animal.say());
                    break;


                    }


                case LIST:
                    if (animals.size() == 0) {
                        System.out.println("На данный момент список пока пуст");
                        continue;
                    } else {

                        for (Animal an : animals)
                            System.out.println(an.toString());
                    }


                case EXIT:
                    scanner.close();
                    System.exit(0);
            }


        }


    }
}