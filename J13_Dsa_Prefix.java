import java.util.Arrays;

public class J13_Dsa_Prefix {
    public static void main(String[] args) {
        
        int arr[]={34,32,23,53,62,35,63,25,15,43};


        int prefix[]= new int[arr.length];
        prefix[0]= arr[0];
        for(int i=1; i<arr.length; i++)
        {
            prefix[i] = prefix[i-1]+arr[i];
        }
        // prefix becomes: [34, 66, 89, 142, 204, 239, 302, 327, 342, 385]
        System.out.println(Arrays.toString(prefix));
        System.err.println(prefix);

        // printing the addition of the index 2 to 7 i in arr 
        int sum = prefix[7]- prefix[2];    //327 -89   -> 53,62,35,63,25 =238
        System.out.println("Sum : "+sum);
    }
}