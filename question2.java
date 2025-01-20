public class question2 {
    
    public static void main(String args[]){
        int a[]={2,3,4,5,6,7};
        int max,min;
        if(a[0]>a[1]){
            max=a[0];
            min=a[1];    
        }else{
            max=a[1];
            min=a[0];
        }
        for(int i=2;i<a.length;i++){
            if(max<a[i]){
                max=a[i];
            }
            else if(a[i]<min){
                min=a[i];
            }
        }
        System.err.print("maximum element is"+" "+max+" "+"minimum element is"+" "+min);
    }
}
