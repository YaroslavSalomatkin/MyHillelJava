package Lesson_02;

import java.math.BigDecimal;
import java.util.Scanner;

public class BankDeposit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter sum of Your deposit: ");
        BigDecimal deposit = scanner.nextBigDecimal();
        //int deposit = 11000;
        System.out.print("Enter duration of deposit: ");
        int durationOfContribution = scanner.nextInt();
        //int durationOfContribution = 15;
        System.out.print("Enter annual interest rate: ");
        double annualInterestRate = scanner.nextDouble();
        annualInterestRate /= 100;
        //int annualInterestRate = 20;

        BigDecimal depositInYear = deposit;
        BigDecimal percentSumMoneyInYear = new BigDecimal(0);
        System.out.println("Your deposit " + deposit + ", duration " + durationOfContribution + " years, percent = " + annualInterestRate);
        System.out.println("\nYear\tpercent\t\t   Total Sum");
        for (int count = 1; count <= durationOfContribution; count++) {
            percentSumMoneyInYear = depositInYear.multiply(BigDecimal.valueOf(annualInterestRate));
            System.out.println(count + "\t \t" + String.format("%(.2f", percentSumMoneyInYear) + "\t\t\t" + (depositInYear.add(percentSumMoneyInYear)));
            depositInYear = depositInYear.add(percentSumMoneyInYear);
        }
    }
}
