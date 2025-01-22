public class question6_intersection {
    public static void intersection(int[] a, int[] b, int n, int m) {
        int i = 0, j = 0;

        System.out.print("Intersection: ");
        while (i < n && j < m) {
            if (a[i] < b[j]) {
                i++;
            } else if (b[j] < a[i]) {
                j++;
            } else { // a[i] == b[j]
                System.out.print(a[i] + " ");
                i++;
                j++;
            }
        }

        System.out.println();
        System.out.print("Remaining elements in A: ");
        while (i < n) {
            System.out.print(a[i++] + " ");
        }

        System.out.println();
        System.out.print("Remaining elements in B: ");
        while (j < m) {
            System.out.print(b[j++] + " ");
        }
    }

    public static void main(String[] args) {
        int[] a = {1, 3, 5, 7};
        int[] b = {2, 3, 4, 5};
        int n = a.length;
        int m = b.length;

        intersection(a, b, n, m);
    }
}
