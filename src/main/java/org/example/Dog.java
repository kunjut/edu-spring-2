package org.example;

public class Dog implements Pet {
    public Dog() {
        System.out.println(">Dog bean is created");
    }

    @Override
    public void say() {
        System.out.println("Bark-bark");
    }

    public void init() {
        System.out.println("Class Dog: init method");
    }

    public void destroy() {
        System.out.println("Class Dog: destroy method");
    }
}
