package Bangun_Ruang;
import java.util.Random;
public class LimasSegiEmpat {
    double sisi;
    double tinggi;
    double volume;
    Random ran = new Random();
    LimasSegiEmpat () {
        this.sisi = ran.nextInt(50)+1;
        this.tinggi = ran.nextInt(50)+1;
    }
    LimasSegiEmpat(double sisi, double tinggi) {
        setTinggi(tinggi);
        SetSisi(sisi);
    }

    public void SetSisi (double sisi){
        this.sisi = sisi;
    }
    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
        
    }
    double getSisi() {
        return sisi;
    }
    double getTinggi() {
        return tinggi;
    }
    void ComputeAndSetVolume () {
        volume = (sisi*sisi*tinggi)/3;
    }
    public double getVolume (){
        ComputeAndSetVolume();
        return volume;
    }
    

}
