import java.util.*;
class Program2_Paper1 {
    void volume(int a) {
        int vol;
        vol=a*a*a;
        System.out.print("Volume of cube="+vol);
    }
    void volume(int a,int b,int c) {
        int vol;
        vol=a*b*c;
        System.out.print("Volume of a cuboid="+vol);
    }
    public static void main(String[] args) {
        Program2_Paper1 ob=new Program2_Paper1();
        ob.volume(12);
        ob.volume(3,4,6);
    }
}
