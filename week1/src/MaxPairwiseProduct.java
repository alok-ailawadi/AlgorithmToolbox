import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;
import java.util.StringTokenizer;


/**
 * Created by Alok on 3/25/2016.
 */
public class MaxPairwiseProduct {

    static long getMaxPairwiseProduct(long[] numbers) {
        long result;
        long maxno = numbers[0];
        long secondMaxno = 0;
        int n = numbers.length;
        for (int i = 1; i < n; i++) {
            if (numbers[i] > secondMaxno) {
                if (numbers[i] > maxno) {
                    secondMaxno = maxno;
                    maxno = numbers[i];

                } else {
                    secondMaxno = numbers[i];
                }
            }

        }
        result = maxno * secondMaxno;
        return result;
    }

    //alternate method for stress test
   /* static long getMaxPairwiseProductBig(long[] numbers) {
        long result = 0;
        int n = numbers.length;
        for (int i = 0; i < n; ++i) {
            for (int j = i + 1; j < n; ++j) {
                if (numbers[i] * numbers[j] > result) {
                    result = numbers[i] * numbers[j];
                }
            }
        }
        return result;
    }*/

    public static void main(String[] args) {
        FastScanner scanner = new FastScanner(System.in);
        int n = scanner.nextInt();
        long[] numbers = new long[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextLong();
        }

        long result1 = getMaxPairwiseProduct(numbers);
        System.out.println(result1);

        //For stress test
       /* int min = 2;
        while(true) {
            int n = min + (new Random()).nextInt(1000);

            long[] numbers = getNumberArray(n);

            long result1 = getMaxPairwiseProduct(numbers);




            if (result1 != result2) {
                System.out.println("There is some error for numbers");
                break;
            }
        }*/

    }

    //generating random numbers for stress test
    private static long[] getNumberArray(int n) {
        long[] numbers = new long[n];
        Random randomGenerator = new Random();
        for (int i = 0; i < n; i++) {
            numbers[i] = randomGenerator.nextInt(100000);

        }
        return numbers;

    }
    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        FastScanner(InputStream stream) {
            try {
                br = new BufferedReader(new InputStreamReader(stream));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }
    }

}
