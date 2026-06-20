import java.util.*;

public class FinancialForecast {

    static double futureValueRecursive(double amount, double rate, int years) {
        if (years == 0)
            return amount;

        return futureValueRecursive(amount * (1 + rate), rate, years - 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double amount = sc.nextDouble();
        double rate = sc.nextDouble() / 100;
        int years = sc.nextInt();

        double recursive = futureValueRecursive(amount, rate, years);

        double iterative = amount;
        for (int i = 0; i < years; i++) {
            iterative = iterative * (1 + rate);
        }

        double formula = amount * Math.pow(1 + rate, years);

        System.out.println("Recursive Future Value: " + recursive);
        System.out.println("Iterative Future Value: " + iterative);
        System.out.println("Formula Future Value: " + formula);

        sc.close();
    }
}