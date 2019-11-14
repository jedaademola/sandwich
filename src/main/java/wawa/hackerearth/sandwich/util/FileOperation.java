package wawa.hackerearth.sandwich.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class FileOperation {

    public static void main(String args[]) {

        String expectedData = "Hello World from fileTest.txt!!!";

        Class clazz = FileOperation.class;
        InputStream inputStream = clazz.getResourceAsStream("/fileTest.txt");
        try {
            String data = readFromInputStream(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String readFromInputStream(InputStream inputStream)
            throws IOException {
        StringBuilder resultStringBuilder = new StringBuilder();
        try (BufferedReader br
                     = new BufferedReader(new InputStreamReader(inputStream))) {
            String line;
            while ((line = br.readLine()) != null) {
                resultStringBuilder.append(line).append("\n");
            }
        }
        return resultStringBuilder.toString();
    }
}
