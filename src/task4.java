import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class task4 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите любой текст(пустую строку отправлять нельзя)");
        try {
            String result = reader.readLine();
            if(result.equals("")) throw new RuntimeException("Пустую строку вводить нельзя");

            System.out.println(result);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
