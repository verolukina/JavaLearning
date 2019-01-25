public class Box2 {
    public static void main(String[] args) {
        Box boxOne = new Box();
        Box boxTwo = new Box();

        boxOne.setDimens(5, 5, 5);
//        boxOne.height = 5;
//        boxOne.length = 5;
//        boxOne.width = 5;
        boxTwo.height = 10;
        boxTwo.length = 10;
        boxTwo.width = 10;

//        boxOne.toShowVolume();
//        boxTwo.toShowVolume();

        System.out.println("The first box volume is " + (int) boxOne.returneVolume());
        System.out.println("The second box volume is " + boxTwo.returneVolume());
    }
}
