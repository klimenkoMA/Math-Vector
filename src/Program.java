import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program {

    public static void main(String[] args) throws IOException {

        int N = 10; //1
        int[] a = new int[]{1, 3, -5, 0, 4, 6, -1, 9, 3, 2}; //2
        int m = a[0];//3

        for (int i = 1; i < N; i++)//4
            if (m < a[i])//5
                m = a[i];//6
        System.out.println(m);//7
        int s;//8
        s = sum(a, N);//9
        System.out.println(s);//10
        int z = s / m;//11
        int k = 0;//12
        for (int i = 0; i < N; i++)//13
            if (a[i] > z)//14
                k += a[i];//15
            else//16
                k -= a[i];//17
        System.out.println(k);//18
        int x, y;//19
        x = readInt();//20
        y = readInt();//21
        s = 0;//22
        while ((x != 0)) {//23
            x--;//24
            y--;//25
            s += x + y;//26
        }
        System.out.println(s);//27
    }

    static int sum(int[] x, int N) {//28
        int s = 0;//29
        for (int i = 0; i < N; i++)//30
            s += x[i];//31
        return s;//32
    }

    static int readInt() throws IOException {//33
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));//34
        return Integer.parseInt(reader.readLine());//35
    }
}
