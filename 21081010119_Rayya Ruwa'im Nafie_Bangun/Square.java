package Bangun;

public class Square {
    double sisi = 8;
    double luas;

    Square(double sisi){
        this.sisi = sisi;
    }
Square(){}
    double getLuas() {
        luas = sisi*sisi;
    return luas;
}
    double getkelling(){
        double keliling = 4*sisi;
        return keliling;
    }
}

