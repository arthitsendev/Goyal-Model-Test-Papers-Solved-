import java.util.*;
class Question6_Paper3 {
    String name;
    int age,m1,m2,m3,maximum,average;
    Question6_Paper3() {
        name="";
        age=0;
        m1=0;
        m2=0;
        m3=0;
        maximum=0;
        average=0;
    }
    void accept() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name, marks in 1st, 2nd and 3rd subject respectively=");
        name=sc.nextLine();
        m1=sc.nextInt();
        m2=sc.nextInt();
        m3=sc.nextInt();
    }
    void compute() {
        int max1,max2;
        average=(m1+m2+m3)/3;
        max1=Math.max(m1,m2);
        max2=Math.max(m1,m3);
        maximum=Math.max(max1,max2);
    }
    void display() {
        System.out.print("Name= "+name+"Age= "+age+"Marks in 1st subject= "+m1+"Marks in 2nd subject= "+m2+"Marks in 3rd subject= "+m3+"Maximum marks= "+maximum+"Average marks= "+average);
    }
    public static void main(String[] args) {
        Question6_Paper3 ob=new Question6_Paper3();
        ob.accept();
        ob.compute();
        ob.display();
    }
}
