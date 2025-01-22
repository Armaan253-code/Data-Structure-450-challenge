public class question6_union {
    public static void pUnion(int []a, int []b,int n,int m){
        int i=0,j=0;
        while(i<n & j<m){
            if(a[i]<b[j])
            System.out.print(a[i++]+" ");
            else if(b[j]<a[i])
            System.out.print(b[j++]+" ");
            else{
                System.out.print(b[j++]+" ");
                i++;
            }
        }
        while(i<n)
        System.out.print(a[i++]);
        while(j<m)
        System.out.print(b[j++]);
        }
    public static void main(String args[]){
        int []a={1,3,5,7};
        int []b={2,3,4,5};
        int n=a.length;
        int m=b.length;
        pUnion(a,b,n,m);
    }
    
}
