public class ShortExample {
    public static void main(String[] args) {
        short year = 2025; // Valid range: -32,768 to 32,767
        short nextYear = (short) (year + 1); // Cast needed for arithmetic
        System.out.println("Current year: " + year);
        System.out.println("Next year: " + nextYear); // Output: 2026
    }
}