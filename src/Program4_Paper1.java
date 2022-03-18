import java.util.*;
class Program4_Paper1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i,n,c=0;
        System.out.print("Enter the number of values you want to enter=");
        n=sc.nextInt();
        System.out.print("Enter the numbers=");
        int a[]=new int[n],b[]=new int[n];
        for(i=0;i<n;i++) {
            a[i]=sc.nextInt();
        }
        for(i=n-1;i>=0;i--) {
            b[c++]=a[i];
        }
    }
}
