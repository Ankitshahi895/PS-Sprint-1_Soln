import java.awt.desktop.SystemEventListener;
import java.util.Scanner;
public class Leap {
    static void leap(int n)
    {
        if(n % 4 == 0 && n % 100 != 0 || n % 400 == 0 )
        {
            System.out.println(n +" is a leap year");
        }
        else
        {
            System.out.println(n + " is not a leap year");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year;
        System.out.print("Enter the year :");
        year = sc.nextInt();
        leap(year);
    }
}
