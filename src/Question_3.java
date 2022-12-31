import java.util.Scanner;

public class Question_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int marks_1 = sc.nextInt();
        int marks_2 = sc.nextInt();
        int marks_3 = sc.nextInt();
        int total_marks = marks_1 + marks_2 + marks_3;
        int percentage = (total_marks/3);
        System.out.println(total_marks);
        System.out.println(percentage + "%");

    }
}
