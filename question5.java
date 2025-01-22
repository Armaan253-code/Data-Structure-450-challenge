public class question5 {
    public static void rearrange(int[] a) {
        int[] t = new int[a.length];
        int j = 0;

        // Collect positive numbers
        for (int i = 0; i < a.length; i++) {
            if (a[i] >= 0) {
                t[j++] = a[i];
            }
        }

        // Collect negative numbers
        for (int i = 0; i < a.length; i++) {
            if (a[i] < 0) {
                t[j++] = a[i];
            }
        }

        // Copy back to the original array
        for (int i = 0; i < a.length; i++) {
            a[i] = t[i];
        }
    }

    public static void main(String[] args) {
        int[] a = {1, -1, 3, 2, -7, -5, -11};
        rearrange(a);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
