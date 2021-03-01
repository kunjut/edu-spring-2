package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

// 12 lesson Bean Scope
public class Test2 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext2.xml");

        Dog myDog = context.getBean("myPet", Dog.class);
//        myDog.setName("Belka");
        Dog yourDog= context.getBean("myPet", Dog.class);


        System.out.println(myDog.toString());
        System.out.println(myDog.toString());

//        System.out.println(myDog.getName());
//        System.out.println(yourDog.getName());
    }
}
