package ExtraExamplesOOP;

public class OOP {
    public static void main(String[] args) {
        System.out.println("hello world");

        User u = new User();
        u.name = "Jimena";
        u.membership = "Gold";
        u.age = 33;

        User u2 = new User();
        u2.name = "Braiant";
        u2.membership = "Silver";
        u2.age = 32;

        System.out.println(u.name + " loves " + u2.name);
        System.out.println(u2.name + " " + u2.age + " " + u2.membership);


    }
}
