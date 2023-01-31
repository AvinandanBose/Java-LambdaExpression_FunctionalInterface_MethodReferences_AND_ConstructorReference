interface output {
    int add(int a, int b);
}

public class lambdaexp5 {

    static int Add(output a,int b, int c){
        return a.add( b,c) ;
    }

    public static void main(String[] args) {
        // Passing Lambda Expression as Argument.
        int view = Add((a, b) -> {
            System.out.print(a +"+"+b + "=" );
            return a + b;
        },10,20);

        System.out.println(view);
    }
}
   