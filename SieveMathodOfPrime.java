import java.util.*;

public class Main {

    boolean[] sieveOfEratosthenes(int max) {
        boolean[] flags = new boolean[max + 1];

        Arrays.fill(flags, true);

        flags[0] = false;
        flags[1] = false;

        int prime = 2;

        while (prime < Math.sqrt(max)) {

            crossOff(flags, prime);

            prime = getNextPrime(flags, prime);
        }

        return flags;
    }

    void crossOff(boolean[] flags, int prime) {

        for (int i = prime * prime; i < flags.length; i = i + prime) {
            flags[i] = false;
        }
    }

    int getNextPrime(boolean[] flags, int prime) {

        int next = prime + 1;

        while (next < flags.length && !flags[next]) {
            next++;
        }

        return next;
    }

    public static void main(String[] args) {

        Main m = new Main();

        boolean[] result = m.sieveOfEratosthenes(9);

        System.out.println(Arrays.toString(result));

        for (int i = 0; i < result.length; i++) {
            if (result[i]) {
                System.out.print(i + " ");
            }
        }
    }
}