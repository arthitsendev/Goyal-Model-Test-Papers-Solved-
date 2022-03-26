import java.util.*;
class Question2_Paper2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=new String(),w="";
        char c=' ',ch=' ';
        int i;
        System.out.print("Enter a string=");
        str=sc.nextLine();
        str=str.trim();
        str=str+" ";
        ch=str.charAt(4);
        for(i=0;i<str.length();i++) {
            c=str.charAt(i);
            if(c==ch) {
                c='5';
            }
            w=w+c;
        }
        System.out.print("Modified string= "+w);
    }
}
