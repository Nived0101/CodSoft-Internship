import java.util.Scanner;
public class ATMInterface {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int currentBalance = 101010;
        System.out.print("Enter your Account number: ");
        int accNum = sc.nextInt();
        System.out.print("Enter your Password: ");
        String pass = sc.next();
        if(accNum == 0001 && pass.equals("Nived123")) {
            System.out.println("Press 1. Menu");
            System.out.println("Press 2. Exit");
            System.out.print("Enter your input: ");
            int choice = sc.nextInt();
            if(choice == 1) {
                while (true) {
                    System.out.println("1. Check Balance");
                    System.out.println("2. Withdraw Money");
                    System.out.println("3. Deposit Money");
                    System.out.println("4. Exit");
                    System.out.print("Enter your choice: ");
                    int userInput = sc.nextInt();

                    if(userInput == 1) {
                        System.out.println("Your current balance is: " + currentBalance);
                    }
                    else if(userInput == 2) {
                        System.out.println("You can withdraw up to 5000.");
                        System.out.print("Enter the amount to withdraw: ");
                        int withdrawAmount = sc.nextInt();
                        if(withdrawAmount > 5000) {
                            System.out.println("Please enter an amount within the limit.");
                        } else if (withdrawAmount > currentBalance) {
                            System.out.println("Insufficient balance.");
                        } else {
                            currentBalance -= withdrawAmount;
                            System.out.println("After withdrawal, the available balance is: " + currentBalance);
                        }
                    }
                    else if(userInput == 3) {
                        System.out.print("Enter the amount you want to deposit: ");
                        int depositMoney = sc.nextInt();
                        currentBalance += depositMoney;
                        System.out.println("Your money has been deposited.");
                        System.out.println("The available balance after deposit is: " + currentBalance);
                    }
                    else if(userInput == 4) {
                        System.out.println("Exiting...");
                        break;
                    } else {
                        System.out.println("Invalid Choice.");
                    }
                }
            }
            else if(choice == 2) {
                System.out.println("Exiting...");
            }
            else {
                System.out.println("Invalid Choice.");
            }
        } else {
            System.out.println("Invalid Account Number OR Password.");
            System.out.println("Try Again...");
        }
        sc.close();
    }
}