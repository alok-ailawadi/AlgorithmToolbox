import java.util.*;

public class FibonacciLastDigit {
    private static int getFibonacciLastDigit(int n) {
        if(n==0)
            return 0;
        int fib[] = new int[n+1];
        fib[0] = 0;
        fib[1] =1;

        for (int i = 2; i <= n; i++) {
            fib[i] = fib[i-1]%10 + fib[i-2]%10;
           // System.out.print(fib[i]+": ");
        }

        return fib[n]%10;
    }

    private static long calc_fib_optimized(int n)
    {
        if(n==0)
            return 0;
        long fib[] = new long[n+1];
        fib[0] = 0;
        fib[1] =1;
        for (int i = 2; i <= n; i++) {
            fib[i] = fib[i-1] + fib[i-2];
            //System.out.print(fib[i]+" ");
        }

        return fib[n]%10;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long c = getFibonacciLastDigit(n);
        System.out.println(c);
        //for stress test
       /* int n =0;
        while (true) {
            n = (new Random()).nextInt(80);
            long c = getFibonacciLastDigit(n);
            long d = calc_fib_optimized(n);
            if (d != c) {
                System.out.println("The result is not equal for n= " + n);
                System.out.println("c: " + c);
                System.out.println("d: " + d);
            }
            System.out.println(c);
        }*/
    }
}

