import java.util.Scanner;

class Grade {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter The Grade");
        int grade = userInput.nextInt();
        if (grade > 95) {
            System.out.println("A");
        } else if (grade > 85) {
            System.out.println("B");
        } else if (grade > 75) {
            System.out.println("C");
        } else if (grade > 60) {
            System.out.println("D");
        } else {
            System.out.println("You are Fail");
        }
        userInput.close();
    }
}
