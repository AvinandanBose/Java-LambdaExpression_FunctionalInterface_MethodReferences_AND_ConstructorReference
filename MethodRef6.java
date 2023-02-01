interface MySum3 {
    int add(int a, int b);
}

class SumN {
    int Sum(int a, int b) {
        System.out.println("A val=" + a + " " + "B val=" + b + " " + (a + b));
        return a + b;
    }
}
public class MethodRef6 {
    static int add(MySum3 sum, int a, int b) {
        System.out.println("A val=" + a + " " + "B val=" + b + " " + (a + b));
        return sum.add(a, b);
    }

    public static void main(String[] args) {
        SumN sumN = new SumN();
        MySum3 mySum3 = sumN::Sum;
        System.out.println(mySum3.add(10, 20));
        System.out.println(add(mySum3, 10, 20));
        System.out.println(add(mySum3::add, 40, 50));
    }

    
}
