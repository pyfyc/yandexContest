import java.io.*;

public class Main {
    // 2022/09/06
    // Real contest tasks from folder:
    //   C:\Work\SkyPro\Java\Yandex\Contest

    public static void main(String[] args) {
        taskA();
    }

    // Task A. Совпадение? Не думаю
    public static void taskA() {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        String A = "";
        String B = "";

        try {
            System.out.print("Введите 1-ю строку: ");
            A = r.readLine();
            System.out.print("Введите 2-ю строку: ");
            B = r.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        int[] flagArray = new int[A.length()];
        char matchType;

        for (int i = 0; i < B.length(); i++) {
            matchType = 'I';
            char ai = A.charAt(i);
            char bi = B.charAt(i);
            if (ai == bi) {
                matchType = 'P';
                flagArray[i] = 1;
            } else {
                for (int j = 0; j < A.length(); j++) {
                    if (flagArray[j] == 1) {
                        continue;
                    }
                    char aj = A.charAt(j);
                    char bj = B.charAt(j);
                    if (aj == bi && aj != bj) {
                        matchType = 'S';
                        flagArray[j] = 1;
                        break;
                    }
                }
            }
            System.out.print(matchType);
        }
    }
}