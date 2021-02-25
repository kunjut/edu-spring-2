package org.example;

public class Person {
    private Pet pet;

    public Person(Pet pet) {
        this.pet = pet;
    }

    public void callMyPet() {
        System.out.println("Hello my pet");
        pet.say();
    }
}
