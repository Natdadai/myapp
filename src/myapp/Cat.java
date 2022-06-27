package myapp;

public class Cat {
    public static void Voice(){
        System.out.println("Meow!");
    }

    public static void Attack(){
        System.out.println("Cat Attack! \n  15 Damage!");
    }

    public static void main(String[] args) {
        Cat.Voice();
        Cat.Attack();
    }
}
