import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter calculation: ");
        String inputStr = input.nextLine();

        Calculator calc = new Calculator(inputStr);
   
        System.out.println("Result: " + calc.calculate());

        input.close();
    }
}
