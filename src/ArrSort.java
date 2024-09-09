public class ArrSort {
    static void bubbleSort(int [] arr)
    {
        int n = arr.length;
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < n - i -1; j++)  //time complexity nearly : O(n^2)
            {
                if (arr[j] > arr[j + 1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int [] arr = {3, 1, 4, 1, 5, 9};
        bubbleSort(arr);
        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i]+ " ");
        }

    }
}
