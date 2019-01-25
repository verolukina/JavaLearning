public class For3 {
    public static void main(String[] args) {
        float sum = 0;
        int count = 0;

        for (int i = 1; i <= 101; i++){
            sum += i;
            count = i;
        }

        System.out.println(sum / count);
    }
}
