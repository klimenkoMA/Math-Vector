package laba3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) throws IOException {

        BufferedReader reader1 = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader reader2 = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите координату х: ");
        int x = Integer.parseInt(reader1.readLine());
        System.out.println("Введите координату y: ");
        int y = Integer.parseInt(reader2.readLine());

        int result = counting(x, y);

        System.out.println("Точка находится в области номер " + result);
    }

    public static int counting(int x, int y){
        int rad = FatherRound.R;
        if (x > rad && y > rad){
            return 1;
        }else if (x > -rad/2 && y > -rad/2){
            return 2;
        }else
            return 3;

    }
}
