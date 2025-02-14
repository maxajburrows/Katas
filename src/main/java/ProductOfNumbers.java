import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ProductOfNumbers {
    ArrayList<Integer> numbers;
    public ProductOfNumbers() {
        numbers = new ArrayList<>();
    }

    public void add(int num) {
        numbers.add(num);
    }

    public int getProduct(int k) {
        Integer cutOff = numbers.size() - k;
        int product = 1;
        for (int i = cutOff; i < numbers.size(); i++) {
            product *= numbers.get(i);
        }
        return product;
    }
}
