public class While3 {
    public static void main(String[] args) {
        int i = 1;
        float sum = 0;

        while (i <= 100){
            sum += i;
            i++;
        }

        System.out.println(sum / (i-1));
    }
}
