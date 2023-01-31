//Functional Interface
interface output{  
    float view();  
}

public class Lambdaexp1
 {
    public static void main(String[] args){
        // Returns a constant value.
        output view=()->123.45f;
        System.out.println(view.view());

        
    }  
    
}
