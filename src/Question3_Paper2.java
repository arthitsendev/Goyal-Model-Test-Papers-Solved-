import java.util.*;
class Question3_Paper2 {
    int acc_num=0;
    String title=new String(),author=new String();
    void input() {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the accession number and name of the book and author=");
        acc_num=sc.nextInt();
        author=sc.nextLine();
        title=sc.nextLine();
    }
    void compute() {
        Scanner sc=new Scanner(System.in);
        int days,amt;
        System.out.print("Enter the number of days late=");
        days=sc.nextInt();
        amt=days*2;
        System.out.print("Fine charged="+amt);
    }
    void display() {
        System.out.println("Accession number "+"Title "+"Author");
        System.out.print(acc_num+" "+title+" "+author);
    }
    public static void main(String[] args) {
        Question3_Paper2 ob=new Question3_Paper2();
        ob.input();
        ob.compute();
        ob.display();

    }
}
