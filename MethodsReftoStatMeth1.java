

interface Addition{
    int add(int a, int b);
}

class AdditionImpl {
   static int add(int a, int b){
        return a+b;
    }
}


public class MethodsReftoStatMeth1 {
    static int summation(Addition addition, int a, int b){
        return addition.add(a, b);
    }
    public static void main(String[] args) {
        //Method Reference by creating instance of functional interface
        Addition addition = AdditionImpl::add;
        System.out.println(addition.add(10, 20));

        // Passing Method Reference as Argument.

        Integer sum = summation(AdditionImpl::add, 40, 50);
        System.out.println(sum);
    }
}
       
 

    

