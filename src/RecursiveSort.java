public class RecursiveSort {
    public int partition( int [] arr, int left, int right)
    {
        int temp = 0;
        int pivot = arr[right];
        int i = left - 1;
        for(int j=0;j<right;j++)
        {
            if (arr[j]<= pivot)
            {
                i++;
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        temp = arr[i+1];
        arr[i+1] = arr[right];
        arr[right]=temp;
        return (i+1);
    }
}
