
/*1. Расчет факториала. На вход программе подается число, на выходе факториал этого
числа. Например:
Input: 4
Output: 24
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Factorial {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(reader.readLine());
        reader.close();
        System.out.println(factorial(input));
    }

    public static String factorial(int n) {
        BigInteger fact = new BigInteger("1");

        if (n < 0) {
            return String.valueOf(0);
        } else

            for (long i = 1; i <= n; i++) {
                BigInteger i1 = BigInteger.valueOf(i);
                fact = fact.multiply(i1);
            }

        return fact.toString();
    }
}

