package Bangun_Ruang;
import java.util.Random;
public class Bola {
    double radius;
    double volume;
    Random ran = new Random();
    Bola(){
        this.radius = ran.nextInt(50)+1;
    }
    Bola(double radius){
        setRadius(radius);
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    double getRadius() {
        return radius;
    }
    void ComputeAndSetVolume(){
        volume = 4/3*3.14*radius*radius*radius;
    }
    public double getVolume() {
        ComputeAndSetVolume();
        return volume;
    }

}
