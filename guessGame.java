import java.util.Scanner;
public class guessGame {
    public  static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N = (int)(Math.random()*(100-1) + 1);
        int T = 8;
        while(T-->0) {
            System.out.print("Guess a number (from 1 to 100) : ");
            int U = sc.nextInt();
            if(U == N) {
                System.out.println("Your guess is right:)");
                break;
            }
            else if(U > N) {
                if(U - N >= 10) {
                    System.out.println("Your guess is too high");
                    if(T>0){
                    System.out.println("Try Again...");}
                }
                else {
                    System.out.println("Your guess is a bit high");
                    if(T > 0) {
                        System.out.println("Try Again...");
                    }
                }
            }
            else {
                if(N -U >= 10) {
                    System.out.println("Your guess is too low");
                    if(T > 0) {
                        System.out.println("Try Again...");
                    }
                }
                else {
                    System.out.println("Your guess is bit low");
                    if(T > 0) {
                        System.out.println("Try Again...");
                    }
                }
            }
        }
        System.out.println("GAME OVER:)");
        System.out.print("The correct number was : " + N);
    }
}