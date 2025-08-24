public class ByteExample {
    public static void main(String[] args) {
        byte smallNum = 100; // Valid range: -128 to 127
        byte anotherNum = 20;
        byte sum = (byte) (smallNum + anotherNum); // Cast needed for arithmetic
        System.out.println("Byte value: " + smallNum);
        System.out.println("Sum: " + sum); // Output: 120
    }
}