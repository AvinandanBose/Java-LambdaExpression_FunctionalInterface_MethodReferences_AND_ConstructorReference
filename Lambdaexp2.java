
interface output {
    double getValue(double n);
}
public class Lambdaexp2 {

    public static void main(String[] args) {
        // Lambda expression with single parameter.
        output view = (a) -> Math.random() * a;
        System.out.println(view.getValue(100.05f));
    }
    
}
