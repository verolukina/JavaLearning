public class While2 {
    public static void main(String[] args) {
        int i = 1;
        int count = 0;

        while (i <=10){
            if(i%2==0){
                count++;
            }
            i++;
        }
        System.out.println(count);
    }
}