import java.util.Arrays;
import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // int[] arr = new int[5];

        // arr[0] = 45;
        // arr[1] = 25;
        // arr[2] = 85;
        // arr[3] = 75;
        // arr[4] = 65;

        // System.out.println(arr[3]);

        // arr[3] = 90;

        // System.out.println(arr[3]);

        // int[] arr1 = {1,2,3,4,5,6,7,8};
        // System.out.println(arr1[3]);

        // int[] arr2 = new int[4];
        // System.out.println(arr2[2]); // by default java gives the 0 

        // input Array

        // for(int i =0; i<arr.length; i++){
        //     arr[i] = in.nextInt();
        // }
        // for(int i=0; i<arr.length; i++){
        //     System.out.print(arr[i]+ " ");
        // }
        // System.out.println();
     String[] str = new String[5];
     for(int i=0; i<str.length; i++){
        str[i] = in.nextLine();
     }
     System.out.println(Arrays.toString(str));
    //  str[0] = "Arman";
    //  System.out.println(str[0]);

    //  str[0] = "Khan";
    //  System.out.println("Change The Array:" +str[0]);
 

    }
}
