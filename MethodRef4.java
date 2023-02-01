interface MySum3 {
    int add(int a, int b);
}

public class MethodRef4 {
    static int add(int a, int b) {
        System.out.println("A val=" + a + " " + "B val=" + b + " " + (a + b));
        return a + b;
    }

    public static void main(String[] args) {
        MySum3 mySum3 = MethodRef4::add;
        System.out.println(mySum3.add(10, 20));
    }
}