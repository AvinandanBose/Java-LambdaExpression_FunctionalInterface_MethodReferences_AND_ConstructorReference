interface MyFunc{
    int func(int n);
}

public class lambdaexp8 {
    public static void main(String[] args){
        int num=10;

        MyFunc myLambda = (n) -> {
            int v = num + n;
            // num++; // Error: num is effectively final.
            return v;
        };
        // num = 9; // Error: num is effectively final.
        System.out.println( myLambda.func(10));
    }
}
