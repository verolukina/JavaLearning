public class While {
    public static void main(String[] args) {

        int i = 100;

        while(i<= 100){
            if(i%2==0){
                System.out.println(i);
            }
            i--;
            if(i==0){
                break;
            }
        }
    }
}
