package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String name;
        int age;
        double weight;


        Scanner keyboard = new Scanner(System.in);
        System.out.println("enter your name");
        name = keyboard.next();
        System.out.println("how old are you?");
        age = keyboard.nextInt();
        System.out.println("What is your weight?");
        weight = keyboard.nextDouble();
        System.out.println("nice to meet you "+ name);

    }
}
