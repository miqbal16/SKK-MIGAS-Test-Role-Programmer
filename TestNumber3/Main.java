import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int[] n = {12, 9, 13, 6, 10, 4, 7, 2};
        ArrayList<Integer> newArray = new ArrayList<>();

        for (int value : n) {
            if (value % 3 != 0) {
                newArray.add(value);
            }
        }
        newArray.sort(Integer::compareTo);
        System.out.println(newArray);
    }
}