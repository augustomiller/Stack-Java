package com.github.maicmiller;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        Stack<Carro> stackCars = new Stack<>();

        stackCars.push(new Carro("Ford"));
        stackCars.push(new Carro("Corolla"));
        stackCars.push(new Carro("Fiat"));

        System.out.println("My stack -> " + stackCars);
        System.out.println("Removing -> " + stackCars.pop());
        System.out.println("My stack -> " + stackCars);

        System.out.println("Show don't remove -> " + stackCars.peek());
        System.out.println("My stack -> " + stackCars);

        System.out.println("Is empty? -> " + stackCars.empty());

    }
}
