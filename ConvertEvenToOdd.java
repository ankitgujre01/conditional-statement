import java.util.*;

class ConvertEvenToOdd{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number : ");
        int number = scanner.nextInt();

        if(number % 2 == 0){
            number += 1;
            System.out.println("Odd.");
            System.err.println("after modify "+ number);
        }else{
            number += 1;
            System.out.println("even.");
            System.err.println("after modify "+ number);
        }
    }
}