import java.util.Scanner;

public class IT24102369Lab5Q3 
{
    public static void main(String[] args)
   {
        Scanner input = new Scanner(System.in);

        int no_of_days, start_date, end_date;
        double rate_per_day = 48000;

        System.out.print("Enter Start Date (1-31): ");
        start_date = input.nextInt();

        System.out.print("Enter End Date (1-31): ");
        end_date = input.nextInt();

        if (start_date < 1 || start_date > 31 || end_date < 1 || end_date > 31) {
            System.out.println("Error: Days must be between 1 and 31");
        }

            if (start_date >= end_date) {
            System.out.println("Error: Start Date must be less than End Date");
            return;
        }

        no_of_days = end_date - start_date;

        System.out.println("Room Charge Per Day: Rs " + rate_per_day);
        System.out.println("Number of Days Reserved: " + no_of_days);

        double totalAmount;
        if (no_of_days < 3) {
            totalAmount = rate_per_day * no_of_days;
        } else if (no_of_days <= 4) {
            totalAmount = rate_per_day * no_of_days * 0.9; // 10% discount
        } else {
            totalAmount = rate_per_day * no_of_days * 0.8; // 20% discount
        }

        System.out.println("Total Amount to be Paid: Rs " + totalAmount);
    }
}