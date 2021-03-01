package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

// less 14, 15, 16 tregulov
public class ConfigWithAnnotations1 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext3.xml");

        Person myPerson = context.getBean("person", Person.class);
        myPerson.callMyPet();
//        Cat myCat = context.getBean("catBean", Cat.class);
//        myCat.say();
        System.out.println(myPerson.getSurname());
        System.out.println(myPerson.getAge());

        context.close();

    }
}
