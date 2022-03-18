import java.util.*;
class Program3_Paper1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int wgt[]=new int[10],i,p,j,t;
        System.out.println("enter the weights of ten people=");
        for(i=0;i<10;i++) {
            wgt[i]=sc.nextInt();
        }
        for(i=0;i<9;i++) {
            p=i;
            for(j=i+1;j<10;j++) {
                if(wgt[j]>wgt[p]) {
                    p=j;
                }
                t=wgt[p];
                wgt[p]=wgt[i];
                wgt[i]=p;
            }
        }
        for(i=0;i<10;i++) {
            System.out.print(wgt[i]+" ");
        }
    }
}
