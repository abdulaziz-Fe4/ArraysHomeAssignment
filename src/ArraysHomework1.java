public class ArraysHomework1 {
    public static void main(){
        int[] num = {1, 2, 0, -3, -4, 12, -9, -6};
        int r = 0;
        System.out.print("Original: ");
        for(int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }
        System.out.println();
        System.out.print("Modified: ");
        for (int i = 0; i < num.length; i++) {
            if (num[i] < 0) {
                System.out.print(0 + " ");
                r++;
            } else {
                System.out.print(num[i] + " ");
            }
        }
        System.out.println();
        System.out.println("Replacements: "+r);
    }
}
