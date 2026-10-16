// Sliding window
// Prefix sum
// Frequency counting
public class J12_Dsa_slidingwindows {
    public static void main(String [] args)
    {
        int [] arr = {2,3,6,8,2,8,4};
        int k = 3 ; 

        int windowSum = 0;

        for(int i=0; i<k;i++)
        {
            windowSum +=arr[i];
        }
        int maxsum = windowSum;
        for(int a =k; a<arr.length; a++)
        {
            windowSum +=arr[a];
            windowSum -= arr[a-k];

            maxsum = Math.max(maxsum, windowSum);
        }
        System.out.println(maxsum);
    }
}
