
/*2. Поиск количества вхождений слова в тексте. На вход программе подается имя
файла с текстом и слово, на выходе число вхождений данного слова в тексте.
Например:
Input: c:\some_text.txt test
Output: 25
*/

import java.io.*;
import java.util.Scanner;

public class CountOfSpecificWord {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int count = 0;
        String data = reader.readLine();
        String[] fileAndWord = data.split(" ");
        BufferedReader reader2 = new BufferedReader(new FileReader(fileAndWord[0]));

        while (reader2.ready()) {
            String s = reader2.readLine();

            if (s.equals(fileAndWord[1])) {
                count++;
            }
        }
        System.out.println(count);
    }
}




