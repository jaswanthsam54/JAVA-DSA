public class CharExample {
    public static void main(String[] args) {
        char grade = 'A'; // Single character in single quotes
        char nextGrade = (char) (grade + 1); // Next character in Unicode
        System.out.println("Grade: " + grade);
        System.out.println("Next grade: " + nextGrade); // Output: B
    }
}