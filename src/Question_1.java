import java.util.Scanner;
import java.util.SplittableRandom;

public class Question_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String first_name = sc.next();
        String last_name = sc.next();
        int roll_number = sc.nextInt();
        String field_of_interest = sc.next();
        System.out.println("Name:" +first_name +last_name);
        System.out.println("Roll no: "+roll_number);
        System.out.println("Field of interest: " +field_of_interest);


    }
}
