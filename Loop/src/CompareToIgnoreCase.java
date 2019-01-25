public class CompareToIgnoreCase {
    public static void main(String[] args) {
        String a = "Vero";
        String b = "vero";

        if (a.equalsIgnoreCase(b)){
            System.out.println("The same");
        }else {
            System.out.println("Not equal");
        }

//        if (a.equals(b)){
//            System.out.println("The same");
//        }else {
//            System.out.println("Not equal");
//        }
    }
}
