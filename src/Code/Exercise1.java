package Code;

import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Scanner;


public class Exercise1{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a short date (YYYY-MM-DD): ");
        String inputDate = scanner.nextLine();

        String[] dateParts = inputDate.split("-");
        int year = Integer.parseInt(dateParts[0]);
        int month = Integer.parseInt(dateParts[1]);
        int day = Integer.parseInt(dateParts[2]);

        String[] monthNames = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        String monthName = "";
        if (month >= 01 && month <= 12) {
            monthName = monthNames[month - 1];
        } else {
            System.out.println("Invalid month value.");
            return;
        }

        LocalDate date = LocalDate.of(year, month, day);
        if (date.isAfter(LocalDate.now())) {
            System.out.println("Invalid date value.");
            return;
        }

        System.out.println("Full date representation: " + monthName + " " + day + ", " + year);
    }

    }
//    public static void main([] args) {

