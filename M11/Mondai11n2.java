package M11;

//import java.util.Scanner;


class FA {
    static int x;
    static int y;
    FA(int x, int y){ this.x = x; this.y = y;}
    void setX(int x) {this.x = x;}
    void setY(int y) {this.y = y;}
    int getX() { return x; }
    int getY() { return y; }
}

class DS  {
    public static void main(String args[]){
        int sum = 100;
        FA a = new FA(100, 200); 
        for (int i = 100; i < 201; i++){
            sum = sum + i;
        }

        System.out.println(FA.x + "から" + FA.y +"までの合計値は"+ sum +"です。" );
    }
//    int z;
 //   DS(int x, int y, int z) {super(x, + y); this.z = z;}
   // void setZ(int z) { this.z = z;} 
    //int getZ() { return z;}
}

//public class Mondai11n2 {
 //   public static void main(String[] args) {
   //     FA a = new FA(100, 200);
   //     System.out.printf(" (%d) から (%d) までの合計値は()です。(\n", a.getX(), a.getY());
   //     //System.out.println("100から200までの合計値は15150です。");
  //  }
//}

