package com.company;

public class InsertionSort {

    void sort (String[] arr)
    {
        for (int i = 1; i <arr.length; i++)
        {
            String key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j].compareTo(key) > 0)
            {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }

    static void printArray(String[] arr)
    {
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + ", ");
        }
        System.out.println();
    }

    public static void main(String[] args)
    {
        String[] arr = {"a", "c", "e", "d", "b"};

        InsertionSort is = new InsertionSort();
        printArray(arr);
        is.sort(arr);
        printArray(arr);
    }
}
