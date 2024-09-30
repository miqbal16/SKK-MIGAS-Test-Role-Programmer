import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        var input = new Scanner(System.in);

        System.out.print("Enter n number: ");
        int n = input.nextInt();

        StringBuilder result = new StringBuilder();
        for (int i = 1;  i <= n; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                result.append("OKYES").append(" ");
            } else if (i % 3 == 0) {
                result.append("OK").append(" ");
            } else if (i % 4 == 0) {
                result.append("YES").append(" ");
            } else {
                result.append(i).append(" ");
            }
        }

        System.out.println(result);
    }
}