import java.util.Scanner;

class NumbersDivisibleBy9{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter three numbers : ");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();

        if(number1 % 9 == 0 && number2 % 9== 0 && number3 % 9 == 0){
            System.out.println("Numbers are completely divisaible by 9.");
        }else{
            System.out.println("all numbers are not divisible.");
        }

    }
}