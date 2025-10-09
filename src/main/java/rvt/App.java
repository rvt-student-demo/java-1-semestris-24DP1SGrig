package rvt;

public class App {

    public static void main(String[] args) {
        ex1();
        ex2();
        ex3();
    }
    public static void ex1() {
        int[] val = {0, 1, 2, 3}; 
        int sum = 0;
        for (int i = 0; i < val.length; i++) {
            sum += val[i];
        }
        System.out.println( "Sum of all numbers = " + sum );
    }
    public static void ex2() {
        int[] val = {13, -4, 82, 17}; 
        int[] twice = new int[val.length];
        for (int i = 0; i < val.length; i++) {
            twice[i] = val[i] * 2;
        }
        System.out.println( "Original Array: " + val[0] + " " + val[1] + " " + val[2] + " " + val[3] );
        System.out.println( "New Array: " + twice[0] + " " + twice[1] + " " + twice[2] + " " + twice[3] );
    }
    public static void ex3() {
        int[] valA   = { 13, -22,  82,  17}; 
        int[] valB   = {-12,  24, -79, -13};
        int[] sum    = {  0,   0,   0,   0};
        for (int i = 0; i < valA.length; i++) {
            sum[i] = valA[i] + valB[i];
        }
        System.out.println( "sum: " + sum[0] + " " + sum[1] + " " + sum[2] + " " + sum[3] );
    }
}
