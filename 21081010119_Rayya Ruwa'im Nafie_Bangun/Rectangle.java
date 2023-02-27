package Bangun;

public class Rectangle {
    double panjang = 8;
    double lebar = 4;
    double luas;

    Rectangle(double panjang,double lebar){
        this.panjang = panjang;
        this.lebar = lebar;
    }
    Rectangle(){}
    double getLuas() {
        luas = panjang*lebar;
    return luas;
}
    double getkelling(){
        double keliling = 2*(panjang+lebar);
        return keliling;
    }
}

