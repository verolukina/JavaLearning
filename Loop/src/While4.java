public class While4 {
    public static void main(String[] args) {
        int i = 100;

        while (i <= 1000){
            if (i%2!=0 && i%5==0){
                System.out.println(i);
            }
            i++;
        }
    }
}
