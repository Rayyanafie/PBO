package Bangun_Ruang;
import java.util.Random;
public class Tabung {
    double radius;
    double tinggi;
    double volume;
    Random ran = new Random();
    public Tabung() {
        this.radius = ran.nextInt(50)+1;
        this.tinggi = ran.nextInt(50)+1;
    }
    public Tabung(double radius, double tinggi) {
        setRadius(radius);
        setTinggi(tinggi);
    }
    
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }
    double getRadius() {
        return radius;
    }
    double getTinggi() {
        return tinggi;
    }
    void ComputeAndSetVolume(){
        volume = 3.14*radius*radius*tinggi;
    }
    public double getVolume() {
        ComputeAndSetVolume();
        return volume;
    }
}
