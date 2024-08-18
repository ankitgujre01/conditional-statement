import java.util.Scanner;
class PrintPositive{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter integer : ");
        int number = scanner.nextInt();

        if(number > 0){
            System.out.println("positive");
        }else{
            System.out.println("Negative");
        }
    }
}