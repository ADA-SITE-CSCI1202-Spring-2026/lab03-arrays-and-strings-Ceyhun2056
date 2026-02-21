import java.util.Scanner;
public class Exercise2 {
    //A
    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

//B
    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
//C
    public static int[] findMinMax(int[] arr) {
        int min = arr[0];
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) min = arr[i];
            if (arr[i] > max) max = arr[i];
        }

        return new int[]{min, max};
    }

    public static void main(String[] args) {
        // b(i)
        if (args.length > 0) {
            int[] cmdArray = new int[args.length];
            for (int i = 0; i < args.length; i++) {
                cmdArray[i] = Integer.parseInt(args[i]);
            }
            System.out.println("From Command Line:");
            System.out.println("Min: " + findMin(cmdArray));
            System.out.println("Max: " + findMax(cmdArray));
            int[] result = findMinMax(cmdArray);
            System.out.println("Both (Min, Max): " + result[0] + ", " + result[1]);
            System.out.println();
        }
    //b(ii)
        Scanner input = new Scanner(System.in);

        System.out.print("Enter: ");
        int n = input.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        System.out.println("Input:");
        System.out.println("Minimum: " + findMin(arr));
        System.out.println("Maximum: " + findMax(arr));
        int[] result = findMinMax(arr);
        System.out.println("Both (Min, Max): " + result[0] + ", " + result[1]);
        input.close();
    }
}