
public class Main {
    public static void main(String[] args) {
        Addition addObj = new Addition();
        Subtraction subObj = new Subtraction();
      Multiply mulObj = new Multiply();

        int num1 = 11, num2 = 5;

        int sum = addObj.addition(num1, num2);
        int diff = subObj.subtract(num1, num2);
        int mul = mulObj.multiply(num1,num2);

        System.out.println("Addition result: " + sum);
        System.out.println("Subtraction result: " + diff);
      System.out.println("Multiplication result: " + mul);
    }
}
