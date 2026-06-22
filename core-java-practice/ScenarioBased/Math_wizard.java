import java.util.Scanner;

public class Math_wizard {

    public boolean isPrime(int n) {
        if (n <= 1)
            return false;

        for (int i = 2; i < n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public int fact(int num) {
        int fact = 1;

        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }

        return fact;
    }

    public int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        return a;
    }

    public int fibonacci(int n) {
        if (n == 0)
            return 0;

        if (n == 1)
            return 1; 

        int fn = 0;
        int sn = 1;
        int sum = 0;

        for (int i = 2; i <= n; i++) {
            sum = fn + sn;
            fn = sn;
            sn = sum;
        }

        return sum;
    }

    public int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    public int power(int a, int b) {
        int result = 1;

        for (int i = 1; i <= b; i++) {
            result *= a;
        }

        return result;
    }

    public static void main(String[] args) {

        Math_wizard mathwizard = new Math_wizard();
        Scanner sc = new Scanner(System.in);

        System.out.println("========= Math Wizard =========");
        System.out.println("1. Check Prime");
        System.out.println("2. Factorial");
        System.out.println("3. GCD");
        System.out.println("4. Fibonacci");
        System.out.println("5. LCM");
        System.out.println("6. Power");

        System.out.print("Enter Choice : ");
        int choice = sc.nextInt();

        switch (choice) {

            case 1:
                System.out.print("Enter Number : ");
                int n = sc.nextInt();

                if (mathwizard.isPrime(n))
                    System.out.println(n + " is Prime");
                else
                    System.out.println(n + " is Not Prime");
                break;

            case 2:
                System.out.print("Enter Number : ");
                int num = sc.nextInt();

                System.out.println("Factorial = " + mathwizard.fact(num));
                break;

            case 3:
                System.out.print("Enter First Number : ");
                int a = sc.nextInt();

                System.out.print("Enter Second Number : ");
                int b = sc.nextInt();

                System.out.println("GCD = " + mathwizard.gcd(a, b));
                break;

            case 4:
                System.out.print("Enter Position : ");
                int pos = sc.nextInt();

                System.out.println("Fibonacci = " + mathwizard.fibonacci(pos));
                break;

            case 5:
                System.out.print("Enter First Number : ");
                int x = sc.nextInt();

                System.out.print("Enter Second Number : ");
                int y = sc.nextInt();

                System.out.println("LCM = " + mathwizard.lcm(x, y));
                break;

            case 6:
                System.out.print("Enter Base : ");
                int base = sc.nextInt();

                System.out.print("Enter Power : ");
                int power = sc.nextInt();

                System.out.println("Result = " + mathwizard.power(base, power));
                break;

            default:
                System.out.println("Invalid Choice");
        }
    }
}