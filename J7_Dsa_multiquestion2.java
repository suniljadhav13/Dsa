/*Write a Java program to search for an element in an array using:
Linear Search
Binary Search
Also print the position of the element if found, otherwise print "Not Found". */

import java.util.Scanner;
public class J7_Dsa_multiquestion2 {
    public static  void main(String [] arg) 
    {
        // int arr []= {12,43,76,34,98,87,34,65,18};

        // Scanner sc = new Scanner(System.in);
        // System.out.println("enter serching number : ");
        // int target = sc.nextInt();

        //1
        /*int index = 0;
        boolean check = false;
        for(int p=0; p<arr.length; p++)
        {
            if(arr[p] == target)
            {
                check = true;
                index = p;
                break;
            }
        }
        if(check)
        {
            System.out.println("element found :"+ target);
            System.out.println("index is : "+index);   // position on the finf from 0 index
        }
        else
        {
            System.out.println("element are not found");
        }*/

        //2
        
        int arr []= {12,43,76,34,98,87,34,65,18};

        Scanner sc = new Scanner(System.in);
        System.out.println("enter serching number : ");
        int target = sc.nextInt();
        for(int a=0; a<arr.length -1; a++) {
            for(int b=0; b<arr.length -1; b++)
            {
                if(arr[b]>arr[b+1])
                {
                    int temp = arr[b];
                    arr[b]= arr[b+1];
                    arr[b+1] = temp;
                }
            }
        }
        System.out.println("sorted array ");
        for(int a=0; a<arr.length; a++)
        {
            System.out.println(arr[a]);
        }

        int low = 0, high = arr.length-1;
        boolean found = false;
        int binary_index = -1;

        while(low <= high)
        {
            int mid = (low + high)/2;

            if(arr[mid] == target)
            {
                found = true;
                binary_index = mid;
                break;
            }
            else if(target < arr[mid]){
                high = mid -1;
            }
            else{
                low = mid + 1;
            }
        }
        if(found)
        {
            System.out.println("element is :"+ target);
            System.out.println("found index is "+binary_index);
            System.out.println("found position is : "+(binary_index - 1));
        }
        else{
            System.out.println("element are not found ");
        }
        sc.close();
    }
}
