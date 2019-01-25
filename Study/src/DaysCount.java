import java.sql.SQLOutput;

public class DaysCount {

    public static void main(String[] args) {

        int time = 21;

        boolean night = time > 22;
        boolean good_weather = false;

        if(night){
            System.out.println("Sleep!");
        }

        if(!night && good_weather){
            System.out.println("Walk!");
        }

        if(!night && !good_weather){
            System.out.println("Reed a book");
        }
    }
}