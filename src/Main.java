import java.util.Scanner;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите слово: ");
        String scan = scanner.nextLine();

        consumer.accept(scan);
    }

    static Consumer<String> consumer = new Consumer<String>() {
        @Override
        public void accept(String s) {

            char[] ch = s.toCharArray();
            int b = ch.length;

            for (int i = b - 1; i >= 0; i--) {
                System.out.print(ch[i]);
            }
        }


    };
}