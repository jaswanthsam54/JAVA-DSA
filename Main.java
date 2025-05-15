import java.util.Scanner;

class Method {
    int add(int a, int b) {
        return a + b;
    }
}

public class Main {
    public static void main(String[] args) {
        Method obj = new Method();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int x = sc.nextInt();

        System.out.print("Enter second number: ");
        int y = sc.nextInt();

        System.out.println("Sum of input numbers is " + obj.add(x, y));
    }
}
