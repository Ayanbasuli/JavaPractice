import java.util.Scanner;

class Conditional {

    public static void main(String[] args) {
        System.out.println("Enter the age:");
        Scanner ageUser = new Scanner(System.in);
        int age = ageUser.nextInt();
        if (age < 18) {
            System.out.println("You are dont have acccess");
        } else if (age >= 18) {
            System.out.println("You are have access");
        } else {
            System.out.println("Enter The Number");
        }
        ageUser.close();
    }
}
