import java.util.*;

public class GCD {
    private static long gcd(long a, long b) {
        long current_gcd = 1;
        for(long d = 2; d <= a && d <= b; ++d) {
            if (a % d == 0 && b % d == 0) {
                if (d > current_gcd) {
                    current_gcd = d;
                }
            }
        }

        return current_gcd;
    }

    private static long gcd_optimum(long a, long b)
    {
        // we prove it by way of gcd(a,b)=gcd(b,a)=gcd(a,b-na)
        long largerNo = 0;
        long smallerNo = 0;
        if(b>a)
        {
            largerNo=b;
            smallerNo=a;
        }else
        {
            largerNo=a;
            smallerNo=b;
        }
        //double divideVal = largerNo/smallerNo;




        while(smallerNo!=largerNo && smallerNo!=0)
        {
            long  intpart = (long) Math.floor(largerNo/smallerNo);
            if (intpart==0)
                intpart=1;

            long temp = smallerNo;
            smallerNo = largerNo - smallerNo*intpart;
            largerNo = temp;

        }

        return largerNo;
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextLong();
        long b = scanner.nextLong();
        long newgcd = gcd_optimum(a, b);
        System.out.println(newgcd);
      /* stress testing block
      while (true) {
          long a = (new Random()).nextInt(1000)+1;
          long b = (new Random()).nextInt(1000)+1;
          long newgcd = gcd_optimum(a, b);
          long pregcd = gcd(a, b);

          if (pregcd != newgcd) {
              System.out.println("gcd calculated not equal for a: " + a + " and b: " + b);
              System.out.println(pregcd);
              System.out.println(newgcd);
              //break;
          }
      }*/


    }
}
