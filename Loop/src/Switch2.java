public class Switch2 {
    public static void main(String[] args) {
        String nameOfMonth = "Jan";

        switch (nameOfMonth){
            case "Dec":
                printWinter();
                break;
            case "Jan":
                printWinter();
                break;
            case "Mar":
                printSpring();
                break;
                default:
                    System.out.println("Nothing");
                    break;
        }
    }

    private static void printWinter(){
        System.out.println("Winter");
    }

    private static void printSpring(){
        System.out.println("Spring");
    }
}
