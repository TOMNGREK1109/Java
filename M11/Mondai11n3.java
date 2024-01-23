package M11;

class FA {
    static int x;
    static int y;
    FA(int x, int y) {this.x = x; this.y = y;}
    void setX(int x) {this.x = x;}
    void setY(int y) {this.y = y;}
    int getX() { return x; }
    int getY() { return y; }
}

public class Mondai11n3 {
    public static void main(String[] args) {
        int x =100;
        int y =200; 
        int sum = 0;
        for (int i = x; i <= y; i++){
            sum = sum + i;
        }

        System.out.println(x + "から" + y +"までの合計値は"+ sum +"です。" );
    }
}