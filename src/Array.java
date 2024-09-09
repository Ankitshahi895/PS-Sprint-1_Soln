public class Array {
    static void largestSmallest(int arr [])
    {
        int n = arr.length;
        int largest = arr[0];
        int smallest = arr[0];
        for(int i = 0; i < n; i++)
        {
            if(arr[i] > largest)
            {
                largest = arr[i];
            }
            if(arr[i] < smallest)
            {
                smallest = arr[i];
            }
        }
        System.out.println(largest +" is largest");
        System.out.println(smallest +" is smallest");
    }

    public static void main(String[] args)
    {
        int[] arrr = {78 , 15 , 34 , 21 , 99};
        largestSmallest(arrr);
    }
}
