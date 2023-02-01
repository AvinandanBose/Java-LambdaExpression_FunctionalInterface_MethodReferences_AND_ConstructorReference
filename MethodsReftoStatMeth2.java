
interface Addition{
    int add(int a, int b);
}
class AdditionImpl {
     int addition(int a, int b){
        return a+b;
    }
}

public class MethodsReftoStatMeth2 {
    // objRef::methodName
     int summation(Addition addition, int a, int b) {
        return addition.add(a, b);
    }

    public static void main(String[] args) {
        AdditionImpl additionImpl = new AdditionImpl();
        MethodsReftoStatMeth2 methodsReftoStatMeth2 = new MethodsReftoStatMeth2();

        
        Addition addition = additionImpl::addition;

        System.out.println(addition.add(10, 20));

        Integer sum = methodsReftoStatMeth2.summation(additionImpl::addition, 40, 50);
        System.out.println(sum);
    
    }  

}

