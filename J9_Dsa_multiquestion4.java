/*4. 2D Array / Matrix
Write a Java program to perform the following operations on two matrices:
Matrix addition
Matrix subtraction
Matrix multiplication
Transpose of a matrix
Find the sum of diagonal elements
*/


public class J9_Dsa_multiquestion4 {
    public static void main(String[] args) {

        // Matrix addition
        /*int [][] num1 = {
            {1,2,3,4},
            {5,6,7},
            {8,9},
            {0}
        };
         int [][] num2 = {
             {0},
             {8,9},
             {5,6,7},
            {1,2,3,4}
        };

        int row = Math.max(num1.length,num2.length);
        int arr[][]= new int[row][];

        // int col = num1.length-1;

        for (int i = 0; i < row; i++) {
            int cols = Math.max(i<num1.length?num1[i].length:0, i<num2.length?num2[i].length:0);
            arr[i] = new int[cols];
            for (int j = 0; j <cols; j++) {
                int a = (i <num1.length && j<num1[i].length)? num1[i][j]:0;
                int b = (i <num1.length && j<num1[i].length)? num1[i][j]:0;
                arr[i][j]= a+b;
            }
        }

        for(int a=0; a<arr.length; a++)
        {
            for (int i = 0; i <arr[a].length; i++) {
                System.out.print(arr[a][i]+" ");
            }
            System.out.println();
        }*/

        // Matrix subtraction
        int a [][]={{24,534,645,756},{432,34,645,7560}};
        int b [][]={{432,43,243,53},{232,5343,564,765}};

        int sub[][]=new  int[2][4];

        for (int i = 0; i < a.length-1; i++) {
            for (int j = 0; j < b.length-1; j++) {
                sub[i][j]=a[i][j]-b[i][j];
            }
        }
        for (int i = 0; i < sub.length; i++) {
            System.out.println(sub[i]);
        }
    }
}
