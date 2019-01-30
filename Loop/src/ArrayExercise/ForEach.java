package ArrayExercise;

public class ForEach {
    public static void main(String[] args) {
        char[] anyChars = new char[26];
        char symbolCode = 65;

        for (int i = 0; i < anyChars.length; i++){
            anyChars[i] = symbolCode++;
        }

        for (char i: anyChars
             ) {
            System.out.println(i);
        }
    }
}
