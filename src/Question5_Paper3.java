import java.util.*;
class Question5_Paper3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int marks[]=new int[40],i,j,t;
        System.out.print("Enter the marks of 40 students=");
        for(i=0;i<40;i++) {
            marks[i]=sc.nextInt();
        }
        for(i=0;i<39;i++) {
            for(j=0;i<39-i;j++) {
                if(marks[j]<marks[j+1]) {
                    t=marks[j];
                    marks[j]=marks[j+1];
                    marks[j+1]=t;
                }
            }
        }
        for(i=0;i<39;i++) {
            System.out.print(marks[i]+" ");
        }
    }
}
