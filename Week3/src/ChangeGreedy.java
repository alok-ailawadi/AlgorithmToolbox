import java.util.Scanner;

public class ChangeGreedy {
    private static int getChange(int n) {
        final int TEN=10;
        final int FIVE=5;
        final int ONE=1;
        int numberOfCoins=0;
        int diff=n;
        while (diff>=TEN)
        {
            numberOfCoins++;
            diff=diff-TEN;
        }
        while (diff>=FIVE)
        {
            numberOfCoins++;
            diff=diff-FIVE;
        }
        while (diff>=ONE)
        {
            numberOfCoins++;
            diff=diff-ONE;
        }


        return numberOfCoins;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        System.out.println(getChange(n));


    }
}

