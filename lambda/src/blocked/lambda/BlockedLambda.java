package blocked.lambda;

public class BlockedLambda {
    public static void main(String[] a){
        MathOperation factor = n -> {
            int fact = 1;
            for(int i = 1;i<=n;i++){
                fact = fact * i;
            }
            return fact;
        };

        MathOperation sumOpr = n -> {
            int sum = 1;
            for(int i = 1;i<=n;i++){
                sum = sum + i;
            }
            return sum;
        };

        int val = 5;
        System.out.println("factorial:"+factor.getResult(val));
        System.out.println("factorial:"+sumOpr.getResult(val));
    }
}
