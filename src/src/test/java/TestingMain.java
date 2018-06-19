import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args){

        Calculator calculator = new Calculator();

        int a = 7;
        int b = 4;
        int result = 11;
        int result1 = 16;


        System.out.println("TEST addition");
        if(calculator.add(a,b)==result){
            System.out.println("It equals: " + a + " + " + b + " = " + result);
        }else{
            System.out.println("It not equals: " + a + " + " + b + " != " + result);
        }

        System.out.println("TEST subtraction");
        if(calculator.subtraction(a,b)==result1){
            System.out.println("It equals: " + a + " - " + b + " = " + result1);
        }else{
            System.out.println("It not equals: " + a + " - " + b + " != " + result1);
        }

    }

}