import java.util.*;
class Question7_Paper3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[20],i,l=0,s=0,sum=0;
        System.out.print("Enter 20 integers= ");
        for(i=0;i<20;i++) {
            arr[i]=sc.nextInt();
        }
        for(i=0;i<20;i++) {
            if(arr[i]>l) {
                l=arr[i];
            }
            if(arr[i]<s) {
                s=arr[i];
            }
            sum=sum+arr[i];
        }
        System.out.println("Largest number="+l);
        System.out.println("Smallest number="+s);
        System.out.println("Sum of all the elements in the array="+sum);
    }
}
