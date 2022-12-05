import java.util.Scanner;

public class recursivePrimeNumber {
    static void prime() {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int a = input.nextInt();
        int i = 2;
        int sum = 0;
        while (i < a) {
            if (a % i == 0) {
                sum += i;
            }
            i++;
        }
        if (sum == 0) {
            System.out.println(a + " asal bir sayıdır!");
        } else {
            System.out.println(a + "  asal bir sayı değildir!");
        }
    }
    public static void main(String[] args) {
        prime();
    }
}
