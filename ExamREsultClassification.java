import java.util.Scanner;

class ExamResultClassification {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter the marks");
        int marks = s.nextInt();

        if (marks >= 40) {
            if (marks >= 80) {
                System.out.println("GRADE A");
            }
            else if (marks >= 60) {
                System.out.println("GRADE B");
            }
            else {
                System.out.println("GRADE C");
            }
        }
        else {
            System.out.println("You failed");
        }

        s.close();
    }
}
