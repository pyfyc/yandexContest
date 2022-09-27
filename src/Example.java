import java.io.*;

public class Example {
    // Example tasks from folder:
    //   C:\Work\SkyPro\Java\Yandex\Example

    public static void taskG() {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        String J = "";
        String S = "";

        try {
            J = r.readLine();
            S = r.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        int result = 0;
        for (int i = 0; i < S.length(); ++i) {
            char ch = S.charAt(i);
            if (J.indexOf(ch) >= 0) {
                ++result;
            }
        }

        System.out.println(result);
    }

    public static void taskB() {
        BufferedReader reader;
        String line = "";
        try {
            reader = new BufferedReader(new FileReader("c:/temp/input.txt"));
            line = reader.readLine();
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            PrintWriter writer = new PrintWriter("c:/temp/output.txt", "UTF-8");
            writer.println(getSum(line));
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void taskA() {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        String inputStr = "";
        try {
            inputStr = r.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(getSum(inputStr));
    }

    public static int getSum(String inputStr) {
        String str1 = inputStr.substring(0, inputStr.indexOf(" "));
        String str2 = inputStr.substring(inputStr.indexOf(" ") + 1);
        return Integer.parseInt(str1) + Integer.parseInt(str2);
    }
}
