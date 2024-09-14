public class PersonTester {
    public static void main(String[] args) {
        Person person1 = new Person("Matthew Cha", 25, "Brown");
        System.out.println(person1);
        person1.talk();
        //new setters for person 1
        person1.setName("Howard Roark");
        person1.setAge(158);
        person1.setEyeColor("Yellow");

        System.out.println(person1);
        person1.talk();
    }
}