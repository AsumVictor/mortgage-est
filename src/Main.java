import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        System.out.println("Monthly instalment of mortgage calculator ");

        long principal;
        float anualRate;
        byte numberOfYears;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Principal value of the loan: ");
        principal = (long)scanner.nextLong();

        System.out.print("What is the annual rate: ");
        anualRate = (float) scanner.nextFloat();

        System.out.print("What is the number of years to pay: ");
        numberOfYears = scanner.nextByte();

        float compute = bracket(anualRate, numberOfYears);
        float num = numerator(compute, anualRate);
        float deno = denomerator(compute);

        float answer = principal * (num / deno);

        System.out.println("You will pay a mortgage of " + NumberFormat.getCurrencyInstance().format(answer) + " every month");

        // System.out.println(NumberFormat.getCurrencyInstance().format(principal));
    }


    public static float bracket(float rate, byte numOfYears){
         float sum = 1 + (rate / (100 * 12));
         sum = (float) Math.pow(sum, numOfYears * 12);

         return sum;

    }

    public static float numerator(float sum, float rate){
        return sum * (rate / (100 * 12));
    }

    public static float denomerator(float sum){
        return sum - 1;
    }

}