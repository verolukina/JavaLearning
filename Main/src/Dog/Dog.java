package Dog;

import java.util.ArrayList;

public class Dog {
    String name;
    String breed;
    int speed;
    String[] family;
    ArrayList<String> friends = new ArrayList<>();

    void run() {
        String speedCounter = "";
        for (int i = 1; i <= speed; i++) {
            if (i == speed) {
                speedCounter += "Run.";
            } else {
                speedCounter += "Run, ";
            }
        }
        System.out.println(speedCounter);
    }

    String info() {
        return name + "\n" + breed + "\n" + speed;
    }

    void detectStranger(String person) {
        boolean isStranger = true;
        for (String i : friends
        ) {
            if (person.equalsIgnoreCase(i)) {
                isStranger = false;
                break;
            }
        }
        if (isStranger) {
            System.out.println("Gav-Gav!");
        } else {
            System.out.println("Wagging tail...");
        }
    }
}