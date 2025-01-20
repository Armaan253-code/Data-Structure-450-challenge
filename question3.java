import java.util.*;
public class question3 {
   public static void kthsmallest(Integer a[], int k){
        Arrays.sort(a);
        System.out.println(a[k-1]);
    }
    public static void kthlargest(Integer a[], int l){
        Arrays.sort(a,Collections.reverseOrder());
        System.out.print(a[l-1]);

    }
    public static void main(String args[]){
        Integer a[]={22,11,45,67,89,90};
        int k=2;
        int l=3;
        kthsmallest(a,k);
        kthlargest(a, l);
    }
    
}
