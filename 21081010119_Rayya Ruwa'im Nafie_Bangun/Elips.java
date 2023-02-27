package Bangun;

public class Elips {
    double radius1 = 7;
    double radius2 = 10;
    final double pi = 3.14;
    double luas;

    Elips(double radius1,double radius2){
        this.radius1 = radius1;
        this.radius2 = radius2;
    }
    Elips(){}
    double getLuas() {
        luas = pi*radius1*radius2;
    return luas;
    }
    double getkelling(){
        double keliling = pi*(radius1+radius2);
        return keliling;
    }

}
