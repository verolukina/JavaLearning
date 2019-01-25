package Man;

public class Main {
    public static void main(String[] args) {
        Man mom = new Man();
        Man grany = new Man();
        Man bro = new Man();
        Man sis = new Man();
        mom.name = "Inna";
        mom.age = 48;
        mom.weight = 60.1f;
        grany.name = "Tamara";
        grany.age = 71;
        grany.weight = 70;
        bro.name = "Guny";
        bro.age = 20;
        bro.weight = 75.5f;
        sis.name = "Tomka";
        sis.age = 23;
        sis.weight = 59;

        System.out.println("The average age is " + (float)(mom.age + grany.age + bro.age + sis.age)/4);
        System.out.println("The average weight is " + Math.ceil(getAverage(mom.weight, grany.weight, bro.weight,sis.weight)));
//        System.out.println("The average weight is " + (int)getAverage(mom.weight, grany.weight, bro.weight,sis.weight));
    }
    private static double getAverage(double a, double b, double c, double d){
        double result = (a + b + c + d)/4;
        return result;
    }
}
