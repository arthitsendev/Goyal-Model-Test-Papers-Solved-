import java.util.*;
class Question2_Paper3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=new String(),w="";
        int i;
        char c=' ',f=' ';
        System.out.print("Enter a sentence=");
        str=sc.nextLine();
        str=str.trim();
        str=str+" ";
        for(i=0;i<str.length();i++) {
            c=str.charAt(i);
            if(c!=' ') {
                w=w+c;
            }
            else {
                f=w.charAt(0);
                System.out.print(f+" ");
                f=' ';
            }
        }
    }
}
