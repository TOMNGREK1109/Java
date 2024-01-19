package M11;

public class Square {
    int r;
    double PI = 3.1415;
    public Square(int r){
        this.r = r;
    }
    //円周
    double en(){
        return PI * r * 2;
    }
    //面積
    double mn(){
        return r * r * PI;
    }
}
