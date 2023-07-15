import java.util.Scanner;

public class MaximumSubarray {
    static int findmaxSubarray(int A, int B, int[] C){
        int maxSum = 0, sum = 0, i = 0;
        for(int j = 0; j < A; j++){
            sum += C[j];
            while (sum>B){
                sum-=C[i];
                i++;
            }
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("A: ");
        int A = scanner.nextInt();
        int C[] = new int[A];
        System.out.print("B: ");
        int B = scanner.nextInt();
        System.out.print("C: ");
        for(int i = 0; i < A; i++){
            C[i] = scanner.nextInt();
        }
        System.out.println(findmaxSubarray(A,B,C));
    }
}
