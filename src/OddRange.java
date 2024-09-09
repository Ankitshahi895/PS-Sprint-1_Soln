public class OddRange
{
        static int oddR(int s , int e)
        {
            int sum = 0;
            for(int i = s; i <= e; i++)
            {
                if(i % 2 != 0)
                {
                    sum += i;
                }
            }
            return sum;
        }

        public static void main(String[] args) {
            System.out.println(oddR(1 , 10));
        }

}
