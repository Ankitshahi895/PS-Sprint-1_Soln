public class EvenRan {
    static int evenR(int s , int e)
    {
        int sum = 0;
        for(int i = s; i <= e; i++)
        {
            if(i % 2 == 0)
            {
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(evenR(1 , 10));
    }
}
