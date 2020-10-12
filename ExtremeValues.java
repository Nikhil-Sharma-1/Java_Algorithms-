import java.util.Collections;
import java.util.ArrayList;

class Main {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);


        int min = Collections.min(numbers);
        System.out.println("Minimum Element: " + min);


        int max = Collections.max(numbers);
        System.out.println("Maximum Element: " + max);
    }
}