
public class Advance {
    private String[] number;

    public Advance(String input) {
        this.number = input.split(" ");
    }
    public double calculate() {
        double result = Double.parseDouble(number[0]);
        for (int i = 1; i < number.length; i += 2) {
            String operator = number[i];
            double num = Double.parseDouble(number[i + 1]);
            switch (operator) {
                case "+":
                    result += num;
                    break;
                case "-":
                    result -= num;
                    break;
                case "*":
                    result *= num;
                    break;
                case "/":
                    if (num == 0) {
                        System.out.println("Cannot divide by zero!");
                    }
                    result /= num;
                    break;
                default:
                    System.out.println("Invalid operator: " + operator);
            }
        }
        return result;
    }

    
}
