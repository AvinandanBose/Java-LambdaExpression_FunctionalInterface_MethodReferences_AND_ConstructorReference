interface MySum4 {
    int add(int a, int b);
}
public class MethodRef5 {
    static int add(MySum4 mysum4,int a, int b) {
        System.out.println("A val=" + a + " " + "B val=" + b + " " + (a + b));
        return mysum4.add(a, b);

        }
    public static void main(String[] args) {
        MySum4 mySum4 = (a, b) -> a + b;
        System.out.println("Without calling  the add method of MySum4 interface, it will generate output");
        System.out.println(add(mySum4, 10, 20));
        System.out.println("It will call the add method of MySum4 interface and then generate output ");
        System.out.println(add(mySum4::add, 10, 20));
        }
    }
    
