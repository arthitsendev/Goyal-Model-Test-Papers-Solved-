class Question3_Paper3 {
    public static void main(String[] args) {
        String str[]={"Delhi","Bangalore","Agra","Mumbai","Calcutta"},st="";
        int asc[]=new int[5],i,j,t;
        for(i=0;i<5;i++) {
            asc[i]=(int)str[i].charAt(0);
        }
        for(i=0;i<4;i++) {
            for(j=0;j<4-i;j++) {
                if(asc[j]>asc[j+1]) {
                    t=asc[j];
                    st=str[j];
                    asc[j]=asc[j+1];
                    str[j]=str[j+1];
                    asc[j+1]=t;
                    str[j+1]=st;
                }
            }
        }
        for(i=0;i<5;i++) {
            System.out.print(str[i]+" ");
        }
    }
}
