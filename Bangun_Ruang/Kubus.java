package Bangun_Ruang;
import java.util.Random;
public class Kubus {
    double sisi;
    double volume;
    Random ran = new Random();
    public Kubus(){
        this.sisi = ran.nextInt(50)+1;
    }

    public Kubus(double sisi){
        setSisi(sisi);
    }
    public void setSisi(double sisi) {
        this.sisi = sisi;
    }
    public double getSisi() {
        return sisi;
    }
    public void ComputeAndSetVolume ()
    {
        volume=sisi*sisi*sisi;
    }
    public double getVolume() {
        ComputeAndSetVolume();
        return volume;
    }
}
