/**
 * Matthew Cha
 * Class: Person
 * version 1.0
 * 9/13/2024
 *  Creates an OOP class named person
 */
public class Person {
    private String name;
    private int age;
    private String eyeColor;

    public Person() {
        this.name = "";
        this.age = 0;
        this.eyeColor = "";
    }
    //makes class with 3 args
    public Person(String name, int age, String eyeColor) {
        this.name = name;
        this.age = age;
        this.eyeColor = eyeColor;
    }
    //getters for args
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEyeColor() {
        return eyeColor;
    }
    //setters for args
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    //toString method
    public String toString() {
        return "Person[name= " + name + ", age= " + age + ", eyeColor= " + eyeColor + "]";
    }
    //prints message
    public void talk() {
        System.out.println("Welcome, coders! I am " + name);
    }
}