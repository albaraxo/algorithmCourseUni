package Lab1;
// Albara Abuamsnoor 2240096
public class Exercise_2 {
    public static int Euclid(int m, int n) {

        while (n != 0) {  // Step 1
            int r = m % n; // Step 2
            //step 3
            m = n;
            n = r;
        }
        return m;
    }
    public static void main(String[] args) {
        System.out.println(Euclid(48, 18));
        System.out.println(Euclid(112, 196));
    }
}
