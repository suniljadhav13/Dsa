/*3. Sorting and Duplicates
Write a Java program to:
Sort an array in ascending order without using Arrays.sort()
Find duplicate elements
Remove duplicate elements
Print the second-largest element */

public class J8_Dsa_multiquestion3 {
    public static void main(String [] arg)
    {
        int arr []= {12,43,76,34,98,87,34,65,18,43};
        int size = arr.length;
        // 1
        /*for(int a=0; a<arr.length; a++)
        {
             for(int b=0; b<arr.length-1; b++)
            {
                if(arr[b]>arr[b+1])
                {
                    int temp = arr[b];
                    arr[b]= arr[b+1];
                    arr[b+1]= temp;
                }
            }
        }
        System.out.println("accending sorted arrar ");
        for(int a : arr)
        {
            System.out.println(a +" ");
        }*/

        // 2
        int duplicate = 0;
        for(int a=0; a<size-1; a++)
        {
            for(int b=a+1; b<size; b++)
            {
                if(arr[a] == arr[b])
                {
                    // System.out.println("duplicate found : "+arr[a]);  //if multiple then directly print here 
                    duplicate = arr[a];
                    break;
                }
            }
        }
        System.out.println("duplicate found : "+duplicate);

        //3
        for(int a=0; a<size - 1; a++)
        {
            for(int b=a+1; b<size; b++)
            {
                if(arr[a] == arr[b])
                {
                    int duplicate2 = arr[b];
                    for(int c = b;c<size-1; c++)
                    {
                        arr[c]=arr[c+1];
                    }
                    arr[size-1]=duplicate2;
                    size --;
                    b--;
                }
            }
        }
        System.out.println(" after opration");
        for(int a : arr)
        {
            System.out.println(a);
        }

        // 4
        int largest = arr[0];
        int sec_largest = arr[1];

        if(sec_largest>largest)
        {
            int temp = largest;
            largest = sec_largest;
            sec_largest = temp;
        }

        for(int a=2; a<size-1; a++)
        {
            if(arr[a]>largest)
            {
                sec_largest = largest;
                largest = arr[a];
            }
        }
        System.out.println("largest : "+largest);
        System.out.println("sec_largest : "+sec_largest);
    }
}

