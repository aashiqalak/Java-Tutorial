import java.util.*;
public class Revers {
    public static void main(String[] args) {
        System.out.println("Enter the length:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter element in array:");
        for(int i=0; i<arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("Array value is:");
        for(int i=arr.length-1; i>=0; i--) {
            System.out.print(arr[i]+" ");
        }
    }
}
