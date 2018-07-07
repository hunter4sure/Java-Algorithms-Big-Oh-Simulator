import helpers.Helper;

public class Algorithms
{


    //implementing bubble Sort Algo
    public static void bubbleSort(int[] data)
    {

        for(int i = data.length -1; i > 0; i--)
        {
            for(int j = 0; j < i; j ++)
            {
                if(data[j] > data[j +1])
                {
                    Helper.Swap(data, j , j+1);
                }
            }
        }
    }

    public static  void insertionSort(int[] data)
    {

    }

    public static  void SelectionSort(int[] data)
    {

    }
}
