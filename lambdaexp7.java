interface DoubleNumericArrayFunc{
    double func(double[] n) throws EmptyArrayException;
}

class EmptyArrayException extends Exception{
     EmptyArrayException(){
        super("Array Empty");
    }
}


public class lambdaexp7 {
    public static void main(String[] args) throws Exception {
        // Lambda Expression and Exception Handling.
        DoubleNumericArrayFunc average = (n) -> {
            double sum = 0;
            if(n.length==0){
                throw new EmptyArrayException();
            }
            for(int i=0;i<n.length;i++){
                sum+=n[i];
            }
            return sum/n.length;
        };
        double[] values = {1.0,2.0,3.0,4.0};
        System.out.println("The average is "+average.func(values));
        values = new double[0];
        System.out.println("The average is "+average.func(values));
    }
    
}
