package M11;
import java.util.Scanner;

public class Mondai11n1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("半径を整数値で入力:");
        int r = scanner.nextInt();
        Square square = new Square(r);
        double en = square.en();
        double mn = square.mn();
        System.out.printf("円周の長さは %.3f です。\n",en);
        System.out.printf("円の面積は %.3f です。\n",mn);
    }
}