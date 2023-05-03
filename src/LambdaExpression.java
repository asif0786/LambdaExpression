
public class LambdaExpression {
    @FunctionalInterface
    interface IMathFunction{
        int calculate(int a, int b);
        static void printResult(int a, int b, String function,IMathFunction fobj){
            System.out.println("Result of "+function+" is "+fobj.calculate(a,b));
        }
    }

    public static void main(String[] args) {

    }
}
