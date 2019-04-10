package simple;

public class Main {
    public static void main(String[] a){
        GreetingService helloService = () -> System.out.println("Hello");
        GreetingService greetingService = () -> System.out.println("Welcome");

        helloService.sayGreeting();
        greetingService.sayGreeting();

        NumericTest isEven = n -> n%2 == 0;
        NumericTest isPositive = (n) -> n>=0;

        int val = -10;
        if(isEven.test(val)){
            System.out.println("even");
        }else{
            System.out.println("odd");
        }

        if(isPositive.test(val)){
            System.out.println("positive");
        }else{
            System.out.println("negative");
        }

        MathTest addTest = (n,p) -> n+p;
        MathTest subTest= (int n,int p) -> n-p;

        int p = -10;
        int b = 10;
        System.out.println(addTest.test(p,b));
        System.out.println(subTest.test(p,b));
    }

}
