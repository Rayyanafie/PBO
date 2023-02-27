package Bangun;

public class Circle {
    final double pi = 3.14;
    double diameter = 14;
    double luas;

    Circle(double diameter){
        this.diameter = diameter;
    }
    Circle(){}
    double getLuas() {
        luas = pi*(diameter/2)*(diameter/2);
    return luas;
}
    double getkelling(){
        double keliling = pi*diameter;
        return keliling;
    }
}

