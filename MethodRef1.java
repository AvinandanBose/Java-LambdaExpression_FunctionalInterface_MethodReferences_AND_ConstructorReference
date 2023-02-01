interface MySum{
    int add(int a, int b);
}
public class MethodRef1 {
    int add(int a, int b){
        return a+b;
    }
    public static void main(String[] args) {
        MethodRef1 methodRef1 = new MethodRef1();
        MySum mySum= methodRef1::add;
        System.out.println(mySum.add(10, 20));
    }
    
}
