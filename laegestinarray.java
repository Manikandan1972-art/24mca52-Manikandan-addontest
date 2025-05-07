package addontest;



public class laegestinarray {
    public static int findSecondLargest(int[] arr) {
        int large = Integer.MIN_VALUE;
        int secondLarge = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > large) {
                secondLarge = large;
                large = num;
            } else if (num > secondLarge && num != large) {
                secondLarge = num;
            }
        }

        return secondLarge;
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 50, 30, 40};
        int result = findSecondLargest(arr);
        System.out.println("Second largest element = " + result);
    }
}
