
interface output {
    int add(int a, int b);
}
public class lambdaexp4 {
    public static void main(String[] args) {
        // Lambda expression with Multiple parameter.
        output view = (a, b) -> {
            System.out.print(a +"+"+b + "=" );
            return a+b;
        };
        System.out.println(view.add(10, 20));
       

    }
    
}
