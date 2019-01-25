import java.io.BufferedReader;

public class Switch {
    public static void main(String[] args) {

        int monthNumber = 3;

        switch (monthNumber){
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
                default:
                    System.out.println("Nothing");
        }
    }
}
