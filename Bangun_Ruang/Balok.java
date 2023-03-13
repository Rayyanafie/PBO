package Bangun_Ruang;
import java.util.Random;
public class Balok {
    double panjang;
    double lebar;
    double tinggi;
    double volume;
    Random ran = new Random();
    public Balok(){
        this.panjang = ran.nextInt(50)+1;
        this.lebar = ran.nextInt(50)+1;
        this.tinggi = ran.nextInt(50)+1;
    }
    public Balok(double panjang, double lebar, double tinggi){
        setlebar(lebar);
        setpanjang(panjang);
        settinggi(tinggi);
    }
    public void setpanjang (double panjang){
        this.panjang = panjang;
    }
    public void setlebar (double lebar){
        this.lebar = lebar;
    }
    public void settinggi (double tinggi){
        this.tinggi = tinggi;
    }
    public double getpanjang() {
        return panjang;
    }
    public double getlebar() {
        return lebar;
    }
    public double gettinggi() {
        return tinggi;
    }
    public void ComputeAndSetVolume ()
    {
        volume=panjang*lebar*tinggi;
    }
    public double getVolume() {
        ComputeAndSetVolume();
        return volume;
    }
}