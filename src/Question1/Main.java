package Question1;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("K15", "Minh", 2005, 8);
        Person person1 = new Person("K15", "Khanh", 2005);
        System.out.println(student1.toString());
        System.out.println(person1.toString());
    }
}