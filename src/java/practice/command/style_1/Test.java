package practice.command.style_1;

public class Test {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        int result = calculator.calculate(new AddCommand(1,2));
        System.out.println("result: "+result);

    }
}
