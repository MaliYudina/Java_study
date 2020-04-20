package hello;

import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        hello("user");
        hello("user");
        hello_name(new Scanner(System.in));

    }

    public static void hello(String somebody) {
        System.out.println("Hello, " + somebody + "!");
    }

    public static void hello_name(Scanner in) {
        System.out.print("Input your name, please: ");
        String name = in.next();
        System.out.println("Hello, " + name + "!");

    }
}
