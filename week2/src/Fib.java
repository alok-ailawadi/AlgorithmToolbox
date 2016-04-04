import java.util.Scanner;

public class Fib {
    private static long calc_fib(int n) {
        if (n <= 1)
            return n;

        return calc_fib(n - 1) + calc_fib(n - 2);
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
        }
        return fib[n];


    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        long optAns = calc_fib_optimized(n);
        System.out.println(optAns);
        // for stress test
       /* long lngAns = calc_fib(n);
        if(optAns != lngAns)
        {
            System.out.println("Fibonacci number do not meed for : " + "n");
        }

        System.out.println(optAns);*/
    }
}
