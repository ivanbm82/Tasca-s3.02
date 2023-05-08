package nivell3;

import java.util.ArrayList;
import java.util.List;

public class NumberProcessor {
    private List<Integer> numbers;

    public NumberProcessor(List<Integer> numbers) {
        this.numbers = numbers;
    }

    public List<Integer> getNumbers() {
        return numbers;
    }

    public void setNumbers(List<Integer> numbers) {
        this.numbers = numbers;
    }

    public int getMin() {
        if (numbers == null || numbers.isEmpty()) {
            throw new IllegalStateException("List of numbers is null or empty");
        }
        int min = numbers.get(0);
        for (int i = 1; i < numbers.size(); i++) {
            if (numbers.get(i) < min) {
                min = numbers.get(i);
            }
        }
        return min;
    }

    public int getMax() {
        if (numbers == null || numbers.isEmpty()) {
            throw new IllegalStateException("List of numbers is null or empty");
        }
        int max = numbers.get(0);
        for (int i = 1; i < numbers.size(); i++) {
            if (numbers.get(i) > max) {
                max = numbers.get(i);
            }
        }
        return max;
    }

    public int getSum() {
        int sum = 0;
        for (int i = 0; i < numbers.size(); i++) {
            sum += numbers.get(i);
        }
        return sum;
    }

    public double getAverage() {
        if (numbers == null || numbers.isEmpty()) {
            throw new IllegalStateException("List of numbers is null or empty");
        }
        int sum = getSum();
        return (double) sum / numbers.size();
    }

    public List<Integer> getEvenNumbers() {
        List<Integer> evenNumbers = new ArrayList<>();
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) % 2 == 0) {
                evenNumbers.add(numbers.get(i));
            }
        }
        return evenNumbers;
    }

    public List<Integer> getOddNumbers() {
        List<Integer> oddNumbers = new ArrayList<>();
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) % 2 != 0) {
                oddNumbers.add(numbers.get(i));
            }
        }
        return oddNumbers;
    }
}
