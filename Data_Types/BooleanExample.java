public class BooleanExample {
    public static void main(String[] args) {
        boolean isStudent = true; // Only true or false
        boolean isGraduate = false;
        if (isStudent && !isGraduate) {
            System.out.println("Student, not yet graduated");
        } else {
            System.out.println("Not a student or already graduated");
        }
    }
}