package Dog;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Dog malish = new Dog();
//        malish.name = getEnteredString();
//        malish.breed = getEnteredString();
//        malish.speed = Integer.valueOf(getEnteredString());
//        malish.family = new String[]{"Mom", "Granny", "Bro", "Sis"};
        malish.friends.add("Mom");
        malish.friends.add("Granny");
        malish.friends.add("Bro");
        malish.friends.add("Sis");
        String person = getEnteredString();

        malish.run();
//        System.out.println(malish.info());
        malish.detectStranger(person);
    }

    public static String getEnteredString() {
        Scanner in = new Scanner(System.in);
        return in.nextLine();
    }
}