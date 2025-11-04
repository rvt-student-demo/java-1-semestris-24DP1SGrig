package rvt;

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

