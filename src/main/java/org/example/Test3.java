package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

// 13 lesson init/destroy methods
public class Test3 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext2.xml");

        Dog myDog = context.getBean("myPet", Dog.class);
        myDog.say();
        Dog yourDog = context.getBean("myPet", Dog.class);
        myDog.say();

        context.close();
    }
}
