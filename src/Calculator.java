/*3. Реализация простейшего калькулятора. Доступны четыре арифметических
действия: сложение (+), умножение (*), деление (/) и вычитание (-). На вход
программе подается строка вида [число][ариф. знак][число], на выходе результат
операции.
Например:
Input: 4+7
Output: 11
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Calculator {

    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        char[] arr = s.toCharArray();
        char num1c = arr[0];
        char op = arr[1];
        String o = op + "";
        char num2c = arr[2];

        String s2 = Character.toString(num1c);
        int num1 = Integer.parseInt(s2);
        String s3 = Character.toString(num2c);
        int num2 = Integer.parseInt(s3);
        int sum = num1 + num2;

        if (o.equals("+")) {
            System.out.println(num1 + num2);
            return;
        } if (o.equals("-")) {
            System.out.println(num1 - num2);
            return;
        } if (o.equals("/")) {
            System.out.println(num1 / num2);
            return;
        } if (o.equals("*")) {
            System.out.println(num1 * num2);
            return;
        }


    }
}