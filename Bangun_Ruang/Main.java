package Bangun_Ruang;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Pilih bangun ruang: ");
        System.out.println(("1.Kubus"));
        System.out.println(("2.Balok"));
        System.out.println(("3.Tabung"));
        System.out.println(("4.limas segi empat"));
        System.out.println(("5.Bola"));

        System.out.println("Masukkan pilihan: ");
        int name = input.nextInt();
        System.out.println("Metode Pengambilan Data:");
        System.out.println("1. Otomatis/2. Manual");
        System.out.println("Masukkan pilihan: ");
        int pilihan = input.nextInt();
        switch(name){
            case 1 :
        double sisi;
        if (pilihan == 1){
            Kubus kubus = new Kubus();
            System.out.println("Sisi kubus: " + kubus.getSisi());
            System.out.println("Volume kubus: " + kubus.getVolume());
        }
        else if (pilihan == 2){
            System.out.println("Masukkan sisi kubus: ");
            sisi = input.nextDouble();
            Kubus kubus = new Kubus(sisi);
            System.out.println("Volume kubus: " + kubus.getVolume());
        }
        else {
            System.out.println("Pilihan tidak tersedia");
        
        }
        break;
            case 2 :
        double panjang;
        double lebar;
        double tinggi;
        if (pilihan == 1){
            Balok balok = new Balok();
            System.out.println("Panjang balok: " + balok.getpanjang());
            System.out.println("Lebar balok: " + balok.getlebar());
            System.out.println("Tinggi balok: " + balok.gettinggi());
            System.out.println("Volume balok: " + balok.getVolume());
        }
        else if (pilihan == 2){
            System.out.println("Masukkan panjang balok: ");
            panjang = input.nextDouble();
            System.out.println("Masukkan lebar balok: ");
            lebar = input.nextDouble();
            System.out.println("Masukkan tinggi balok: ");
            tinggi = input.nextDouble();
            Balok balok = new Balok(panjang, lebar, tinggi);
            System.out.println("Volume balok: " + balok.getVolume());
        }
        else {
            System.out.println("Pilihan tidak tersedia");
        }
        break;
            case 3 :
            double radius;
        if (pilihan == 1){
            Tabung tabung = new Tabung();
            System.out.println("Radius tabung: " + tabung.getRadius());
            System.out.println("Tinggi tabung: " + tabung.getTinggi());
            System.out.println("Volume tabung: " + tabung.getVolume());
        }
        else if (pilihan == 2){
            System.out.println("Masukkan radius tabung: ");
            radius = input.nextDouble();
            System.out.println("Masukkan tinggi tabung: ");
            tinggi = input.nextDouble();
            Tabung tabung = new Tabung(radius, tinggi);
            System.out.println("Volume tabung: " + tabung.getVolume());
        }
        else {
            System.out.println("Pilihan tidak tersedia");
        }
        break;
            case 4 :
        double alas;
         
        if (pilihan == 1){
            LimasSegiEmpat limas = new LimasSegiEmpat();
            System.out.println("Alas limas: " + limas.getSisi());
            System.out.println("Tinggi limas: " + limas.getTinggi());
            System.out.println("Volume limas: " + limas.getVolume());
        }
        else if (pilihan == 2){
            System.out.println("Masukkan alas limas: ");
            alas = input.nextDouble();
            System.out.println("Masukkan tinggi limas: ");
            tinggi = input.nextDouble();
            LimasSegiEmpat limas = new LimasSegiEmpat(alas, tinggi);
            System.out.println("Volume limas: " + limas.getVolume());
        }
        else {
            System.out.println("Pilihan tidak tersedia");
        }
        break;
            case 5 :
        if (pilihan == 1){
            Bola bola = new Bola();
            System.out.println("Radius bola: " + bola.getRadius());
            System.out.println("Volume bola: " + bola.getVolume());
        }
        else if (pilihan == 2){
            System.out.println("Masukkan radius bola: ");
            radius = input.nextDouble();
            Bola bola = new Bola(radius);
            System.out.println("Volume bola: " + bola.getVolume());
        }
        else {
            System.out.println("Pilihan tidak tersedia");
        }


    }}
}
