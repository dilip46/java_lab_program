import java.util.Scanner;

class SumNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter how many numbers: ");
        int n = sc.nextInt();

        int sum = 0;

        System.out.println("Enter the numbers:");
        for (int i = 1; i <= n; i++) {
            sum += sc.nextInt();
        }

        System.out.println("Sum = " + sum);

        sc.close();
    }
}