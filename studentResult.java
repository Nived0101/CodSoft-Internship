import java.util.Scanner;
public class studentResult {
    public static void main(String args[]) {
        System.out.print("Enter your marks in Maths : ");
        Scanner sc = new Scanner(System.in);
        float Maths = sc.nextFloat();
        System.out.print("Enter your marks in English : ");
        float English = sc.nextFloat();
        System.out.print("Enter your marks in Physics : ");
        float Physics = sc.nextFloat();
        System.out.print("Enter your marks in Chemistry : ");
        float Chemistry = sc.nextFloat();
        float obtainedMarks = (float)(Maths + Physics + English + Chemistry);
        System.out.println("your obtained marks are : " + obtainedMarks);
        System.out.print("Your total marks are : " );
        float totalMarks = sc.nextFloat();
        float percentage =  (float)(obtainedMarks * 100 / totalMarks);
        System.out.println("Your percentage is : " + percentage);
        if(percentage >= 80) {
            System.out.println("You score the grade : A");
        }
        else if(percentage >= 65) {
            System.out.println("You score the grade : B");
        }
        else if(percentage >= 50) {
            System.out.println("You score the grade : C");
        }
        else if(percentage >= 33) {
            System.out.println("You score the grade : D");
        }
        else {
            System.out.println("Better luck next time :-)");
        }
        sc.close();
    }
}