public class Box {
    double width;
    double height;
    double length;

    void setDimens(double width, double height, double length){
        this.width = width;
        this.height = height;
        this. length = length;
    }

    void toShowVolume(){
        double volume = width * height * length;
        System.out.println(volume);
    }

    double returneVolume() {
        return width * height * length;
    }
}
