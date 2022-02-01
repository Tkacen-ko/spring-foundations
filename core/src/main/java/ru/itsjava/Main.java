package ru.itsjava;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context
                = new ClassPathXmlApplicationContext("context.xml");
        Piglet piglet = context.getBean("pig", Piglet.class);
        piglet.say();
    }
}
