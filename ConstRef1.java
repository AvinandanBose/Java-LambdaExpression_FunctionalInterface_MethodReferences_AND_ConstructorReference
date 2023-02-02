//ConstructorReference :: 

interface MyFunc {
    MyClass func(int a, int b);
}

class MyClass {
    MyClass(int a, int b) {
        System.out.println("a =" + a + "b=" + b);
    }
}

public class ConstRef1 {
    public static void main(String[] args) {
        MyFunc f = MyClass::new;
        MyClass mc = f.func(10, 20);
    }
}