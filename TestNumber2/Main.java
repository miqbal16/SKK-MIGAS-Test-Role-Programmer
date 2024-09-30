import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter n number: ");
        int n = input.nextInt();

        subTest1(n);
        subTest2(n);
        subTest3(n);
        subTest4(n);
    }

    public static void subTest1(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

    public static void subTest2(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = i; j > 0; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void subTest3(int n) {
        int count = 1;
        boolean isAscending = true;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(count);
                if (isAscending) {
                    if (count >= 5) {
                        isAscending = false;
                        count--;
                        continue;
                    }
                    count++;
                } else {
                    if (count <= 1) {
                        isAscending = true;
                        count++;
                        continue;
                    }
                    count--;
                }
            }
            System.out.println();
        }
    }

    public static void subTest4(int n) {
        int[][] result = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j == 0) {
                    result[i][j] = i + 1;
                } else if (j == 1) {
                    result[i][j] = 10 - i;
                } else if (j == 2) {
                    result[i][j] = 11 + i;
                } else if (j == 3) {
                    result[i][j] = 20 - i;
                } else {
                    result[i][j] = 21 + i;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            StringBuilder line = new StringBuilder();
            for (int j = 0; j < n; j++) {
                line.append(result[i][j]).append(" ");
            }
            System.out.println(line.toString().trim());
        }
    }
}