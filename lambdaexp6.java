

interface Number {
    int add(int a, int b)throws MyOwnException;
}

class MyOwnException extends Exception{
    public MyOwnException(String s){
        super(s);
    }
}
public class lambdaexp6 {

   
    public static void main(String[] args) throws Exception {
        // Lambda Expression and Exception Handling.
        Number view = (a, b) -> {
            System.out.print(a +"+"+b + "=" );
            if(a+b>10){
                throw new MyOwnException("Exception Occured");
            }
            return a + b;
        };
        System.out.println(view.add(5, 3));
        System.out.println(view.add(10,20));
    }
    
}
