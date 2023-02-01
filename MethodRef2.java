interface MySum1 {
    int add(int a, int b);
}
public class MethodRef2 {
    int add(MySum1 sum,int a, int b) {
        System.out.println("A val="+a+" "+"B val="+b+" "+(a+b));
        return sum.add(a, b);
    }

    public static void main(String[] args) {
        MethodRef2 methodRef2 = new MethodRef2();
       
        MySum1 mySum1 = (a, b) -> a + b;
        System.out.println(mySum1.add( 10, 20));
        System.out.println(methodRef2.add(mySum1, 10, 20));
        System.out.println(methodRef2.add(mySum1::add, 10, 20));
    }
}
