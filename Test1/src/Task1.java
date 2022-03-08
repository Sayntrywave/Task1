import java.util.HashSet;
import java.util.Scanner;

public class Task1 {
    public static String convertNumberToNumeralSystem(int n, int ns){
        if (ns < 0){
            System.out.printf("Система счисления не может быть отрицательной (%d<0)",ns);
            return "stop";
        }
        StringBuilder convertedNumber = new StringBuilder();
        while (n != 0){
            if (n % ns > 9){
                convertedNumber.insert(0, (char) (n%ns + 55));
            }
            else {
                convertedNumber.insert(0, n % ns);
            }
            n /=ns;
        }
        return convertedNumber.toString();
    }
    public static int getN(){
        System.out.print("Введите число: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
    public static int getNS(){
        System.out.print("Введите систему счисления: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    } //numeral system
    public static void main(String[] args) {
        int n = getN();
        int ns = getNS();
        System.out.println("Число "+ n + " в системе счисления "+ ns + ": "+ convertNumberToNumeralSystem(n, ns));
    }
}

