public class MedianArr {
    static int median(int[] arr)
    {
        int n = arr.length;
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < n - i -1; j++)
            {
                if(arr[j] > arr[j + 1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        if(n % 2 == 1)
        {
            return arr[n / 2];
        }
        else
        {
            return (arr[n / 2 -1] + arr[n / 2]) / 2;
        }
    }

    public static void main(String[] args) {
        int[] arr = {3, 1, 2, 4, 5};
        System.out.println(median(arr));
    }
}
