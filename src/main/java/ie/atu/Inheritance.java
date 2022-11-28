package ie.atu;

public class Inheritance {
    public static void main(String[] args) {

        Person person1 = new Person();
        person1.setName("Jack");
        person1.setAddress("Galway");
        person1.setTelephone("085420");

        System.out.println("Persons name is: " + person1.getName());
        System.out.println("Persons address is: " + person1.getAddress());
        System.out.println("Persons telephone is: " + person1.getTelephone());

    }
}
