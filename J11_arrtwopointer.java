// Find whether two numbers add up to 10
// like 4+6 = 10

import java.util.Arrays;

public class J11_arrtwopointer {
    public static void main(String [] arg)
    {
        int arr[] = {3,4,6,2,9,1,7};
        int target = 10;
        int left = 0, right = arr.length-1;

        while(left < right)
        {
            int sum = arr[left]+arr[right];
            if(sum == target)
            {
                System.out.println("values are found : "+arr[left ]+" , "+ arr[right]);
                left++;
                right--;
            }
            else if(sum<target)
            {
                left ++;
            }
            else
            {
                right--;
            }
        }

        System.out.println(Arrays.toString(arr)); // this is also work as a for loop 
    }   
}
