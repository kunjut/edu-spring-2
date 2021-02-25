package org.example;

public class Person {
    private Pet pet;

//    public Person(Pet pet) {
//        this.pet = pet;
//    }

    public Person() {
        System.out.println(">Person bean is created");
    }

    public void setPet(Pet pet) {
        System.out.println(">Class person: set pet");
        this.pet = pet;
    }

    public void callMyPet() {
        System.out.println("Hello my pet");
        pet.say();
    }
}
