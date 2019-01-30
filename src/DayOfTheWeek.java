import java.util.Scanner;

public class DayOfTheWeek {
    public static void main(String[] args)   {
        Scanner input = new Scanner(System.in);

        System.out.print(
                "Enter the year: "
        );
        int year = input.nextInt();

        System.out.print(
                "Enter the month from 1 - 12: Where Marts is 3 and december is 12, january and february is 1 nd 2 of the previous: "
        );
        int m = input.nextInt();
        
        if (m <= 2) {
            if (m == 1) {
                year--;
                m = 13;
            } else {
                year--;
                m = 14;
            }
        }

        System.out.print(
                "Enter the day of the month: "
        );
        int q = input.nextInt();

        int k = year%100;

        int j = year/100;

        int h = (q + (26*(m+1)/10) + k + k/4 + j/4 + 5*j)%7;

        System.out.print(h+"\n");

        switch(h)   {
            case 0: System.out.print(
                    "The day is Saturday"
            );
            break;
            case 1: System.out.print(
                    "The day is Sunday"
            );
            break;
            case 2: System.out.print(
                    "The day is Monday"
            );
            break;
            case 3: System.out.print(
                    "The day is Tuesday"
            );
            break;
            case 4: System.out.print(
                    "The day is Wednesday"
            );
            break;
            case 5: System.out.print(
                    "The day is Thursday"
            );
            break;
            case 6: System.out.print(
                    "The day is Friday"
            );
            System.exit(1);
        }
    }
}
