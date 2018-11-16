public class InPlaceSorts {
    public static void insertionSort(int[] list1)
    {

    }
    public static void selectionSort(double[] list1)
    {
        double temp = 0;
        double temp1 = 0;
        for (int i=0; i < list1.length; i++)
        {
            temp =i;
            temp1 = list1[i];
            for ( int x = 0; x < list1.length; x++)
            {
                if( list1[x] < temp)
                {
                    temp1 = x;
                    temp = list1[x];
                }
                list1[temp] = list1[i];
                list1[i] = temp;
            }
        }
    }
    public static void bubbleSort(String[] list1)
    {

    }
}
