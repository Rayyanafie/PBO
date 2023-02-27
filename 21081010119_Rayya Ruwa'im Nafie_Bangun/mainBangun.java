package Bangun;
import java.util.Scanner;

public class mainBangun {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(("1.Persegi/2.Persegi Panjang/3.Lingkaran/4.Elips"));
        int name = input.nextInt();
        double luas;
        int pilihan;
        switch(name){
            case 1 :
        Square persegi = new Square();
        System.out.println(("1.keliling/2.luas"));
        pilihan = input.nextInt();
        if(pilihan == 1){
            System.out.println("Keliling Persegi = " + persegi.getkelling());
        }else 
            System.out.println(("Luas Persegi = " + persegi.getLuas()));
        break;
            case 2 :
        Rectangle persegipanjang = new Rectangle();
        System.out.println(("1.keliling/2.luas"));
        pilihan = input.nextInt();
        if(pilihan == 1){
            System.out.println("Keliling Persegi Panjang = " + persegipanjang.getkelling());
        }else
            System.out.println(("Luas Persegi Panjang = " + persegipanjang.getLuas()));
        break;
            case 3 :
        Circle lingkarang = new Circle();
        System.out.println(("1.keliling/2.luas"));
        pilihan = input.nextInt();
        if(pilihan == 1){
            System.out.println("Keliling Lingkaran = " + lingkarang.getkelling());
        }else
            System.out.println(("Luas Lingkaran = " + lingkarang.getLuas()));
        break;
            case 4 :
        Elips elips = new Elips();
        System.out.println(("1.keliling/2.luas"));
        pilihan = input.nextInt();
        if(pilihan == 1){
            System.out.println("Keliling Elips = " + elips.getkelling());
        }else
            System.out.println(("Luas Elips = " + elips.getLuas()));
        break;
        }   
    }
    
}
