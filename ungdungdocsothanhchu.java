package hienthiloichao;
import java.util.Scanner;
public class ungdungdocsothanhchu {
    static String tuKhongToiMuoi(int number){
        String convertNumberToLetter = "";
        switch (number) {
            case 0:
                convertNumberToLetter = "zezo";
                break;
            case 1:
                convertNumberToLetter = "one";
                break;
            case 2:
                convertNumberToLetter = "Two";
                break;
            case 3:
                convertNumberToLetter = "Three";
                break;
            case 4:
                convertNumberToLetter = "Four";
                break;
            case 5:
                convertNumberToLetter = "Five";
                break;
            case 6:
                convertNumberToLetter = "Six";
                break;
            case 7:
                convertNumberToLetter = "Seven";
                break;
            case 8:
                convertNumberToLetter = "Eight";
                break;
            case 9:
                convertNumberToLetter = "Nine";
                break;
            case 10:
                convertNumberToLetter = "Ten";
                break;
            default:
                convertNumberToLetter = "";
        }
        return convertNumberToLetter;
    }
    static  String tuMuoiMotToiMuoiChin(int number){
        String convertNumberToLetter = "";
        switch (number) {
            case 1:
                convertNumberToLetter = "eleven";
                break;
            case 2:
                convertNumberToLetter = "twelve";
                break;
            case 3:
                convertNumberToLetter = "thirteen";
                break;
            case 4:
                convertNumberToLetter = "fourteen";
                break;
            case 5:
                convertNumberToLetter = "fifteen";
                break;
            case 6:
                convertNumberToLetter = "sixteen";
                break;
            case 7:
                convertNumberToLetter = "seventeen";
                break;
            case 8:
                convertNumberToLetter = "eighteen";
                break;
            case 9:
                convertNumberToLetter = "nineteen";
                break;
            default:
                convertNumberToLetter = "";
        }
        return convertNumberToLetter;
    }
    static  String soHangChuc(int number){
        String convertNumberToLetter = "";
        switch (number/10) {
            case 2:
                convertNumberToLetter = "twenty";
                break;
            case 3:
                convertNumberToLetter = "thirty";
                break;
            case 4:
                convertNumberToLetter = "forty";
                break;
            case 5:
                convertNumberToLetter = "fifty";
                break;
            case 6:
                convertNumberToLetter = "sixty";
                break;
            case 7:
                convertNumberToLetter = "seventy";
                break;
            case 8:
                convertNumberToLetter = "eighty";
                break;
            case 9:
                convertNumberToLetter = "ninety";
                break;
            default:
                convertNumberToLetter = "";
        }
        return convertNumberToLetter;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        do {
            System.out.println(" nhap so tu 0 den 999");
            number=scanner.nextInt();
            if (number<0||number>999){
                System.out.println(" da nhap so tu 0 den 999");
            }
        }while (number<0||number>999);
        String chuoi;
        if (number<=10){
            System.out.println(tuKhongToiMuoi(number));
        }else if (number<20){
            System.out.println(tuMuoiMotToiMuoiChin(number));
        }else if (number<100){
            chuoi= soHangChuc(number)+" "+tuKhongToiMuoi(number%10);
            System.out.println(chuoi);
        }else{
            if (number %100 > 19){
                chuoi= tuKhongToiMuoi(number/100) +" hundred and " +soHangChuc(number % 100)+" "+ tuKhongToiMuoi(number%10);
                System.out.println(chuoi);
            }else if (number %100 >10){
                chuoi= tuKhongToiMuoi(number/100) +" hundred and " +soHangChuc(number % 100);
            }else {
                chuoi= tuKhongToiMuoi(number/100) +" hundred and "+ tuKhongToiMuoi(number%10);
            }
            System.out.println(chuoi);
        }
    }
}
