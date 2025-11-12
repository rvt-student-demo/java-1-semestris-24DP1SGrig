package rvt;

import java.util.ArrayList;

public class Statistics {

    private int count;
    private ArrayList<Integer> numbers = new ArrayList<Integer>();
    private int sum;

    public Statistics() {
    }

    public void addNumber(int number) {
        numbers.add(number);
        count += 1;
    }

    public int getCount() {
        return count;
    }

    public int sum() {
        sum = 0;
        for (int i = 0; i < numbers.size(); i++) {
            sum += numbers.get(i);
        }
        return sum;
    }

    public double average() {
        sum = 0;
        for (int i = 0; i < numbers.size(); i++) {
            sum += numbers.get(i);
        }
        return sum * 1.0 / numbers.size();
    }
}
