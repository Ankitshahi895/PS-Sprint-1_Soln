import java.util.Scanner;
public class Prime {
    static void Pri(int n)
    {
        int cnt = 0;
        for(int i = 1; i * i <= n; i++) {
            if(n % i == 0){
                cnt += 1;
                if(n / i != i)
                {
                    cnt += 1;
                }
            }
        }
        if(cnt == 2){
            System.out.println(n +" is a prime number.");
        }
        else{
            System.out.println(n +" is not a prime number.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;
        System.out.print("Enter  your number : ");
        x = sc.nextInt();
        Pri(x);
    }
}
