
import java.util.Arrays;
import java.util.Scanner;
public class J18_DSA_BobbleSort {
    public static int [] accendingsortusingBubble(int[] a){
        for(int i=0; i<a.length-1; i++){
            for(int j=0; j<a.length-1-i; j++ ){
                if(a[j]>a[j+1]){
                    int temp = a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;

                }
            }
        }
        return  a;
    }

    public static int [] decendingsortusingBubble(int [] a){
        for(int b=0;b<a.length-1; b++){
            for(int c=0; c<a.length-1-b; c++){
                if(a[c]<a[c+1]){
                    int temp= a[c];
                    a[c]=a[c+1];
                    a[c+1]=temp;
                }
            }
        }
        return a;
    }
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int a[] = {12,89,26,54,12,56,76,98,98,0,34,67};

        System.out.println("chose on and type : accesnding , decending ");
        String check = sc.next();
        if(check.equals("accending"))
        {
            int [] asc = accendingsortusingBubble(a);
            System.out.println(" accending"+Arrays.toString(asc));
        }else if(check.equals("decending"))
        {
            int [] dsc = decendingsortusingBubble(a);
            System.out.println("decending : "+Arrays.toString(dsc));
        }else
        {
            System.out.println("enter a valid data ");
        }
        sc.close();
    }
}