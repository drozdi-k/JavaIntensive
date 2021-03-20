package MethodsClassesObjects;

import org.apache.log4j.Logger;

public class Human {
    String name;
    int age;

    static Logger logger = Logger.getLogger(Human.class);

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        var human = new Human("Arthur",20);
        human.greet();
    }

    void greet() {
        logger.info("Hi! My name "+ name +", I'm "+age+" years old");
    }
}
