import java.util.*;
import java.sql.SQLOutput;

public class EvenOdd {
    static void Even(int n)
    {
        int even = 0;
        int odd = 0;
        if(n % 2 == 0)
            System.out.println(n +" is Even Number");
        else
            System.out.println(n +" is Odd Number");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number :");
        int x = sc.nextInt();
        Even(x);
    }
}
