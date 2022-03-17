import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>(Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4));
        intList.removeIf(n -> n <= 0 || n % 2 != 0);
        intList.sort(Integer::compareTo);
        intList.forEach(System.out::println);
    }
}
