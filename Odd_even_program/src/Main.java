import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Boolean prime = true;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any number : ");
        int num = input.nextInt();
        if(num%2==0){
            System.out.println("Even number");
        }
        else {
            System.out.println("Odd number");
        }
    }
}