package rvt;

<<<<<<< HEAD
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
=======
public class Statistics {
    private int count;
    private int sum;

    public Statistics() {

    }
     public void addNumber(int number) {
        count++;
        sum += number;
    }
    public int getCount() {
        return count;
    }
    public int Sum() {
        return sum;
    }
    public double getAverage() {
        return (double) sum / count;
    }
}

>>>>>>> 38b183b77530fe76d08465b0b4d39688144d4a7e
