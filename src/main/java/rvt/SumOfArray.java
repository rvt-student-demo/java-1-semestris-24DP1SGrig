package rvt;

public class SumOfArray {
    public static void main(String[] args) {
        int[] numbers = {5, 1, 3, 4, 2};
        sumOfNumbersInArray(numbers);
    }
    public static int sumOfNumbersInArray(int[] array) {
        Integer sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println(sum);
        return sum;
    }
}
