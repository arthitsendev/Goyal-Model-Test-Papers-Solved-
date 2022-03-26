class Question4_Paper3 {
    void compare(int i,int j) {
        int gr=Math.max(i,j);
        System.out.println(gr);
    }
    void compare(char i,char j) {
        int gr=Math.max((int)i,(int)j);
        System.out.println(gr);
    }
    void compare(String i,String j) {
        int gr=Math.max(i.length(),j.length());
        System.out.println(gr);
    }
    public static void main(String[] args) {
        Question4_Paper3 ob=new Question4_Paper3();
        ob.compare(45,67);
        ob.compare('A','X');
        ob.compare("Hello","Programming");
    }
}
