import java.util.ArrayList;


public class ProductOfNumbers {
    int[] numbers;
    int size;
    public ProductOfNumbers() {
        numbers = new int[40000];
        size = 0;
    }

    public void add(int num) {
        numbers[size] = num;
        size++;
    }

    public int getProduct(int k) {
        int cutOff = size - k;
        int product = 1;
        for (int i = cutOff; i < size; i++) {
            product *= numbers[i];
        }
        return product;
    }
}
