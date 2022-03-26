class Question4_Paper2 {
    public static void main(String[] args) {
        int arr[]={2,5,4,1,3},i,s=0,t,j;
        for(i=0;i<4;i++) {
            for(j=0;j<5-i-1;j++) {
                if(arr[j]>arr[j+1]) {
                    t=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=t;
                }
            }
        }
        for(i=0;i<5;i++) {
            s=s+arr[i];
        }
        System.out.println("Minimum value="+arr[0]);
        System.out.println("Maximum value="+arr[5]);
        System.out.print("Sum of the elements="+s);
    }
}
