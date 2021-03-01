package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScopeTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext3.xml");

        Dog myDog = context.getBean("dog", Dog.class);
        myDog.say();
//        System.out.println("Переменные ссылаются на один и тот же объект? " + (myDog == yourDog));
//        System.out.println(myDog);
//        System.out.println(yourDog);
//

//        Cat myCat = context.getBean("catBean", Cat.class);
//        Cat yourCat = context.getBean("catBean", Cat.class);
//
//        System.out.println("Переменные ссылаются на один и тот же объект? " + (myCat == yourCat));
//        System.out.println(myCat);
//        System.out.println(yourCat);
        context.close();
    }
}
