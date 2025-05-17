class SumCalculator {
    int[] arr = {1, 4, 5};
    int sum = 0;

    public void calculateSum() {
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
    }

    public void displaySum() {
        System.out.println("Sum: " + sum);
    }
}
public class sum {
    public static void main(String[] args) {
        SumCalculator obj = new SumCalculator();
        obj.calculateSum();
        obj.displaySum();
    }
}
