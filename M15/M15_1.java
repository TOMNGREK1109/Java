package M15;
import java.util.Scanner;

class M15_1{
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        try{
            System.out.print("整数1 = ");
            int x = stdIn.nextInt();
    
            System.out.print("整数2 = ");
            int y = stdIn.nextInt();
        
            System.out.println("x / y =" + (x / y)); 
            System.out.print("処理終了");
        }
        
        
        catch (ArithmeticException e) {
            System.out.println("0による割り算です!!" );
            System.out.println("処理終了");
        }
    }
}
