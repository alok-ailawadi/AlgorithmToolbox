import java.util.*;

public class LCM {
    private static long lcm(long a, long b) {
        //write your code here
        long gcd = gcd_optimum(a,b);
        long temp = a/gcd;
        long lcm =  temp*b;

        return lcm;
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

        System.out.println(lcm(a, b));
    }
}
