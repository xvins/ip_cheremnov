/*4. Утилита для копирования файлов. На вход программе подается имя копируемого
файла и имя для конечного файла. Дополнительные условия:
•на консоль должно выводиться время, потраченное на копирование файла;
•алгоритм копирования должен быть наиболее оптимальным.
*/

import java.io.*;

public class CopyFile {

    public static void main(String[] args) throws IOException {

        long start = System.nanoTime();
        File source = new File("c:/sourcefile.txt");
        File dest = new File("c:/destfile.txt");
        start = System.nanoTime();
        copyStream(source, dest);
        System.out.println("Time taken by Stream Files Copy = "+(System.nanoTime()-start));
    }


    private static void copyStream(File source, File dest) throws IOException {
        InputStream is = null;
        OutputStream os = null;
        try {
            is = new FileInputStream(source);
            os = new FileOutputStream(dest);
            byte[] buffer = new byte[1024];
            int length;
            while ((length = is.read(buffer)) > 0) {
                os.write(buffer, 0, length);
            }
        } catch (IOException e) {
            System.out.println(e.getStackTrace());
        }
    }

}
