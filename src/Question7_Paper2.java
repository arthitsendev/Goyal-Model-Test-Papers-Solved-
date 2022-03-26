import java.util.*;
class Question7_Paper2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=new String(),w="";
        char ch=' ',c=' ';
        int i;
        System.out.print("Enter a string=");
        str=sc.nextLine();
        ch=str.charAt(5);
        for(i=0;i<str.length();i++) {
            c=str.charAt(i);
            if(c==ch) {
                c=6;
            }
            w=w+c;
        }
        System.out.print("Modified array="+w);
    }
}
