# Java: Lambda Expression ,Functional Interfaces AND Method Reference

<h1></h1>
<h1 align="Center">1.  Lambda Expression </h1>
<h3>Lambda expression in Java was included in Java SE 8. A lambda expression is, essentially, an anonymous (that is, unnamed) method. However, this method is not executed on its own. Instead, it is used to implement a method defined by a functional interface. Thus, a lambda expression results in a form of anonymous class. Lambda expressions are also known as closures in some other languages.</h3>

<h3> <i> '->' </i> is known as lambda operator or the arrow operator.</h3>

<h3>It divides lamda expression into two parts.</h3>

<h3><i><ins>Left side of Lambda Expression</ins></i> : It contains Parameters.</h3>

<h3><i><ins>Right side of Lambda Expression</ins></i> : It is known as 'lambda body', which specifies the actions of the lambda expression.</h3>

<h3>The '->' can be verbalized as "becomes" or "goes to" .</h3>

<h3>There are two types of lamda bodies : 1) One consists of a single expression, and 2) And other type is block of code. </h3>

<h1></h1>
<h1 align="Center">2.  Functional Interfaces </h1>

<h3>A <i> functional interface</i> is an interface that contains one and only one abstract method .Normally this method specifies the intended purpose of the interface.
Thus, a functional interface typically represents a single action. </h3>

```Syntax

Syntax:

interface MyNumber{  
    double getValue();  
}

MyNumber view=()-> returns 123.45;

which actually resembles:

double myMeth(){

   return 123.45;
}

where ,
interface MyNumber{double getValue();}

:is Functional Interface:

:AND:

(parameter)-> return val; 

:is Lambda function and return single value only:
:But it doesnot have a Block and Body :

:A Lambda function with body and block looks like:

(parameter)->{ //Start of a block

   :Here we can write more than one statement :
   :And Execute Them Before Return:
   
    return val; --> Return Statement
    
} //End of a block

```

<h1></h1>
<h1 align="Center"> Returns a Constant Value</h1>
<ul>
<h3><li><a href = "https://github.com/AvinandanBose/Java-LambdaExpression/blob/main/Lambdaexp1.java" > Example : Returns a Constant Value </a></li></h3>

```Syntax

Below is functional interface:

interface output{  
    float view();  
}

Returns a single value only:

output view=()->123.45f;

Returns a single value with executing :
Multiple Lines of Code: 

output view=()->{

 :Executes multiple lines of code inside block:
 
    returns 123.45f;

};

```

</ul>


<h1></h1>
<h1 align="Center">Lambda Expression With Single Parameter</h1>
<ul>

<h3><li><a href = "https://github.com/AvinandanBose/Java-LambdaExpression/blob/main/Lambdaexp2.java" > Example : Lambda Expression With Single Parameter </a></li></h3>

```Syntax

Below is functional interface With Single Parameter:

interface output {
    double getValue(double n);
}

Returns a single value only:

output view = (a) -> Math.random() * a;

Returns a single value with executing :
Multiple Lines of Code: 

output view=(a)->{

 :Executes multiple lines of code inside block:
 
    returns Math.random() * a;

};


```

</ul>

<h1></h1>
<h1 align="Center">Lambda Expression With Multiple Parameter</h1>
<ul>

<h3><li><a href = "https://github.com/AvinandanBose/Java-LambdaExpression/blob/main/Lambdaexp4.java" > Example : Lambda Expression With Multiple Parameter </a></li></h3>

```Syntax

Below is functional interface With Multiple Parameter:

interface output {
    int add(int a, int b);
}

Returns a constant value :

output view = (a, b) -> {

         :Block of code:
         
            return a+b;
        };
        

```

</ul>


<h1></h1>
<h1 align="Center">Passing Lambda Expression as Argument.</h1>
<ul>

<h3><li><a href = "https://github.com/AvinandanBose/Java-LambdaExpression/blob/main/Lambdaexp5.java" > Example : Passing Lambda Expression as Argument. </a></li></h3>

```Syntax

Below is functional interface With Multiple Parameter:

interface output {
    int add(int a, int b);
}

Passing Lambda Exp as argument:

static int Add(output a,int b, int c){
        return a.add( b,c) ;
    }

Returns a constant value :

int view = Add((a, b) -> {
            System.out.print(a +"+"+b + "=" );
            return a + b;
        },10,20);
        

```

</ul>

<h1></h1>
<h1 align="Center">Lambda Expressions and Exceptions</h1>
<ul>
<h3><li><a href = "https://github.com/AvinandanBose/Java-LambdaExpressionAndFunctionalInterfaces/blob/main/lambdaexp6.java" > Example : Lambda Expressions and Exceptions-1 </a></li></h3>

```Syntax

interface Number {
    int add(int a, int b)throws MyOwnException;
}

class MyOwnException extends Exception{
    public MyOwnException(String s){
        super(s);
    }
}

:Here MyOwnException is Custom UserDefined Exception:
:Which inherits Exception class(java.lang.Exception) :
:And delivers a Message Upon Exception occurs: 

:Exception Condition here is:

 if(a+b>10)
 
:And it is thrown inside Lambda function:

Number view = (a, b) -> {
            System.out.print(a +"+"+b + "=" );
            if(a+b>10){
                throw new MyOwnException("Exception Occured");
            }
            return a + b;
        };


```

<h3><li><a href = "https://github.com/AvinandanBose/Java-LambdaExpressionAndFunctionalInterfaces/blob/main/lambdaexp7.java" > Example : Lambda Expressions and Exceptions-2 </a></li></h3>

```Syntax

:Same as Above:

:Here condition is:

if(n.length==0)

:And then it throws EmptyArrayException:
:Which is a Custom UserDefined Exception :
:As Above:


```

</ul>

<h1></h1>
<h1 align="Center">Lambda Expressions and Variable Capture</h1>

<ul>
<h3>When a lambda expression uses a local variable from its enclosing scope, a special situation is created that is referred to as a <i><ins>variable capture</ins></i>.In this case, a lambda expression may only use local variable that are <i><ins>effectively final</ins></i>. An <i><ins>effectively final</ins></i> variable is one whose value doesnot change after its first assigned. There is no need to explicitly declare such a variable as <i><ins>final</ins></i>, although doing so would not be an error. </h3>

<h3><li><a href = "https://github.com/AvinandanBose/Java-LambdaExpressionAndFunctionalInterfaces/blob/main/lambdaexp8.java" > Example : Lambda Expressions and Variable Capture </a></li></h3>

```Syntax

interface MyFunc{
    int func(int n);
}

public class lambdaexp8 {
    public static void main(String[] args){
        int num=10;

        MyFunc myLambda = (n) -> {
            int v = num + n;
            // num++; // Error → num is effectively final:
            return v;
        };
        // num = 9; // Error → num is effectively final:
        System.out.println( myLambda.func(10));
    }
}

```

</ul>

<h1></h1>
<h1 align="Center">3.  Method References </h1>
<ul>
<li><h3>1 . A method reference provides a way to refer a method without executing it.</h3></li>
<li><h3>2. A method reference relates to lambda expressions , since it, too requires a target type context of a compatible functional interface.</h3></li>
<li><h3>3. When evaluated, a method reference also creates an instance of the functional interface.</h3></li>
    
<h1></h1>
<h1 align="Center">Method References to static Methods</h1> 

<h3>To create a <i>static</i> method reference , we use this general syntax: </h3>

<h3 align="Center">
    
```Syntax 
   
ClassName::methodName   
    
```

</h3>

<h3><li><a href = "https://github.com/AvinandanBose/Java-LambdaExpression_FunctionalInterface_AND_MethodReferences/blob/main/MethodsReftoStatMeth1.java" > Example : Method References to static Methods </a></li></h3>

```Syntax

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
        Addition addition = AdditionImpl::add;
        System.out.println(addition.add(10, 20));
        Integer sum = summation(AdditionImpl::add, 40, 50);
        System.out.println(sum);
    }
}

Here in the above eg:
Addition addition → We create instance of Functional Interface
AdditionImpl::add → ClassName::methodName

And passing Method Reference as argument:
Integer sum = summation(AdditionImpl::add, 40, 50);

:As the above function returns an Integer , hence we need:
:an Integer variable here to store the returned value.:

```

</h3>
    
</ul>

<h1></h1>
<h1 align="Center">Method References to Instance Methods</h1> 

<h3>To pass a reference to an instance method on a specific object, use this basic syntax:</h3>

<h3 align="Center">
    
```Syntax 
   
objRef::methodName   
    
```

</h3>

<ul>
<h3><li><a href = "https://github.com/AvinandanBose/Java-LambdaExpression_FunctionalInterface_AND_MethodReferences/blob/main/MethodsReftoStatMeth2.java" > Example : Method References to Instance Methods </a></li></h3>

```Syntax

interface Addition{
    int add(int a, int b);
}
class AdditionImpl {
     int addition(int a, int b){
        return a+b;
    }
}

public class MethodsReftoStatMeth2 {
    
     int summation(Addition addition, int a, int b) {
        return addition.add(a, b);
    }

    public static void main(String[] args) {
        AdditionImpl additionImpl = new AdditionImpl();
        MethodsReftoStatMeth2 methodsReftoStatMeth2 = new MethodsReftoStatMeth2();

        :Method References to Instance Methods ,Here additionImpl is an object:
        Addition addition = additionImpl::addition;

        System.out.println(addition.add(10, 20));

        :Passing ,Method References to Instance Methods as Argument:
        Integer sum = methodsReftoStatMeth2.summation(additionImpl::addition, 40, 50);
        System.out.println(sum);
        
    
    }  

}


```

</ul>

</h3>

<h1></h1>
<h1 align="Center">Most Simple Way to Study Method Reference</h1> 
<ul>
<h3><i>1. Using Static</i></h3>
<ul>
<h3><li><a href = "https://github.com/AvinandanBose/Java-LambdaExpression_FunctionalInterface_AND_MethodReferences/blob/main/MethodRef4.java" > Example : 1 </a></li></h3>
    
```Syntax
    
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
    
:Here MySum3 is Functional interface:
:mysum3 is instance of Functional interface MySum3:
:As MySum3 is Functional Interface , therefore it needs reference to a Function:
:i.e. MySum3 mySum3 = Reference to a Function:
:Hence Method References to static Methods is used i.e.:
:MySum3 mySum3 = MethodRef4::add:
:And then the instance of functional interface is ready to call the add function: 
    
```

<h3><li><a href = "https://github.com/AvinandanBose/Java-LambdaExpression_FunctionalInterface_AND_MethodReferences/blob/main/MethodRef5.java" > Example : 2 </a></li></h3>

```Syntax
    
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
         System.out.println(mySum4.add(10, 20));
        System.out.println(add(mySum4, 10, 20));
        System.out.println(add(mySum4::add, 10, 20));
        }
    }
    

    
:Here MySum4 is Functional interface:
:mysum4 is instance of Functional interface MySum4:
:As MySum4 is Functional Interface , therefore it needs reference to a Function:
:i.e. MySum4 mySum4 = Reference to a Function:
:But here instance of Functional interface is passed as parameter:
:i.e. static int add(MySum4 mysum4,....){....}:
:Hence MySum4 mySum4 = MethodRef5::add will lead to error.:
:To overcome the above problem we have used Lambda Function.:
:i.e. MySum4 mySum4 = (a, b) -> a + b; Refered to function of Functional interface.:
:i.e. Property of Lambda Function.:
:And then the instance of functional interface is ready to call the add function:
:Also Now, we can either pass instance of Functional interface as argument in MethodRef5.add():
:i.e. add(mySum4,....):
:Or,Method Reference to Static Method can be passed as an argumnet in add() func of MethodRef5 class.:
:i.e. add(mySum4::add,....):
    
```

<h3><li><a href = "https://github.com/AvinandanBose/Java-LambdaExpression_FunctionalInterface_AND_MethodReferences/blob/main/MethodRef6.java" > Example : 3 </a></li></h3>

```Syntax
    
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


    
:Here MySum3 is Functional interface:
:mysum3 is instance of Functional interface MySum3:
:As MySum3 is Functional Interface , therefore it needs reference to a Function:
:i.e. MySum3 mySum3 = Reference to a Function:
:Here we have a Class SumN which obtain a function Sum.:
:Hence sumN::Sum can be passed as reference.:
:i.e. MySum3 mySum3 = sumN::Sum;:
:i.e. Sum function of sumN class must define the add function of Functional interface MySum3:
:Having same type of parameter and same amount of parameters , else will cause error:
:Just like properties of Lambda Function.:
:And then the instance of functional interface is ready to call the add function:
:Also Now, we can either pass instance of Functional interface as argument in MethodRef6.add():
:i.e. add(mySum3,....):
:Or,Method Reference to Static Method can be passed as an argumnet in add() func of MethodRef6 class.:
:i.e. add(mySum3::add,....):
    
```

    
</ul>
<h3><i>2. Using Instance</i></h3>
<h3><i><ins>Note:</ins></i>As static is not used here , hence we need to create instance of each class to access everything of Class(Members of class)</i></h3>
<ul>
<h3><li><a href = "https://github.com/AvinandanBose/Java-LambdaExpression_FunctionalInterface_AND_MethodReferences/blob/main/MethodRef1.java" > Example : 1 </a></li></h3>
    
<h3><li><a href = "https://github.com/AvinandanBose/Java-LambdaExpression_FunctionalInterface_AND_MethodReferences/blob/main/MethodRef2.java" > Example : 2 </a></li></h3>

<h3><li><a href = "https://github.com/AvinandanBose/Java-LambdaExpression_FunctionalInterface_AND_MethodReferences/blob/main/MethodRef3.java" > Example : 3 </a></li></h3>
<h3><i><ins>Note:</ins></i>Explanation of above examples remain same as static . Just instance /object of class is used to gain access.</i></h3>
</ul>

<h1></h1>
<h1 align="Center">4.Constructor References</h1> 
