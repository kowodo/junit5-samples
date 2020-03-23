package com.tutorialspoint;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        HelloWorld singletonA = (HelloWorld) context.getBean("helloWorld");
        singletonA.setMessage("This is SingletonA");
        System.out.println("=> singletonA.getMessage()");
        singletonA.getMessage();

        HelloWorld singletonB = (HelloWorld) context.getBean("helloWorld");
        System.out.println("=> singletonB.getMessage()");
        singletonB.getMessage();

        HelloWorld prototypeA = (HelloWorld) context.getBean("helloWorldPrototype");
        prototypeA.setMessage("This is PrototypeA");
        System.out.println("=> prototypeA.getMessage()");
        prototypeA.getMessage();

        HelloWorld prototypeB = (HelloWorld) context.getBean("helloWorldPrototype");
        System.out.println("=> prototypeB.getMessage()");
        prototypeB.getMessage();



    }
}
