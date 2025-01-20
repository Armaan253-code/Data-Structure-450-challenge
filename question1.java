public class question1{
    public static void revArray(int a[]){
        int start=0,end=a.length-1;
        while(start<=end){
            int temp=a[start];
            a[start]=a[end];
            a[end]=temp;
            start++;
            end--;
        }
        for(int i=0;i<a.length;i++){
            System.err.print(a[i]+" ");
        }
    }
    public static void main(String args[]){
        int a[]={12,13,15,17,20,23,27};
        revArray(a);
    }
}