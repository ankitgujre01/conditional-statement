import java.util.Scanner;

class PrintThreeEquals{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter 3 number :");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();

        if(number1 == number2 && number2 == number3 && number3 == number1){
            System.out.println("all number are equal.");
        }else if (number1 == number2 || number1 == number3 || number2 == number3) {
            System.out.println("two equals, one different");
        }
        else{
            System.out.println("not equals.");
        }
    }
}