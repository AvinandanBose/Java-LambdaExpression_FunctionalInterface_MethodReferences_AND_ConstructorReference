interface MySum2 {
    int add(int a, int b);
}
class SumN {
    int Sum(int a, int b) {
        return a+b;
    }
}

public class MethodRef3 {
    int add(MySum2 sum,int a, int b) {
        System.out.println("A val="+a+" "+"B val="+b+" "+(a+b));
        return sum.add(a, b);
    }

    public static void main(String[] args) {
        MethodRef3 methodRef3 = new MethodRef3();
        SumN sumN = new SumN();
        MySum2 mySum2 = sumN::Sum;
        System.out.println(mySum2.add( 10, 20));
        System.out.println(methodRef3.add(mySum2, 10, 20));
        System.out.println(methodRef3.add(mySum2::add, 40, 50));
        
    }
    
}
