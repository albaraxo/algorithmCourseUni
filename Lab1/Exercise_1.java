package Lab1;
// Albara Abumansoor 2240096
public class Exercise_1 {
    public static void main(String[] args) {
        int m = 412230;
        int n = 9845865;
        System.out.println("the GCD of " + m + " & " + n + " is: " + findGCD(m,n));
        long[] times = new long[10];

        for (int i = 0; i < 10; i++) {
            long startTime = System.nanoTime();
            findGCD(m, n);
            long endTime = System.nanoTime();
            times[i] = endTime - startTime;
            System.out.println("Execution " + (i + 1) + ": " + times[i] + " nanoseconds");
        }

        long total = 0;
        for (long time : times) {
            total += time;
        }
        System.out.println("Average time in nano: " + (total / 10) + " nanoseconds");
        double averageTimeMillis = (total /10) / 1_000_000.0;
        System.out.println("Average time in milliseconds: " + averageTimeMillis + " milliseconds");
    }


    public static int findGCD(int m, int n) {
        // step 1
        int min = findMin(m, n);
        int array[] = new int[min];
        //step 2
        int index = 0;
        for (int i = 1; i <= min; i++) {
            if (n % i == 0 && m % i == 0) {
                array[index] = i;
                index++;
            }
        }
        // step 3
        return array[index - 1];
    }

    public static int findMin(int m, int n){
        if(m > n){
            return n;
        }
        else {
            return m;
        }
    }
}