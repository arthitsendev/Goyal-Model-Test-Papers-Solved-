import java.util.*;
class Question5_Paper2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]={5,7,9,12,15,25,30,45,89,98},i,l,u,m,n,f=0,p=0;
        l=0;
        u=9;
        m=(l+u)/2;
        System.out.print("Enter the number to search=");
        n=sc.nextInt();
        for(i=l;i<u;i++) {
            if(n<arr[m]) {
                u=m;
            }
            if(n>arr[m]) {
                l=m;
            }
            if(n==arr[m]) {
                f=1;
                p=i;
            }
        }
        if(f==1) {
            System.out.print("Element= "+arr[p]+"Position="+p);
        }
        else {
            System.out.print("Search element not found");
        }
    }
}
