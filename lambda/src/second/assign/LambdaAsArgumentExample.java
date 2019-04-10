package second.assign;

import blocked.lambda.MathOperation;

public class LambdaAsArgumentExample {
    private static boolean isBig(MathOperation op, int num){
        int result = op.getResult(num);
        return result > 100;
    }

    public static void main(String[] a){
        boolean result = false;
        int val = 5;
        result = isBig((n)-> n*n , val);
        System.out.println(result);
        result =isBig((n)->{
            int f = 1;
            for (int i=0; i< n;i++){
               f = f*i;
            }
            return f;
        },val);
        System.out.println(result);
    }
}
