import java.util.Scanner;
class PrintEqual{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number : ");
        int number1 = scanner.nextInt();

        System.out.println("Enter second Number : ");
        int number2 = scanner.nextInt();

        if(number1 == number2){
            System.out.println("Equals.");
        }else{
            System.out.println("Not Equals.");
        }
    }
}