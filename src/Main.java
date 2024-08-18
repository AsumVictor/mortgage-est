import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        System.out.println("Monthly instalment of mortgage calculator ");

        long principal;
        float anualRate;
        byte numberOfYears;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Principal value of the loan");
        principal = (long)scanner.nextLong();
        System.out.println(NumberFormat.getCurrencyInstance().format(principal));
    }
}