package Wilder;

public class ClassRoom {
    public static void main(String[] args) {
        Wilder emma = new Wilder("Emma", true);
        Wilder jojo = new Wilder("Jojo", false);
        Wilder claire = new Wilder("Claire", true);
        Wilder john = new Wilder("John", false);

        System.out.println(emma.whoAmI());
        System.out.println(jojo.whoAmI());
        System.out.println(claire.whoAmI());
        System.out.println(john.whoAmI());
    }
}
