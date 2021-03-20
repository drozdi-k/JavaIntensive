package MethodsClassesObjects;

import org.apache.log4j.Logger;
public class Dog {
    int age;
    String color;
    String name;

    static Logger logger = Logger.getLogger(Dog.class);

    public Dog(int age, String color, String name) {
        this.age = age;
        this.color = color;
        this.name = name;
    }

    public static void main(String[] args) {
        var dog = new Dog(3,"black","Sharik");
        dog.voice();
        dog.eat();
        dog.sleep();
    }
    void voice(){
        logger.info("Gav");
    }
    void eat(){
        logger.info("eating...");
    }
    void sleep(){
        logger.info("Z-z-z-z-z");
    }
}
