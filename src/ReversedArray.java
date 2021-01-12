public class ReversedArray {
    public static int myReverse(int [] array)
    {
        for (int i = array.length - 1; i >= 0; i--)
        {
            System.out.print(" " + array[i]);
        }
        return array[array.length - 1];
    }

    public static int [] subArray(int [] array, int index, int count)
    {
        for (int i = index; i <= count; i++)
        {
            if(count > (array.length - index))
            {
                int [] newArray = new int[count];
                System.arraycopy(array, index, newArray,array[index],count);
                for (int j = 0; j < newArray.length; j++)
                {
                    
                    System.out.println(newArray[j] + " ");
                }
                return newArray;
            }
            else
            {
                System.out.println(array[i] + " ");
            }
        }
        return array;
    }

    public static void main(String[] args)
    {
        int[] arrayReverse = {2,4,1,3,5,6};
        myReverse(arrayReverse);

        int index = 3, count = 5;
        subArray(arrayReverse, index, count);
    }
}
