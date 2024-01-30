package M15;
import java.util.Scanner;
import java.util.InputMismatchException;

class M15_2{
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        try{
            System.out.print("整数を入力 =");
            int x = stdIn.nextInt();
            if(x % 2 == 0){
                System.out.println(x + "は偶数");
            }else{
                System.out.println("は奇数" );
            }
        }
               
        catch (ArithmeticException e) {
            System.out.println("整数と認識できません!");
        }
    }
}
