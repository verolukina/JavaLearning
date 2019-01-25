public class Main {
    public static void main(String[] args) {
        Box myBox = new Box();
//        myBox = new Box();
        Box box2 = new Box();
        Box box3 = new Box();

        myBox.height = 10.2;
        myBox.length = 15;
        myBox.width = 11.3;
        box2.height = 5;
        box2.length = 5;
        box2.width = 5;
        box3.height = 10;
        box3.length = 10;
        box3.width = 10;

        double volume = myBox.height * myBox.length * myBox.width;
        double volume2 = box2.height * box2.length * box2.width;
        double volume3 = box3.height * box3.length * box3.width;

        System.out.println("The first box volume is " + volume + "\nThe second box volume is " + volume2 + "\nThe third box volume is " + volume3);
    }
}
