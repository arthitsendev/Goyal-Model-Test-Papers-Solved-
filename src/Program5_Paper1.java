import java.util.*;
class Program5_Paper1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int P[]=new int[6],Q[]=new int[4],R[]=new int[10],i;
        for(i=0;i<6;i++) {
            P[i]=sc.nextInt();
        }
        for(i=0;i<4;i++) {
            Q[i]=sc.nextInt();
        }
        for(i=0;i<10;i++) {
            if(i<6) {
                R[i]=P[i];
            }
            else {
                R[i]=Q[i];
            }
        }
        for(i=0;i<10;i++) {
            System.out.print(R[i]+" ");
        }
    }
}
