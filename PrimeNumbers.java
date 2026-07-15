import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many numbers? ");
        int n = sc.nextInt();

        System.out.println("Enter the numbers:");

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            boolean prime = true;

            if (num <= 1)
                prime = false;
            else {
                for (int j = 2; j <= Math.sqrt(num); j++) {
                    if (num % j == 0) {
                        prime = false;
                        break;
                    }
                }
            }

            if (prime)
                System.out.println(num + " is Prime");
        }
    }
}