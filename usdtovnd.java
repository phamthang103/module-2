package hienthiloichao;
import java.util.Scanner;
public class usdtovnd {
    public static void main(String[] args) {
        final int RATE = 23000;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter usd ");
        int usd = Integer.parseInt(scanner.nextLine());
        int vnd = usd*RATE;
        System.out.println("  VND : "+ vnd );
    }
}
