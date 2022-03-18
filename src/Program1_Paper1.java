import java.util.*;
class Program1_Paper1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=new String(),w="";
        int i,f=0;
        char c=' ',first=' ';
        System.out.print("Enter a sentence=");
        str=sc.nextLine();
        str=str.trim();
        str=str+" ";
        str=str.toUpperCase();
        for(i=0;i<str.length();i++) {
            c=str.charAt(i);
            if(c!=' ') {
                w=w+c;
            }
            else {
                first=w.charAt(0);
                if(first=='A') {
                    f++;
                }
                first=' ';
            }
        }
        System.out.print("Total number of words starting with letter A="+f);
    }
}
