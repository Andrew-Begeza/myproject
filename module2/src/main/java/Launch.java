import com.mypack.*;

import java.util.Arrays;
import java.util.Scanner;

public class Launch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Write array length: ");
        System.out.println("\n");
        int x = sc.nextInt();
        int[] arr = new int[x];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Write numbers of array: ");
            arr[i] = sc.nextInt();
            System.out.println("\n");
        }
        System.out.print("Write target: ");
        int target = sc.nextInt();
        System.out.println("\n");
        int[] ind = new int[2];
        ind = TwoSum.twoSum(arr, target);

        System.out.println("Indices: " + Arrays.toString(ind));
    }
}
