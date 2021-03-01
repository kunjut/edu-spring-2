package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

//@Component
@PropertySource("classpath:app.properties")
public class Person {
//    @Autowired
//    @Qualifier("catBean")
    private Pet pet;
//    @Value("${person.surname}")
    private String surname;
//    @Value("${person.age}")
    private int age;

    public Person(Pet pet) {
        System.out.println(">Person bean is created");
        this.pet = pet;
    }

//    @Autowired
//    public Person(@Qualifier("catBean") Pet pet) {
//        System.out.println(">Person bean is created");
//        this.pet = pet;
//    }

//    public Person() {
//        System.out.println(">Person bean is created");
//    }

//    @Autowired
//    @Qualifier("catBean")
    public void setPet(Pet pet) {
        System.out.println(">Class person: set pet");
        this.pet = pet;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        System.out.println(">Class Person: set surname");
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println(">Class Person: set age");
        this.age = age;
    }

    public void callMyPet() {
        System.out.println("Hello my pet");
        pet.say();
    }
}
