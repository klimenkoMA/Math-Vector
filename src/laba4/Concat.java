package laba4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Concat {
    public static void main(String[] args) throws IOException {
        List<String> s = new ArrayList<>();
        System.out.println("Введите пожалуйста строки: ");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String stroke;

        while (!(stroke = reader.readLine()).equals("конец")){
            s.add(stroke);
        }
        String result = doConcat(s);
        System.out.println(result);

    }

    public static String doConcat(List<String> s) {
        StringBuilder result = new StringBuilder();
        for (String text : s
        ) {
            text = text.replace("\n", "");
            text = text.replace(" ","");
            char[] chars = text.toCharArray();
            for (char c : chars
            ) {
                result.append(c);
            }
        }
        return result.toString();
    }
}
